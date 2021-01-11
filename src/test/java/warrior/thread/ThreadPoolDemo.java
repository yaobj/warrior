package warrior.thread;

import java.util.WeakHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class ThreadPoolDemo {

	public static void main(String[] args) {
		ExecutorService executorService = new ThreadPoolExecutor(10, 10, 1L, TimeUnit.SECONDS, new LinkedBlockingQueue<Runnable>(10),Executors.defaultThreadFactory(),new  ThreadPoolExecutor.CallerRunsPolicy() );
		
		
		for (int i = 0; i < 30; i++) {
			executorService.execute(new Runnable() {
				
				public void run() {
					
					 System.out.println(Thread.currentThread().getName());
					
				}
			});
		}
		
		WeakHashMap<String, String> weakHashMap = new WeakHashMap<String, String>();
		
	}
}

