package warrior.thread;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

public class CountDownLatchDemo {

	ExecutorService executorService = new ThreadPoolExecutor(10, 10, 1L, TimeUnit.SECONDS, new LinkedBlockingQueue<Runnable>(10), Executors.defaultThreadFactory(),
					new ThreadPoolExecutor.CallerRunsPolicy());

	public void testCountDownLatch() throws InterruptedException {

		final CountDownLatch countDownLatch = new CountDownLatch(7);
		final AtomicInteger acAtomicInteger = new AtomicInteger();

		for (int i = 0; i < 7; i++) {

			executorService.execute(new Runnable() {

				public void run() {

					System.out.println("开始收集第" + (acAtomicInteger.getAndIncrement() + 1) + "颗龙珠...");
					countDownLatch.countDown();
				}
			});

		}

		countDownLatch.await();
		System.out.println("龙珠集齐，召唤神龙");
	}

	public void close() {

		executorService.shutdown();
	}

	public static void main(String[] args) throws InterruptedException {

		CountDownLatchDemo countDownLatchDemo = new CountDownLatchDemo();
		countDownLatchDemo.testCountDownLatch();
		countDownLatchDemo.close();
	}

}
