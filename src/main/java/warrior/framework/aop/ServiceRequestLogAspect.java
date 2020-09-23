package warrior.framework.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

/**
 * 
 * 服务请求日志切面
 * 
 * @author yaobj
 * @date Sep 10, 2020 11:26:35 AM
 * 
 *
 */
@Component
@Aspect
@Order(value = 1)
public class ServiceRequestLogAspect {

	@Pointcut(value = "execution(* warrior.bean.HelloWorld.hello(..))")
	public void printLog() {

	}

	@Before(value = "printLog()")
	public void beforeServiceRequest() {

		System.out.println("服务调用开始...");
	}

	@After(value = "printLog()")
	public void afterServiceRequest() {

		System.out.println("服务调用结束...");
	}

	@Around(value = "printLog()")
	public void aroundServiceRequest(ProceedingJoinPoint joinPoint) throws Throwable {

		Object[] args = joinPoint.getArgs();
		for (Object object : args) {
			System.out.println("接口参数：+" + object.toString());
		}
		joinPoint.proceed();

	}
}
