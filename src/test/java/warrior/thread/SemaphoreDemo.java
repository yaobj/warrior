package warrior.thread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.Semaphore;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class SemaphoreDemo {

	ExecutorService executorService = new ThreadPoolExecutor(10, 10, 1L, TimeUnit.SECONDS, new LinkedBlockingQueue<Runnable>(10), Executors.defaultThreadFactory(),
					new ThreadPoolExecutor.CallerRunsPolicy());

	public void testSemaphore() throws InterruptedException {

		final Semaphore semaphore = new Semaphore(3);

		for (int i = 0; i < 7; i++) {
			final int tempInt = i;
			executorService.execute(new Runnable() {

				@Override
				public void run() {

					try {
						semaphore.acquire();
						System.out.println(tempInt + "获得车位");
					} catch (InterruptedException e) {

					} finally {
						System.out.println(tempInt + "离开车位");
						semaphore.release();
					}

				}
			});
		}

	}

	public void close() {

		executorService.shutdown();
	}

	public static void main(String[] args) throws InterruptedException {

		SemaphoreDemo semaphoreDemo = new SemaphoreDemo();
		semaphoreDemo.testSemaphore();
		semaphoreDemo.close();
	}

}
