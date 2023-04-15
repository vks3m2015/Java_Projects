package practice;

import java.io.FileNotFoundException;

public class Test3 {

	public static void main(String[] args) throws Exception {
		
		System.out.println(returnInException());
		throwException();
	}
	
	public static String returnInException()
	{
		try {
			System.out.println("inside try...");
			int i = 10/0;
		}
		catch(Exception e)
		{
			return "catch";
		}
		finally {
			return "finally";
		}
	}
	
	public static void throwException() throws Exception 
	{
		
		try {
			//throw new Exception();
			throw new FileNotFoundException();
		}
		catch(Exception e)
		{
			
		}
		finally {
			System.out.println("inside finally block...");
			 //throw new NullPointerException();
			throw new Exception();
		}
		
		//throw new Exception();
		// throw new NullPointerException();
	}
	
    /*   Below method will not compile as it is throwing CHECKED EXCEPTION 
     *   To compile the code we can do two things -
     *   a)   put line-2 in try-catch OR
     *   b)   declare throws Exception after method name
     * 
     * 
    public static void throwException1()
	{
	 line-1 	System.out.println("inside throwException1 .......");
	 line-2 	throw new Exception();
	}
     */
	
	/* Below code will COMPILE SUCCESSFULLY as it is throwing UNCHECKED EXCEPTION
	 * BUT it will give exception at runtime
	 */
	public static void throwException2()
	{
	  	System.out.println("inside throwException1 .......");
	  	throw new NullPointerException();
	}
	
	/*  Below code will also NOT COMPILE - unhandled CHECKED EXCEPTION
	 * 
	 public static void throwException3()
	{
	  	try {
			
	  		System.out.println("inside throwException1 .......");
			throw new FileNotFoundException();
		} 
	  	catch (Exception e) {
	  		System.out.println(" insde method - throwException3 - CATCH block");
 			throw new Exception();
		}
	}*/
	
	//WILL COMPILE but will throw exception at runtime
	public static void throwException4()
	{
	  	try {
			
	  		System.out.println("inside throwException1 .......");
			throw new FileNotFoundException();
		} 
	  	catch (Exception e) {
	  		System.out.println(" insde method - throwException3 - CATCH block");
 			throw new NullPointerException();
		}
	}
	
	
}




