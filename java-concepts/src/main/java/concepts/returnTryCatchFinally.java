package concepts;

public class returnTryCatchFinally {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//System.out.println("in main ="+ returnTryCatchFinally.method());
		
	//	System.out.println("in main if = "+returnTryCatchFinally.method2());
		
		//System.out.println("in main " +returnTryCatchFinally.method3());
		
		System.out.println("in main " +returnTryCatchFinally.method4());
	}

	
	 public static int method()
	 {
		
		 try {
			 
			 System.out.println(" inside try....");
			return 10;
			 
		 }
		 catch(Exception e)
		 {
			 
		 }
		 finally
		 {
			 System.out.println(" outside finally....");
			 return 12; 
		 }
		 
		// System.out.println(" outside finally....");
		// return 1;
		 
	 }
	 
	 public static int method2()
	 {
		 int a =10;
		 if(a ==10)
			 return 1;
		 
		 System.out.println(" outside condition....");
		 return 100;
		 
	 }
	 
	 
	 /*
	  * In this method Arithmetic Exception occur but is not handled. 
	  * In finally block this exception is overridden due to 'return' statement
	  * so this method will return 12 as output thats why it is not recommend to place return statement in finally block as we will not be able to know actual exception in this scenario
	  */
	 public static int method3()
	 {
		
		 try {
			 
			 System.out.println(" inside try....");
			int a = 10/0;
			 
		 }
		 catch(NullPointerException e)
		 {
			 System.out.println(" inside catch block....");
		 }
		 finally
		 {
			 System.out.println(" inside finally....");
		     return 12; 
		 }
		 
		//System.out.println(" outside finally....");
		 //return 1;
		 
	 }
	 
	 
	 /*
	  * this function will return value returned by catch block i.e. 100
	  * 
	  */
	 public static int method4()
	 {
		int a = Integer.MAX_VALUE;
		
		 try {
			 
			 System.out.println(" inside try....");
			int b = 10/0;
			 
		 }
		 catch(ArithmeticException e)
		 {
			 System.out.println(" inside catch block....");
			 return 100;
		 }
		 finally
		 {
			 System.out.println(" inside finally....");
		     //return 12; 
		 }
		 
		System.out.println(" outside finally....");
		 return 1;
		 
	 }
	 
}
