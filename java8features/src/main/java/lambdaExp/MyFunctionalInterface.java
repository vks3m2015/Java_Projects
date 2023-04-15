package lambdaExp;

@FunctionalInterface
public interface MyFunctionalInterface {

	void m();
	
	default void m1() {
		System.out.println(" this is default menthod a Functional Interface");
	}
	
	static void m2(){
		System.out.println(" this is static method of a Functional Interface");
	}

}
