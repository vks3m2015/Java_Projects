package concepts;

import java.util.*;
import java.util.stream.Collectors;

public class ModifyingList {

	public static void main(String[] args) {
		
		List<String> list = new ArrayList<>();
		list.add("vks");
		list.add("uks");
		
		/*for(String str : list) {
			str = str + "singh";
		}*/
		
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
