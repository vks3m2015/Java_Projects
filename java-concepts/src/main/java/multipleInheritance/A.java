package multipleInheritance;

public interface A {
	
	//public static final only these fields permitted( its By default)
	int XORIGIN = 0;
	public static final int UNIQUE = 123;
	
	String HIDE = "HIDE var value Declared in A";
	
	
	default void m() {
		System.out.println(" default method of interface A");
	}
	
	//Illegal combination of modifiers for the interface method m2; only one of abstract, default, or static permitted
	//static default void m2() {}

}
