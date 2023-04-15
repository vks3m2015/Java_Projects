package department;

public class Department {
	
	String department_name;
	String tl;
	String manager;
	String director;
	
	public Department()
	{
		System.out.println("No Argu Constructor of Department class called.. ");
	}
	
	public Department(String department_name, String tl, String manager, String director) {
		super();
		System.out.println("4 Argu Constructor of Department class called.. ");
		this.department_name = department_name;
		this.tl = tl;
		this.manager = manager;
		this.director = director;
	}

	public String getDepartment_name() {
		return department_name;
	}

	public void setDepartment_name(String department_name) {
		System.out.println("setDepartment_name, Setter of Department class called..");
		this.department_name = department_name;
	}

	public String getTl() {
		return tl;
	}

	public void setTl(String tl) {
		System.out.println("setTL, Setter of Department class called..");
		this.tl = tl;
	}

	public String getManager() {
		return manager;
	}

	public void setManager(String manager) {
		System.out.println("setManager, Setter of Department class called..");
		this.manager = manager;
	}

	public String getDirector() {
		return director;
	}

	public void setDirector(String director) {
		System.out.println("setDirector, Setter of Department class called..");
		this.director = director;
	}

	@Override
	public String toString() {
		return "Department [department_name=" + department_name + ", tl=" + tl + ", manager=" + manager + ", director="
				+ director + "]";
	}
	
	
	
	

}
