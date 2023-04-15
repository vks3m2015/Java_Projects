package hashMapConcepts;

/* If two objects are equal according to method equals(Object), then hashCode() method must produce same integer for these two objects
 * Two different objects can have same hashcode
 * 
 * Whenever it is invoked on the same object more than once during an execution of a Java application, 
 * the hashCode method must consistently return the same integer,
 * provided no information used in equals comparisons on the object is modified 
 * (Whenever a.equals(b), then a.hashCode() must be same as b.hashCode().)
 * 
 * If you override one, then you should override the other. hashCode() and equals()
 * 
 * 
 */
public class HashCode {

	public static void main(String[] arg)
	{
		Employee emp1 = new Employee("vikas", 10000);
		Employee emp2 = new Employee("vikas", 10000);
		Employee emp3 = new Employee("ut", 20000);
		
		int hashBefore = emp1.hashCode();
		System.out.println("  hashcode of emp1 ="+ hashBefore);
		
		//After doing some modification in object state
		emp1.id = 25000;
		int hashAfter = emp1.hashCode();
		System.out.println(" now hashcode of emp1 ="+ hashAfter);
		System.out.println(" hashBefore == hashAfter ->"+ (hashBefore == hashAfter));      //false
		
		
		
		
		System.out.println("  hashcode emp1 ="+ emp1.hashCode() + " \n emp2 ="+ emp2.hashCode() + " \n emp3 ="+emp3.hashCode());
		System.out.println(" emp1 equals emp2 = "+ emp1.equals(emp2));
		
		String e1 = "vikas";
		String e2 = "vikas";
		System.out.println(" \n hashcode e1 ="+ e1.hashCode() + " \n e2 ="+ e2.hashCode());
		System.out.println(" e1 equals e2 = "+ e1.equals(e2));
		
		
		
		StringBuilder sb = new StringBuilder("vikas");
		System.out.println(" hashcode of string builder string ="+sb.hashCode());
		sb.append(" singh");
		System.out.println(" after changing object hashcode of string builder string ="+ sb.hashCode());
		
		e1 = e1 + "singh";
		System.out.println("  hashcode ==" + e1.hashCode());
	}
}


