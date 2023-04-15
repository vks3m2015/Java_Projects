package concepts;


//A subclass inherits all the members (fields, methods, and nested classes) from its superclass. 
//Constructors are not members, so they are not inherited by subclasses, but the constructor of 
//the superclass can be invoked from the subclass.
class Inheritence {
	
	public static void main(String[] arg){
		
		System.out.println("=========== ref Type Parent ================");
		Parent pc = new Child();
		
		 //variable overriding is not supported in java. It will print parent class variable 
		 System.out.println("  pc.str == "+ pc.commonVar); 
		 
		 //ERROR - varInChildOnly cannot be resolved or is not a field
		// String varInChildOnly = pc.varInChildOnly;
		 
		 pc.commonMethod();                     //method overriding
		 pc.methodInParentOnly();
		
		 //ERROR - The method methodInChildOnly() is undefined for the type Parent
		 
		 /* methodInChildOnly() is in child class but not in Parent class
		  * compiler will look methodInChildOnly() in Parent class while compilation 
		  * and will be looked in Child class at runtime(if executed)
		  * this is what RunTime Polymorphism
		  */
		 //pc.methodInChildOnly();
		 
		 System.out.println("=========== ref Type Child ================");
		 
		 Child child = new Child();
		 child.commonMethod();
		 child.methodInParentOnly();
		 child.methodInChildOnly();
		
	}

}

class Parent{
	
	String commonVar = "Parent";
	String varInParentOnly = " This variable is in Parent Class Only";
	
	public void commonMethod(){
		System.out.println("Class: Parent , Methdo: commonMethod.... str ="+commonVar);	
	}
	
	public void methodInParentOnly(){
		System.out.println(" Class: Parent , Methdo: methodInParentOnly....");
	}
	
	
}

class Child extends Parent{
	
	String str = "Child";
	String varInChildOnly = " This variable is in Child Class Only";
	
	public void commonMethod(){
		System.out.println(" Class: Child , Methdo: commonMethod....  str ="+str);	
	}
	
	public void methodInChildOnly(){
		System.out.println(" Class: Child , Methdo: methodInChildOnly....");
		 methodInParentOnly();
	}
}
