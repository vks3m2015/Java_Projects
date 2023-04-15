package multipleInheritance;

public class C implements A, B {
	
	static String HIDE = "HIDE var value Declared in C";

	// If not then
	// Error - Duplicate default methods named m with the parameters () and () are  inherited from the types B and A
	@Override
	public void m() {
		B.super.m();
	}

	public static void main(String[] args) {

		System.out.println(XORIGIN);
		C c = new C();
		// Error - No Field XOROGIN in C
		// System.out.println(" XORIGIN = " + c.XORIGIN);
		System.out.println(" XORIGIN = " + ((A) c).XORIGIN);
		
		//ERROR - The field C.XORIGIN is ambiguous
		//System.out.println(" XORIGIN = " + C.XORIGIN);
		
		System.out.println("UNIQUE = "+ C.UNIQUE);  //will print 123

		System.out.println("HIDE = "+ C.HIDE);

	}

}
