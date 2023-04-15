package hashMapConcepts;

import java.util.HashMap;




/* if hash code of key object changes after we have put a key-value pair in map, then its almost impossible to fetch the value object back from map. 
 * It is a case of memory leak. To avoid this, map keys should be IMMUTABLE
 * 
 *  
 * Immutable key NOT MANDATORY. If you want to make a mutable object as key in hashmap, 
 * then you have to make sure that state change for key object does not change the hash code of object. 
 * This can be done by overriding the hashCode() method.
 *
 * hashCode() implementation of Object class is independent of object state change. If a class has not overridden hashCode() and equals() method 
 *  then hashCode() method of object class will be called and it will return same hashCode even after change in object state.
    but not overriding these method will cause other adverse impact.
    here if Employee class doesn't override hashCode() and equals(), storing and retrieval will work correctly 
    but uniqueness property of HashMap(HashMap cann't have duplicate keys) will be impacted.
 */

public class WhyImmutableKey {

	public static void main(String[] args) {
		
		HashMap<Employee1, Integer> emap = new HashMap<Employee1, Integer>();
		//here making key a mutable object. putting a entry and then changing state of key object cause change in hashCode of key. 
		//Hence not possible to retrieve(this entry).    
        Employee1 emp = new Employee1(101, "vikas", "Dev");
		
        emap.put(emp, 2015);
        
        System.out.println(" hascode of Employee object = "+emp.hashCode());   //2018699554
		emp.setDepartment("QA");
		System.out.println(" hashcode of Employee object after changing state = "+emp.hashCode()); //2018699554 same 
		
		
		System.out.println("  emp id =="+ emap.get(emp));      // printing - > object
		
	/*	ImmutableStudent imstu = new ImmutableStudent(10, "vikas");
		HashMap<ImmutableStudent, Integer> imStuMap = new HashMap<ImmutableStudent, Integer>();
		imStuMap.put(imstu, 9643);
		*/
		
		

	}

}

class Employee1{
	
	int id;
	String name;
	String department;
	
	public Employee1() {
		super();
	}

	public Employee1(int id, String name, String department) {
		super();
		this.id = id;
		this.name = name;
		this.department = department;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((department == null) ? 0 : department.hashCode());
		result = prime * result + id;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
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
		if (department == null) {
			if (other.department != null)
				return false;
		} else if (!department.equals(other.department))
			return false;
		
		if (id != other.id)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
   
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", department=" + department + "]";
	}
}	
