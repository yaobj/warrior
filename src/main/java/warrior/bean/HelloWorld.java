package warrior.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class HelloWorld {

	@Autowired
	private Person person;

	public void hello(String name) {

		System.out.println(person.toString());
		System.out.println("hello world !!!" + name);
	}
}
