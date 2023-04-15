package concepts;

import java.io.FileNotFoundException;

//Java program to demonstrate that we can have
//different return types if return type in
//overridden method is sub-type

//Two classes used for return types.

/* -------------
 * static
 * -------------
 * 
 * -------------
 * final
 * -------------
 * 
 * ------------------
 * Return Type
 * ------------------
 *  The overriding method must have same return type (or subtype)
 *  
 *  -----------------
 *  Access Modifier
 *  -----------------
 *  The overriding method must not have more restrictive access modifier.
 *  
 *  ------------------
 *  Exception
 *  ---------------------
 *  The overriding method must not throw NEW or BROADER checked exceptions. 
 *  Overriding method may throw FEWER or NARROWER or NO checked exceptions, or ANY UNCHECKED exceptions 
 *   If the superclass method declares an exception, subclass overridden method can declare same, 
 *   subclass exception or no exception but cannot declare parent exception.
 *   If the superclass method does not declare an exception, subclass overridden method cannot declare 
 *   the checked exception but can declare unchecked exception
 */


class A {}
class B extends A {}
class C{}

class Base
{
    private void privateInBase()
    {
    	System.out.println(" class - Base, method - privateInBase ");
    }
    
    public A sameMethodSignatureDiffReturnType(String str, int i)
    {
    	System.out.println(" class Base, method sameMethodSignatureDiffReturnType...");
    	return new A();
    }
    
	protected A fun() throws FileNotFoundException
     {
        System.out.println("Base fun()");
        return new A();
     }
     
     
     public static void m()
     {
    	 System.out.println(" static method m in Base class");
     }
     
     public void exceptionChecking() throws Exception
     {
    	 System.out.println(" Class- Base, method - exceptionChecking........  ");
     }
     
     public static void  staticInBase()
     {
    	 System.out.println(" class - Base , mehod - staticInBase ....");
     }
     
     public void nonStaticInBaseButStaticInDerived()
     {
    	 System.out.println("  class - Base , mehod - nonStaticInBaseButStaticInDerived....");
     }
     
     public void meth()
     {
    	 System.out.println(" in meth");
     }
 
}

class Derived extends Base
{
	/* In case of method OVERRIDING, Java 5.0 onwards it is possible to have different return type 
	 * for a overriding method in child class, 
	 * but child’s return type should be sub-type of parent’s return type. Overriding method becomes variant 
	 * with respect to return type.
	 */
	
	@Override
	// case: public  static B fun()                        // ERROR - A Static method cann't hide Instance method or vice versa
	// case: B fun()                                      //ERROR - Cannot reduce the visibility of the inherited method from protected -> default
	// case: public B fun() throws IOException           //Cann't throw broader exception
	// case: public B fun() throws ArithmeticException  //CORRECT can throw any UNCHECKED EXCEPTION
	// case: public synchronized B fun()
    public synchronized B fun() throws ArithmeticException
    {
        System.out.println("Derived fun() , return type is B");
        return new B();
    }
	
	 
	public A sameMethodSignatureDiffReturnType(String str, int i)
    {
    	System.out.println(" class Base, method sameMethodSignatureDiffReturnType...");
    	return new A();
    }
   /*
    *  If we have different return type other than covariant( subtype ) it will not be overriding as below method
    */
    /*
    public  C fun()
    {
        System.out.println("Derived fun() , return type is B");
        return new C();
    }
	*/
    
	/* In method OVERLOADING only return type alone is not sufficient for the compiler to figure out which method to call
	 * 
	 * Compiler will show 'DUPLICATE METHODS' for below two methods
	 */
	
	/* int method()
	{
		return 5;
	}
	
	char method()
	{
		return 'a';
	}
	*/
	
	//It will be considered a new method. It is not inherited from base. AS it is declared as private in base class
	private void privateInBase()
    {
    	System.out.println(" class - Derived, method - privateInBase ");
    }
    
	
	 public void exceptionChecking()
     {
    	 System.out.println(" Class- Derived, method - exceptionChecking........  ");
     }
	 
	public static void m()
    {
   	 System.out.println(" static method m in Derived class");
    }
	
	/* Compiler complaining - Instance method can not override static method 
	 * 
	 public  void  staticInBase()
     {
   	    System.out.println(" class - Base , mehod - staticInBase ....");
     }*/
	
	 /*  Compiler complaining - This static method cannot hide the instance method from Base
	  * 
	  public static void nonStaticInBaseButStaticInDerived()
     {
    	 System.out.println("  class - Base , mehod - nonStaticInBaseButStaticInDerived....");
     }
     */
	
	 public void meth()
	 {
		 System.out.println("  child meth");
	 }
}

class Main
{
 public static void main(String args[])
 {
   
    Base child = new Derived();
    
    try
    {
      child.fun();
      child.exceptionChecking();
    }
    catch(Exception e)
    {
    	
    }
     
    child.m();  //No overriding in this case ( static method) as 'child' will be replaced by 'Base' by compiler 
                //because m() is static method
    
 }
}
public class Overriding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
