package concepts;

public class StaticOverriding {

	public static void main(String[] args) {
		Mobile mob = new Lava();
		mob.myself();  //I am Mobile
		
		Lava.myself();

	}

}

class Mobile{
	
	public static void myself() {
		System.out.println("I am Mobile");
	}
	
	public static void m2() {
		System.out.println("static method of Mobile class...");
	}
	
}

class Lava extends Mobile{
    
	public static void myself() {
		System.out.println("I am LAVA mobile");
		
		m2();
	}
	
	public static void m2() {
		System.out.println("static method m2() of LAVA class...");
	}
}
