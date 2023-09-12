package streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import beans.Employee;

public class OtherPrograms {

	public static void main(String[] args) {
		List<Employee> empList = Arrays.asList(
				new Employee(222, "A", 2000, "Knp", "UP"),
				new Employee(111, "B", 3000, "Knp", "UP"), 
				new Employee(333, "C", 3500, "Pune", "MH"),
				new Employee(123, "D", 3700, "Mumbai", "MH"));
		
		
		//empList.stream().findFirst().ifPresent(e -> e.salary = e.salary * 10);
		
		
		//empList.stream().forEach(e -> e.salary = e.salary * 10);
		
		List<Employee> empList2 =  empList.stream().filter(e -> e.id != 111).map(emp -> { 
			emp.salary = emp.salary / 1000 ;
			return emp;
		}).collect(Collectors.toList());
		
		empList.forEach(e -> System.out.println(" sal = "+ e.salary));
		
		//empList2.forEach(e -> System.out.println(" sal = "+ e.salary));

	}

}
