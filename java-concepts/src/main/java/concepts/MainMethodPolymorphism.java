package concepts;

public class MainMethodPolymorphism {

	public static void main(String[] args) {
		
       System.out.println(" This is main method.. First method Called by JVM");
	}
	
    public static void main(Integer[] args) {
		
    	System.out.println(" Overloading main method... WE can overload main method...");

	}
	
	

}

//OVERRIDING of main method is not possible

class MainMethodPolymorphismChild extends MainMethodPolymorphism{
	
	public static void main(String[] args) {
		
	       System.out.println(" This is main method in Child Class.. First method Called by JVM");
		}
}
