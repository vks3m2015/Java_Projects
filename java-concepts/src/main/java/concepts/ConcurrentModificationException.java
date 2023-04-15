package concepts;

import java.util.*;

public class ConcurrentModificationException {

	public static void main(String[] args) {
		
		List<String> list = new ArrayList<>();
		list.add("Noida");
		list.add("Gurugram");
		list.add("Kanpur");
		
		List<StringBuilder> list2 = new ArrayList<>();
		list2.add(new StringBuilder("Noida"));
		list2.add(new StringBuilder("Gurugram"));
		list2.add(new StringBuilder("Kanpur"));
		
		
		Map<Integer, String> map = new HashMap<>();
		map.put(1, "Noida");
		map.put(2, "Gurugram");
		map.put(3, "Kanpur");
		
		//It will throw ConcurrentModificationException by method next()
		/*Iterator<String> itrList = list.iterator();
		while(itrList.hasNext()) {
			String element = itrList.next();
			System.out.println(" element = "+ element);
			
			if(element.equals("Gurugram") ) {
				list.remove("Gurugram");
				list.add("Gurgaon");
			}
		}*/
		
		System.out.println(" List BEFORE iteration = "+list);
		System.out.println(" Removing a element from list while iterating through iterator");
		Iterator<String> itrList = list.iterator();
		while(itrList.hasNext()) {
			String element = itrList.next();
			//System.out.println(" element = "+ element);
			
			if(element.equals("Gurugram") ) {
				itrList.remove();
			}
		}
		System.out.println(" List AFTER iteration = "+list);
		
		//It will not throw ConcurrentModificationException as we haven't change size or Structurally modified list 
		//but modify elements itself.
		/*Iterator<StringBuilder> itrList2 = list2.iterator();
		while(itrList2.hasNext()) {
			StringBuilder element = itrList2.next();
			element.append("City");
			System.out.println(" element = "+ element);
		}
		System.out.println("list ="+list2); */

	}

}
