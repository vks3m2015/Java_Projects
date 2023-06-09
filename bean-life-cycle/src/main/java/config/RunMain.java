package config;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class RunMain {

	public static void main(String[] arg)
	{
		ApplicationContext context =  new ClassPathXmlApplicationContext("Spring-Bean.xml");
		
		//Employee emp = (Employee)context.getBean("empbean");
		
		System.out.println("=============================");
		((ClassPathXmlApplicationContext)context).close();
		//System.out.println("employee object generated by spring container ="+emp);
		
		
		/* It is used in case of Annotation based configuration
		 * 
		 */
		/*ApplicationContext ctx =  new AnnotationConfigApplicationContext(BeanConfig.class);
		Address address = ctx.getBean(Address.class);
		System.out.println(address);
		
		DepartmentService ds = new DepartmentService();
		ds.processingDepartment();
		*/
		
		//UserService us = (UserService)context.getBean("userService");
		
		//UserService us = (UserService)context.getBean(UserService.class);
		//us.processPayment();
		
		
	}
	 
}
