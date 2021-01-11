package warrior.oom;

import java.lang.reflect.Method;

import org.springframework.cglib.proxy.Enhancer;
import org.springframework.cglib.proxy.MethodProxy;


/**
 * 
 * TODO(描述这个类的作用) 
 * @author 姚斌杰
 * @date 2021年1月10日 下午1:08:11 
 * 
 *
 */
public class MetaSpaceErrorDemo {

	
	//-XX:MetaspaceSize=5m -XX:MaxMetaspaceSize=5m;
	static class MetaSpaceErrorTest {}
	public static void main(String[] args) {

		int i = 0;
		while(true) {
			
			i++;
			Enhancer enhancer = new Enhancer();
			
			enhancer.setSuperclass(MetaSpaceErrorTest.class);
			enhancer.setUseCache(false);
			enhancer.setCallback(new org.springframework.cglib.proxy.MethodInterceptor() {
				
				public Object intercept(Object arg0, Method arg1, Object[] arg2, MethodProxy arg3) throws Throwable {
					
					return arg3.invokeSuper(arg0, arg2);
				}
			});
			
			enhancer.create();
		}
		
	}
	

}

