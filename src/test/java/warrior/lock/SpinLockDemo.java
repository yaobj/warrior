package warrior.lock;

import java.util.concurrent.atomic.AtomicReference;

public class SpinLockDemo {

	AtomicReference<Thread> actomicRefThread = new AtomicReference<Thread>();
	
	public void lock() {
		
		Thread thread = new Thread();
		
		while(!actomicRefThread.compareAndSet(null, thread)) {
			
		}
		
	}
	
	
	public void unLock() {
		Thread thread = new Thread();
		actomicRefThread.compareAndSet(thread, null);
	}

}

