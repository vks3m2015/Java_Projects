package multipleInheritance;

public interface B {
	//int XORIGIN = 1;
	
	default void m() {
		System.out.println(" default method of interface A");
	}

}
