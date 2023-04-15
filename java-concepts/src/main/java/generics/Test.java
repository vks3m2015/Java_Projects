package generics;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

public class Test {

	public static void main(String[] args) {
		
		List<Number> list = new ArrayList<Number>();
		
		
		//List<Number> list = new ArrayList<Integer>();  //Subtyping is NOT ALLOWED in Generics Params
		
		//with Wildcards, we can find a solution
		List<?> list2 = new ArrayList<Integer>();
		list2 = new ArrayList<String>();
		list2 = new ArrayList<BigInteger>();
		
		List<? extends Number> l = new ArrayList<Integer>();
		
		list.add(123);
		list.add(12.30);
		list.add(3.6f);
		list.add(1L);
		list.add(0b100);
		
		System.out.println(list);
		
		for(Number a: list) {
			
			System.out.println("-----"+ (int)a);
			
		}
	}
}