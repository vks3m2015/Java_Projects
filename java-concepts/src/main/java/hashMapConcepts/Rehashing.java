package hashMapConcepts;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Rehashing {

	public static void main(String[] args) {
		
		Map<Integer, String> map = new HashMap<>(2);
		
		map.put(1, "A");
		map.put(2, "B");
		
		System.out.println(map);
		
		Set<String> set = new HashSet<>();

	}

}
