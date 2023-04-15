package concepts;

//https://www.baeldung.com/java-deep-copy

import java.util.HashMap;
import java.util.Map;

//Cloneable is just a Marker interface. It has no method. clone() method is in Object class with protected access modifier. 
// clone() method checks if class has implemented Cloneable interface or not. If not it throws  - CloneNotSupportedException
// when we call super.clone() it return shallow copy of object. 
//For premitive data type fields, content is copied but for reference variable fields reference is copied  

public class UseClone implements Cloneable{

	String name;
	HashMap<String,String> capital = new HashMap<>();
	
	public UseClone(String name) {
		super();
		this.name = name;
		
		capital.put("lucknow", "UP");
		capital.put("jaipur", "Rajasthan");
	}

	public Object makeClone() throws CloneNotSupportedException
	{
		    
			UseClone useClone = (UseClone)super.clone();
			//return useClone;
			
			// now this useClone is only shallow copy of original object useClone.capital is referring to original hashmap.
			//For DeepCopy
			useClone.capital = (HashMap<String, String>) useClone.capital.clone();
			return useClone;
		
	}

	
	@Override
	public String toString() {
		return "UseClone [name=" + name + ", capital=" + capital + "]";
	}

	//public static void main(String[] args) throws CloneNotSupportedException{
	public static void main(String[] args) {   
		/*UseClone origObj = new UseClone("vik");
		UseClone cloneObj = (UseClone)origObj.makeClone();
		System.out.println("  origObj  ="+origObj);
		System.out.println(" cloneObj  = "+ cloneObj);
		
		origObj.capital.put("bhopal", "MP");
		
		System.out.println(" after some modification....");
		System.out.println("  origObj  ="+origObj);
		System.out.println(" cloneObj  = "+ cloneObj);
		*/
		UseClone origObj = new UseClone("vik");
		try {
			origObj.clone();
		} catch (CloneNotSupportedException e) {
System.out.println("exception.......");			e.printStackTrace();
		}
		

	}

}
