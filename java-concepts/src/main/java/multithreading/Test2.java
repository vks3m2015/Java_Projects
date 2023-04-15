package multithreading;

import java.util.concurrent.atomic.AtomicInteger;

public class Test2  {

    private static int number;
    private static boolean ready;

    private static class Reader extends Thread {

        @Override
        public void run() {
        	int n =1;
            while (!ready) {
                Thread.yield();
            	
            	if(n> 30) { break;}
            	else {
            		n++;
            		System.out.println("inside while"+n);
            	}
            }

            System.out.println(number);
        }
    }

    public static void main(String[] args) {
        new Reader().start();
       
        AtomicInteger ai = new AtomicInteger();
       /* try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
        number = 42;
        ready = true;
    }
}
