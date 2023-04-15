package concepts;

public class FinalKeyword {
	
	public static void main(String[] arg)
	{
		
		
		final Integer[] arr ={1,2};
        System.out.println(arr[0]);
        System.out.println(arr[1]);
        arr[0]=10;                  // it will change the value of array as here final means variable 'arr' refer any other array object
        System.out.println(arr[0]);  
	

	}

}
