package warrior.bean;

import org.springframework.stereotype.Component;

@Component
public class Person {

	private String name = "Borje";

	private int age = 28;

	public String getName() {

		return name;
	}

	public void setName(String name) {

		this.name = name;
	}

	public int getAge() {

		return age;
	}

	public void setAge(int age) {

		this.age = age;
	}

	@Override
	public String toString() {

		return "Person [name=" + name + ", age=" + age + "]";
	}

}
