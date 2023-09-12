package beans;

import java.util.List;

public class Student {
	Integer id;
	String name;
	String section;
	List<Integer> marks;
	
	public Student(Integer id, String name, String section, List<Integer> marks) {
		super();
		this.id = id;
		this.name = name;
		this.section = section;
		this.marks = marks;
	}

	public Student() {
		// TODO Auto-generated constructor stub
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSection() {
		return section;
	}

	public void setSection(String section) {
		this.section = section;
	}

	public List<Integer> getMarks() {
		return marks;
	}

	public void setMarks(List<Integer> marks) {
		this.marks = marks;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", section=" + section + ", marks=" + marks + "]";
	}
	
	
	
	

}
