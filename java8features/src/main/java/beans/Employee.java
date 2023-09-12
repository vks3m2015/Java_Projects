package beans;

import java.util.Arrays;
import java.util.List;
//import department.Department;

public class Employee {
	public int id;
	public String name;
	public String company;
	//Department department;
	public double salary;
	public String city;
	public String state;
	
	public Employee() {
		super();
		System.out.println("No Argu Constructor of Employee called..");
	}
	
	public Employee(int id, String name, double salary) {
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	
	public Employee(int id, String name, double salary, String city, String state) {
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.city = city;
		this.state = state;
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
	
	
	
	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

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
