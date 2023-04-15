package employee;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

import department.Department;

public class Employee implements InitializingBean, DisposableBean{
	
	int id;
	String name;
	String company;
	Department department;
	
	static{
		System.out.println("STAIC BLOCK in Employee class..");
	}
	
	{
		System.out.println("Instance Initialization Block 1  of Employee class");
	}
	
	
	{
		System.out.println("Instance Initialization Block 2  of Employee class");
	}
	
	public Employee() {
		super();
		System.out.println("No Argu Constructor of Employee called..");
	}

	public Employee(int id, String name, String company, Department department) {
		super();
		System.out.println("4 Argu Constructor of Employee called..");
		this.id = id;
		this.name = name;
		this.company = company;
		this.department = department;
	}
	
	
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

	 
	public Department getDepartment() {
		return department;
	}

	public void setDepartment(Department department) {
		System.out.println("setDepartment, Setter of Employee class");
		this.department = department;
	}

	
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", company=" + company + ", department=" + department + "]";
	}
	
	@PostConstruct
	private void init() {
		System.out.println("@PostConstruct...  Verifying Resources");
	}

	@PreDestroy
	private void shutdown() {
		System.out.println("@PreDestroy.. sShutdown All Resources");
	}
	
	@Override
	public void afterPropertiesSet() throws Exception
	{
		System.out.println("InitializingBean :: afterPropertiesSet() method of Employee class");
	}
	
	@Override
	public void destroy() throws Exception 
	{
		System.out.println("DisposableBean :: destroy() method of Employee class");
	}
	
	public void myInit()
	{
		System.out.println(" myInit method of Employee class ....");
	}

	public void myDestroy()
	{
		System.out.println(" myDestroy method of Employee class .....");
	}
}
