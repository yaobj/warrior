package warrior.lock;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.LockSupport;

public class LockSupportDemo {

	public static void main(String[] args) throws InterruptedException {

		final Thread a = new Thread(new Runnable() {
			
			public void run() {
				
				System.out.println(Thread.currentThread().getName()+"-- come in ");
				LockSupport.park();
				System.out.println(Thread.currentThread().getName()+"-- 被唤醒~ ");
				
			}
		},"A");
		a.start();
		
		TimeUnit.SECONDS.sleep(3L);
		
		Thread b = new Thread(new Runnable() {
			
			public void run() {
				
				System.out.println(Thread.currentThread().getName()+"-- come in ");
				LockSupport.unpark(a);
				System.out.println(Thread.currentThread().getName()+"-- 通知~");
				
			}
		},"B");
		b.start();
	}

}

