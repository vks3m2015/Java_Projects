package streams;

import java.util.Arrays;
import java.util.List;

import beans.Employee;

public class Factory {
	
	public static List<Employee> getEmpList() {
		List<Employee> empList = Arrays.asList(
				new Employee(222, "A", 2000, "Knp", "UP"),
				new Employee(111, "B", 3000, "Knp", "UP"), 
				new Employee(333, "C", 3500, "Pune", "MH"),
				new Employee(123, "D", 3700, "Mumbai", "MH"));
		
		return empList;
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	
	
	

}
