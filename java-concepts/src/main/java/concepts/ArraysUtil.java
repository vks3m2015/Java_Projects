package concepts;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class ArraysUtil {
	
	

	public static void main(String[] args) {
		
		int[] arr = {1,2,4};
		
		//to create streams
		IntStream stream = Arrays.stream(arr);
		
		//to create list Unmodifiable
		List<Person2> list = Arrays.asList(new Person2(123, "ABC"));
		
		//will throw Exception
		//list.add(null);
		
		Arrays.fill(arr, 0);
		
		Arrays.hashCode(arr);
		
		String s = Arrays.toString(arr);
		System.out.println(s);

	}

}

class Person2{
	int id;
	String name;
	public Person2(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
}
