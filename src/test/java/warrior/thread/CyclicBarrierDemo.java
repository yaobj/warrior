package warrior.thread;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class CyclicBarrierDemo {

	ExecutorService executorService = new ThreadPoolExecutor(10, 10, 1L, TimeUnit.SECONDS, new LinkedBlockingQueue<Runnable>(10), Executors.defaultThreadFactory(),
					new ThreadPoolExecutor.CallerRunsPolicy());

	public void testCyclicBarrier() throws InterruptedException {

		final CyclicBarrier cyclicBarrier = new CyclicBarrier(7, () -> {
			System.out.println("召唤神龙...");
		});

		for (int i = 0; i < 7; i++) {
			final int tempInt = i;
			executorService.execute(new Runnable() {

				@Override
				public void run() {

					System.out.println("收集第" + tempInt + "颗龙珠...");
					try {
						cyclicBarrier.await();
					} catch (InterruptedException e) {

					} catch (BrokenBarrierException e) {

					}
				}
			});
		}

	}

	public void close() {

		executorService.shutdown();
	}

	public static void main(String[] args) throws InterruptedException {

		CyclicBarrierDemo cyclicBarrierDemo = new CyclicBarrierDemo();
		cyclicBarrierDemo.testCyclicBarrier();
		cyclicBarrierDemo.close();
	}

}
