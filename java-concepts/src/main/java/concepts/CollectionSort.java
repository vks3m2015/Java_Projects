package concepts;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.List;

public class CollectionSort {
	
	
	public static void main(String[] arg){
		
		List<Student> al = new ArrayList<Student>();	
	    al.add(new Student("vikas", 102));
	    al.add(new Student("ut", 101));
	    
	    //if st1 < st2 then return -ive and if st1 > st2 return +ive
	    Comparator<Student> cmp = new Comparator<Student>() {
	    	
	    	public int compare(Student st1, Student st2){
	    		return st1.roll_num - st2.roll_num;
	    	}
	    	
	    };
	    
	   // System.out.println(" before sort al == "+al);
	    Collections.sort(al, cmp);
	    System.out.println(" after sort al == "+al);
	    
	    employeeSort();
	}
	
	public static void employeeSort() {
		
		List<Employee> list = new ArrayList<>();
		list.add(new Employee("A", 12.34, LocalDate.of(2022, 12, 15)));
		list.add(new Employee("B", 12.34, LocalDate.of(2022, 11, 13)));
		list.add(new Employee("C", 15.15,LocalDate.of(2022, 3, 10)));
		
		Collections.sort(list, (emp1, emp2) -> {
			
			if(emp1.salary > emp2.salary) return -1;
			else if(emp1.salary < emp2.salary) return 1;
			else {
				return emp1.joiningDate.compareTo(emp2.joiningDate);
			}
			
		});
		
		System.out.println(" Emp List = "+ Arrays.toString(list.toArray()));
	}

}


class Employee{
	
	String name;
	Double salary;
	LocalDate joiningDate;
	
	Employee(String name,Double salary,LocalDate joiningDate){
		this.name = name;
		this.salary = salary;
		this.joiningDate = joiningDate;
	}
	
	public Employee() {
		// TODO Auto-generated constructor stub
	}

	public Employee(String name) {
		this.name = name;
	}

	public String toString() {
		return "\n Employee[ name = " + name + ", salary = "+ salary + ", joiningDate = "+joiningDate + " ]"; 
	}
	
	
}

class Student{
	
	String name;
	int roll_num;
	
	Student(String name, int roll_num)
	{
		this.name = name;
		this.roll_num = roll_num;
	}
	
	public String toString()
	{
		return "Student { name = "+name+ ", roll_num =  "+roll_num +" }";
	}
	
}
