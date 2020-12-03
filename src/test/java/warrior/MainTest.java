package warrior;

import warrior.datastructure.ArrayQuene;

public class MainTest {

	public static void main(String[] args) {

		ArrayQuene arrayQuene = new ArrayQuene(10);

		for (int i = 0; i < 11; i++) {
			arrayQuene.put(i + "");
			System.out.println(arrayQuene.toString());
		}

		for (int i = 0; i < 5; i++) {
			arrayQuene.get();
			System.out.println(arrayQuene.toString());
		}

		for (int i = 0; i < 11; i++) {
			arrayQuene.put(i + "");
			System.out.println(arrayQuene.toString());
		}

		for (int i = 0; i < 5; i++) {
			arrayQuene.get();
			System.out.println(arrayQuene.toString());
		}

	}

}
