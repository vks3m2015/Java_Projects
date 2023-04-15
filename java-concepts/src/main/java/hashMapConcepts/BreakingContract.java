package hashMapConcepts;

import java.util.*;

//Breaking Contract by overriding only equals() but not hashCode() method in Employee class
public class BreakingContract {

	public static void main(String[] args) {
		
		Employee emp1 =  new Employee(101, "vikky", "Development");
		Employee emp2 =  new Employee(102, "yash", "QA");
		Employee emp3 =  new Employee(101, "vikky", "Development");
		
		//Here we can see emp1 and emp3 are same employee
		
		Map<Employee, Integer> map = new HashMap<>();
		
		//Issue while storing data in map
		map.put(emp1, 2015);
		map.put(emp2, 2016);
		map.put(emp3, 2015);
		
		
		System.out.println(" size of hashmap ="+ map.size());  //gives 3
		map.forEach((key,value) -> System.out.println(" key ="+ key + " value ="+value));
		
		//So we can see that map is having DUPLICATE KEYS (having data of same employee twice in map )
		
		//Issue when retreving data from map
		Integer joiningDate = map.get(new Employee(101, "vikky", "Development"));
		System.out.println(" Joining date of employee with empID  101  ="+ joiningDate );  //return NULL
		

	}

}

class Employee{
	
	int id;
	String name;
	String department;
	
	public Employee() {
		super();
	}

	public Employee(int id, String name, String department) {
		super();
		this.id = id;
		this.name = name;
		this.department = department;
	}
	
	/*@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((department == null) ? 0 : department.hashCode());
		result = prime * result + id;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}*/
	
	public Employee(String name, int id) {
		super();
		this.id = id;
		this.name = name;
	}

	
	/*
	 * @Override public boolean equals(Object obj) { if (this == obj) return true;
	 * if (obj == null) return false; if (getClass() != obj.getClass()) return
	 * false;
	 * 
	 * Employee other = (Employee) obj; if (department == null) { if
	 * (other.department != null) return false; } else if
	 * (!department.equals(other.department)) return false;
	 * 
	 * if (id != other.id) return false; if (name == null) { if (other.name != null)
	 * return false; } else if (!name.equals(other.name)) return false; return true;
	 * }
	 */

	@Override
	public int hashCode() {
		return Objects.hash(department, id, name);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		return Objects.equals(department, other.department) && id == other.id && Objects.equals(name, other.name);
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", department=" + department + "]";
	}
	
	
	
}
