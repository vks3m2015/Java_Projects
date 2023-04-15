package hashMapConcepts;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Student {
	
	int id;
	String name;
	int marks;
	
	public Student(int id, String name, int marks) {
		super();
		this.id = id;
		this.name = name;
		this.marks = marks;
	}
	
	//This is comparator such that if two students have same name then sort on basis of marks
	static Comparator<Student> nameComparator = (Student st1, Student st2) -> {
		
		if((st1.name).equals(st2.name))
			return (st1.marks -st2.marks);
			
		return (st1.name).compareTo(st2.name);
	};
	
	
    Comparator<Student> idComparator = (Student st1, Student st2) -> {
		
		return (st1.id) - (st2.id);
	};
	
	
   Comparator<Student> marksComparator = (Student st1, Student st2) -> {
		
		return (st1.marks) - (st2.marks);
	};

	
	@Override
    public String toString() {
	   return "\n Student { id=" + id + ", name=" + name + ", marks=" + marks + "} ";
    }


	public static void main(String[] arg)
	{
		Set<Student> hs = new HashSet<Student>();
		hs.add(new Student(1,"vks", 70));
		hs.add(new Student(2,"ut", 50));
		hs.add(new Student(3,"vks", 80));
		hs.add(new Student(4,"de", 60));
		
		System.out.println("hashset =="+hs);
		
		List<Student> al = new ArrayList<Student>(hs);  //Here converting HashSet to List because cann't sort HashSet directly
		Collections.sort(al, nameComparator);
	
		//System.out.println(" after sort "+hs);    //HashSet will remain same
		System.out.println(" after sort "+al);
	}
	
	
}
