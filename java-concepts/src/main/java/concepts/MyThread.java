package concepts;

public class MyThread {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Thread th = new Thread( new Runnable() {
				
				public void run()
				{
					System.out.println("   thread created.....");
				}
				
		});
		
		th.start();
		// th.start();  // calling again start() method on same thread on which it is already called gives Exception -  java.lang.IllegalThreadStateException
		
		Thread th1 = new Thread( () -> {
		
				     System.out.println("   thread created using lamda expression .....");
	    });
		th1.start();

	}
	
	
	

}
