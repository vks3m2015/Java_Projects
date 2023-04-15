package concepts;

public class UseClone2 implements Cloneable{

	String name;
	
	UseClone2(String name){
		this.name = name;
	}
	public static void main(String[] args) throws CloneNotSupportedException {
		
		UseClone2 obj = new UseClone2("vikas");
		
		UseClone2 obj2 = (UseClone2)obj.clone();
		
		System.out.println(obj2.name);

	}

}
