package warrior;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.borje.warrior.bean.HelloWorld;

public class MainTest {

	private static ApplicationContext applicationContext;

	public static void main(String[] args) {
		applicationContext = new ClassPathXmlApplicationContext("spring-applicationContext.xml");
		HelloWorld helloWorld = applicationContext.getBean(HelloWorld.class);
		helloWorld.hello();
	}

}
