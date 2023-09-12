package concepts;

import java.util.*;
import java.util.stream.Collectors;

public class ModifyingList {

	public static void main(String[] args) {
		
		String str = "Viks";
		str.length();
		
		ArrayList<String> list = new ArrayList<>();
		list.add(new String("vks"));
		list.add(new String("uks"));
		
		String st0 = list.get(0);
		st0 = new String("vks3");
		
		System.out.println("list == " + list);
		/*for(String str : list) {
			str = str + "singh";
		}*/
		
		
		List<Employee> eList = new ArrayList<>();
		eList.add(new Employee("vks")); 
		Employee e0 = eList.get(0);
		e0.salary = 1233.98;
 
		e0 = new Employee("uks");
		System.out.println("eList =="+eList);
		
		
		Iterator<String> itr = list.iterator();
		while(itr.hasNext()) {
			
			String str = itr.next();
			str = str + "singh";
			
			System.out.println(" str ="+ str);

			//--? what next?
		}
		
		System.out.println("list = " + list);
		List <String> output = list.stream().map((element) -> element + "singh" ).collect(Collectors.toList());
		
		//System.out.println(list);
		System.out.println(output);
		/*for(String str : list) {
			System.out.println(str);
		}
		*/
		

	}

}
