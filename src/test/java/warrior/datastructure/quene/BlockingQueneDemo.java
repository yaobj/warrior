package warrior.datastructure.quene;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class BlockingQueneDemo {

	public static void main(String[] args) {

		BlockingQueue<String> blockingQueue = new ArrayBlockingQueue<String>(2);

		boolean success1 = blockingQueue.add("a");
		System.out.println(success1);
		blockingQueue.add("b");
		//		blockingQueue.add("C");

		String ss = blockingQueue.remove();
		System.out.println(ss);

		// *********
		boolean success2 = blockingQueue.offer("a");
		System.out.println(success2);
		blockingQueue.offer("b");
		System.out.println(blockingQueue.offer("C"));
		String ss1 = blockingQueue.poll();
		System.out.println(ss1);

		//****************

		try {
			blockingQueue.put("嘿嘿嘿");
			blockingQueue.put("哈哈哈");
			String take = blockingQueue.take();
			System.out.println(take);
		} catch (InterruptedException e) {

		}

	}
}
