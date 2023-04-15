package multithreading;

import java.util.concurrent.atomic.AtomicInteger;

public class AtomicClasses implements Runnable {
	
	AtomicInteger counter = null;
	
	AtomicClasses(AtomicInteger counter){
		this.counter = counter;
	}

	

	@Override
	public void run() {
		System.out.println(" Value of counter = " +  counter.getAndIncrement() + " for thread = "+ Thread.currentThread().getName());
		
	}
	
	public static void main(String[] args) {
		AtomicClasses ac = new AtomicClasses(new AtomicInteger(0));
		
		Thread t1 = new Thread(ac);
		Thread t2 = new Thread(ac);
		Thread t3 = new Thread(ac);
		Thread t4 = new Thread(ac);
		Thread t5 = new Thread(ac);
		
		t1.start();
		t2.start();
		t3.start();
		t4.start();
		t5.start();

	}

}
