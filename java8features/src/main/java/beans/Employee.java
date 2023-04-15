package beans;

import java.util.Arrays;
import java.util.List;
//import department.Department;

public class Employee {
	int id;
	String name;
	String company;
	//Department department;
	
	public Employee() {
		super();
		System.out.println("No Argu Constructor of Employee called..");
	}

	
	public Employee(int id, String name, String company) {
		super();
		this.id = id;
		this.name = name;
		this.company = company;
	}


	/*public Employee(int id, String name, String company, Department department) {
		super();
		System.out.println("4 Argu Constructor of Employee called..");
		this.id = id;
		this.name = name;
		this.company = company;
		//this.department = department;
	}*/
	
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		System.out.println("setId, Setter of Employee class");
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		System.out.println("setName, Setter of Employee class");
		this.name = name;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		System.out.println("setCompany, Setter of Employee class");
		this.company = company;
	}

	 
	/*public Department getDepartment() {
		return department;
	}

	public void setDepartment(Department department) {
		System.out.println("setDepartment, Setter of Employee class");
		this.department = department;
	}*/

	
	/*@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", company=" + company + ", department=" + department + "]";
	}*/
	
	
	
	public static List<Employee> getDummyEmployeeList(){
		return Arrays.asList(
				new Employee(222, "vks2", "Alt"),
				new Employee(111, "vks", "Cav"), 
				new Employee(333, "vks3", "Accen") );
	}


	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", company=" + company + "]";
	}     

}
