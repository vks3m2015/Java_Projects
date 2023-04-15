package concepts;

public class OrderOfExecution {

	OrderOfExecution()
	{
		System.out.println(" inside constructor");   //4
	}
	
	{
		System.out.println(" inside instance initialization block");    //2
	}
	
	static
	{
		System.out.println(" inside static block....");   //1
	}
	
	{
		System.out.println(" again inside instance initialization block..");    //3
	}
	
	
	
	

}

//https://www.geeksforgeeks.org/order-execution-initialization-blocks-constructors-java/
//https://stackoverflow.com/questions/19561332/in-what-order-do-static-blocks-and-initialization-blocks-execute-when-using-inhe
class Parent1 {

	 
	  static {
	    step(2);
	  }

	  public static int step_1 = step(1);
	  
	  
	  public int step_5 = step(5);

	  public Parent1() {
	    step(7);
	  }

	  {
	    step(6);
	  }

	  // Just for demonstration purposes:
	  public static int step(int step) {
	    System.out.println("Step " + step);
	    return step;
	  }
	}

class Child1 extends Parent1 {

	  {
	    step(9);
	  }

	  public static int step_3 = step(3);
	  public int step_10 = step(10);

	  static {
	    step(4);
	  }



}


class Main1
{
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		OrderOfExecution oe = new OrderOfExecution();
		
		//output
	/*	 inside static block....
		 inside instance initialization block
		 again inside instance initialization block..
		 inside constructor
     */
		
		//new Child1();
	}

}