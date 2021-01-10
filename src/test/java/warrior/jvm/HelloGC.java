package warrior.jvm;

public class HelloGC {

	public static void main(String[] args) throws InterruptedException {

		Thread.sleep(Long.MAX_VALUE);
		System.out.println("hello GC");
	}

}

