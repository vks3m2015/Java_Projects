package concepts;

import java.util.Set;
import java.util.TreeSet;

public class TreeSetUtil {

	public static void main(String[] args) {

		Set<Employee> set = new TreeSet<>();
		set.add(new Employee("A"));
		set.add(new Employee("D"));
		set.add(new Employee("B"));
		
		System.out.println(set);
	}

}
