package concepts;

public class FinallyWithReturn {
	
	static int show(){
         try{
             return 1;
         }
        
         finally
         {
             return 2;
         }
    }
	 
	 static int show1(){
	 try{
         throw new NullPointerException();
     }
     finally{
         return 2;
     }
	
	 }
	public static void main(String[] arg)
	{
		System.out.println(show());  //prints 2
		
		System.out.println(show1()); //prints 2
		
		
		final Integer[] array ={1,2};
        System.out.println(array[0]);
        System.out.println(array[1]);
        array[0]=10;
        System.out.println(array[0]);
	}

}
