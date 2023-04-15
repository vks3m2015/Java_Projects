package concepts;

public class ExceptionQues {

	public static void main(String[] args) {
		ExceptionQues obj = new ExceptionQues();
		obj.m();
	}
	
	public void m() {
		throw new RuntimeException(new Exception("This is an Exception"));
	}
	
	/* //Will have to add throws in Method signature otherwise Compile time Exception
	 * public void m2() { throw new Exception("This is an Exception"); }
	 */

}
