package concepts;

public class NULLInMethodOverload {

	public static void method(String str)
	{
		System.out.println(" String Argument");
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
		method(1);

	}

}
