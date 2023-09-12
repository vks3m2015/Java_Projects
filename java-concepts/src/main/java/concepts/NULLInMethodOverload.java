package concepts;

public class NULLInMethodOverload {

	//Java will always try to use the most specific applicable version of a method that's available
	//We can cast null to any reference type without getting any exception. i.e. String x = (String) null;
	
	public static void method(String str)
	{
		System.out.println(" String Argument");
	}
	
	public static void method(Object str)
	{
		System.out.println(" Object Argument");
	}
	
	public static int method(int in)
	{
		System.out.println(" integer argument");
		return 1;
	}
	
	public static String method2(int in)
	{
		System.out.println(" integer argument String return type");
		return "";
	}
	/*public static int method(Integer in)
	{
		System.out.println(" Integer Wrapper argument");
		return 1;
	} */
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		method(null);
	//	method(1);

		/*  Solution
		 * 
		 * 
		doSomething( (Object) null);
		doSomething( (Integer) null);
		doSomething( (char[]) null);
		*/
		
		//or
		//char[] x = null;
		// doSomething(x);
	}

}
