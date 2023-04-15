package programs;

/* Find majority element in a array. Majority element is a element that occurs more than n/2 times in a array where n is number of elements in array.
 * 
 * 
 */
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MajorityElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	
		Scanner sc = new Scanner(System.in);
		System.out.println(" enter number of test cases ");
		int cases = sc.nextInt();
		
		while(cases > 0)
		{	
			System.out.println(" enter number of elements ");
			int num_of_elements = sc.nextInt();
			int[] elements = new int[num_of_elements];
			
			for(int i=0; i< num_of_elements; i++)
				elements[i] = sc.nextInt();
				
			System.out.println(findMajorityElement(elements));
			cases--;
		}
		sc.close();

	}
	
	public static int findMajorityElement(int[] arr)
	{
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		for(int i=0; i< arr.length; i++)
		{
			int element = arr[i];
			if(map.containsKey(element))
			{
			   int count = map.get(element);
			   count++;
			   map.put(element, count);
			   
			   if(count > (arr.length)/2)
				   return element;
			}
			else
				map.put(element, 1);
		}
		
		//System.out.println(" map contain NO majority element");
		return -1;
	}
	
	//https://www.geeksforgeeks.org/majority-element/
	
	//Second Approach - Using Moore’s Voting Algorithm  --TODO
	public static int findMajority(int[] arr)
	{
		return -1;
		
	}

}
