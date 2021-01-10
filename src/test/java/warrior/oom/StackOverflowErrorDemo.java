package warrior.oom;

public class StackOverflowErrorDemo {

	// -Xms10m -Xmx10m
	
	public static void test() {
		test();
	}
	
	
	public static void main(String[] args) {

		test();
	}

	

}

