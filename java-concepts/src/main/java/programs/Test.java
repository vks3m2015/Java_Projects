package programs;

import java.util.Arrays;
import java.util.concurrent.BlockingQueue;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	  StringBuilder a =new StringBuilder("abc");
      StringBuilder b = a;
      f(b);
      
     // System.out.println("  a =="+a+ " b == "+b);
      b.append("fg");
     // System.out.println(a + " " + b);
      
      
      final int[] arr = {1, 2};
      int[] brr;
      
      brr = arr;
      
      for(int abs: brr)
    	  System.out.println(abs);
      
      int[] arrr = {1,3,5,2};
     // int[] arrr1 = System.arraycopy(arrr, 0, arrr1, 0, length);
      
  }

 public static void f(StringBuilder b){
      b.append("de");
      b=null;
  }
 
}
