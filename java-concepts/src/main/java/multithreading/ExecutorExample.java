package multithreading;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class ExecutorExample {

	public static void main(String[] args) {
		
		ExecutorService executorService1 = Executors.newSingleThreadExecutor();

		ExecutorService executorService2 = Executors.newFixedThreadPool(2);

		ExecutorService executorService3 = Executors.newScheduledThreadPool(2);
		
		Runnable rTask = () -> { System.out.println(" Runnable Task....");};
		
		Callable cTask = () -> { return "Callable Task" ; };
		
		
		executorService2.execute(rTask);
		Future<String> future = executorService2.submit(cTask);
		
		try {
			
			String resultByFuture = future.get();
			System.out.println("  resultByFuture = "+resultByFuture);
			
		} catch (InterruptedException | ExecutionException e) {
			e.printStackTrace();
		}
		
	}

}
