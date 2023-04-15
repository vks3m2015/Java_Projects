package practice;

public class OddEven {

	boolean evenFlag = false;
	
    private void printEvenNumbers() {
    	
    	
		
    	for(int i=2; i<=10; i += 2) {
    		
    		if(evenFlag) {
    		System.out.println(i);
    		
    		evenFlag = false;
    		}
    		else {
    			
    			try {
					wait();
				} catch (InterruptedException e) {
					
					e.printStackTrace();
				}
    		}
    	}
			
	}

	private void printOddNumbers() {
		
		
	}
	
	
	public static void main(String[] args) {
		
		OddEven oddEven = new OddEven();
		
		Runnable oddThread = () -> {
			
			oddEven.printOddNumbers();
		};
		
		Runnable evenThread = () -> {
			oddEven.printEvenNumbers();
		};
		
		Thread thread1 = new Thread(oddThread);
		thread1.start();
		
		Thread thread2 = new Thread(evenThread);
		thread2.start();
		
		
		
	}

	

}
