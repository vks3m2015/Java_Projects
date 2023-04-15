package department;

import org.springframework.beans.factory.annotation.Autowired;

//this class is not maintained by spring. it is not registered in spring container
public class DepartmentService {
	
	@Autowired
	Department department;
	
	public void processingDepartment()
	{
		System.out.println(" class - DepartmentService, method -  processingDepartment");
	}

}
