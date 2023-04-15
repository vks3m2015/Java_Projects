package beans;

import java.util.Arrays;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

//import department.Department;

public class Employee implements InitializingBean, DisposableBean, BeanNameAware, BeanFactoryAware, ApplicationContextAware{
	
	int id;
	String name;
	String company;
	//Department department;
	
	static{
		System.out.println("STAIC BLOCK in Employee class..");
	}
	
	{
		System.out.println("INSTANCE INITIALIZATION BLOCK 1  of Employee class");
	}
	
	
	{
		System.out.println("INSTANCE INITIALIZATION BLOCK 2  of Employee class");
	}
	
	public Employee() {
		super();
		System.out.println("\nNO ARG CONSTRUCTOR of Employee called..");
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
		System.out.println("\nSETTER method setId() of Employee class");
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		System.out.println("SETTER method setName() of Employee class");
		this.name = name;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		System.out.println("SETTER method setCompany of Employee class");
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
	
	@Override
	public void setBeanName(String beanName) {
		System.out.println("\nBeanNameAware :: setBeanName method of AwareBeanImpl is called, beanName =>"+beanName);
		//System.out.println("setBeanName:: Bean Name defined in context= " + beanName);
	}

	@Override
	public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
		System.out.println("BeanFactoryAware :: setBeanFactory method of AwareBeanImpl is called");
		//System.out.println("setBeanFactory:: AwareBeanImpl singleton= " + beanFactory.isSingleton("awareBean"));
	}

	@Override
	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
		System.out.println("ApplicationContextAware :: setApplicationContext method of AwareBeanImpl is called, Bean Definition Names= "
				+ Arrays.toString(applicationContext.getBeanDefinitionNames()));
	}
	
	@PostConstruct
	public void init2() {
		System.out.println("\n ++++++++++++++++++++++++++++@PostConstruct...  Verifying Resources");
	}

	@PreDestroy
	public void shutdown() {
		System.out.println("@PreDestroy.. Shutdown All Resources");
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
