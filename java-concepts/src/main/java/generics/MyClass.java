package generics;

public class MyClass<T> {
	
	T hold;

	public T getHold() {
		return hold;
	}

	public void setHold(T hold) {
		this.hold = hold;
	}




	public static void main(String[] args) {
		MyClass mc = new MyClass();
		mc.setHold(123);
		mc.setHold("vikas");
		
		System.out.println(mc.getHold());
	}

}
