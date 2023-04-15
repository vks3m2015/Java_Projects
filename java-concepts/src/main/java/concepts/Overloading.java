package concepts;

public class Overloading {

	/*private static void method(Integer arg)
	{
		System.out.println(" with int arg");
	}*/
	
	public static void method(String arg)
	{
		System.out.println(" with string arg");
	}
	
	public static void method(Object arg)
	{
		System.out.println(" with obj arg");
	}
	
	public static void main(String[] args) {
		
		method(null);

	}

}
