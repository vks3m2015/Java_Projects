package multithreading;

import java.util.List;

public class VolatileTest {
	
	public static void main(String[] args) {
		

		Point point = new Point();
		
		Thread t1 = new Thread(() -> {
			try {
				Thread.sleep(12);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
			point.x = 1;
			point.y = 1;
		});
		
		Thread t2 = new Thread(() -> {
			System.out.println(" X = " + point.x + "  Y = "+point.y);
		});
		
		
		t1.start();
		t2.start();
		
		
		
	}

}

class Point{
	volatile int x;
	volatile int y;
}
