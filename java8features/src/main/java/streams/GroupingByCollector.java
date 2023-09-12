package streams;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

import beans.Employee;

public class GroupingByCollector {

	public static void main(String[] args) {

		List<Employee> empList = Arrays.asList(
				new Employee(222, "A", 2000, "Knp", "UP"),
				new Employee(111, "B", 3000, "Knp", "UP"), 
				new Employee(333, "C", 3500, "Pune", "MH"),
				new Employee(123, "D", 3700, "Mumbai", "MH"));
		
		
		//List<String> empl = empList.stream().sorted(Comparator.comparing(emp -> emp.salary)).limit(2).map(emp -> emp.name).collect(Collectors.toList());
        //System.out.println(empl);
		// The following will classify Employee objects by state:
		Map<String, List<Employee>> employeeByState = empList.stream()
				.collect(Collectors.groupingBy(emp -> emp.state));
		
		// OR we can pass any other collector as second argument in groupingBy() collector 
		Map<String, List<Employee>> employeeByState2 = empList.stream()
				.collect(Collectors.groupingBy(emp -> emp.state, Collectors.toList()));
		
		System.out.println(" employeeByState = " + employeeByState);
		
		
		Map<String, Long> countEmployeeByState = empList.stream()
				.collect(Collectors.groupingBy(emp -> emp.state, Collectors.counting()));
		System.out.println("countEmployeeByState = "+countEmployeeByState);

		// The following will classify Person objects by state and city,cascading two
		// Collectors together:
		Map<String, Map<String, List<Employee>>> peopleByStateAndCity = empList.stream()
				.collect(Collectors.groupingBy(emp -> emp.state, Collectors.groupingBy(emp -> emp.city)));

		System.out.println(" peopleByStateAndCity = " + peopleByStateAndCity);

		// For example, to compute the set of Ids Employee in each city:
		Map<String, Set<Integer>> idsByCity = empList.stream()
				.collect(Collectors.groupingBy(emp -> emp.city, Collectors.mapping(emp -> emp.id, Collectors.toSet())));

		System.out.println("idsByCity =============\n " + idsByCity);

		// empList.sort((e1, e2)-> e1.getId() - e2.getId() );

		// empList.forEach(System.out::println);

		// Print the name of first two Employees having minimum empId
		/*
		 * empList.stream() .sorted((e1, e2)-> e1.getId() - e2.getId()) .limit(2)
		 * .map(Employee :: getName) .forEach(System.out::println);
		 */

		// Comparator<T>

		// sCollections.sort(list);
	}
}



