package concepts;

public class VarArgs {

	public static void main(String[] args) {
		
		m3("hi", "vikas");

	}
	
	public static void m(String... msgs ){
		System.out.println(msgs.length);
		
	}
	
	public static void m2(String ... msgs ){
		System.out.println(msgs.length);
		
		
	}
	
	public static void m3(String ...msgs ){
		System.out.println(msgs.length);
		
	}

}
