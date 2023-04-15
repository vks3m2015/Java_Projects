package streams;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class CollectorsUtil {

	public static void main(String[] args) {

		List<String> givenList = Arrays.asList("a", "bb", "ccc", "dd");
		
		//toList()
		List<String> l = givenList.stream().collect(Collectors.toList());
		print(l);
		
		//toUnmodifiableList()   //from Java10
		l = givenList.stream().collect(Collectors.toUnmodifiableList());
		
		//toSet()
		Set<String> set = givenList.stream().collect(Collectors.toSet());
		print(set);
		
		//toUnmodifiableSet()
		set = givenList.stream().collect(Collectors.toUnmodifiableSet());
		
		//toCollection()
		List<String> l2 = givenList.stream().collect(Collectors.toCollection(LinkedList::new));
		Set<String> set2 = givenList.stream().collect(Collectors.toCollection(HashSet::new));
		
		//toMap()
		Map<String,Integer> map = givenList.stream()
				.collect(Collectors.toMap(Function.identity(), String::length));
		print(map);
		
		//toUnmodifiableMap()
		Map<String,Integer> map2 = givenList.stream()
				.collect(Collectors.toUnmodifiableMap(Function.identity(), String::length));
		print(map2);
		
		//If it sees duplicate keys, it immediately throws an IllegalStateException 
		//java.lang.IllegalStateException: Duplicate key a (attempted merging values 1 and 1)
		//Map<String,Integer> map3 = List.of("a", "a", "bb", "ccc").stream().collect(Collectors.toMap(Function.identity(), String::length));
		
		//so in cases of key collision 
		Map<String,Integer> map4 = List.of("a", "a", "bb", "ccc").stream()
				.collect(Collectors.toMap(Function.identity(), String::length, (same, sameItem) -> same));
		print(map4);
		
		//joining()
		String str = givenList.stream().collect(Collectors.joining());
		print(str);
		
		//groupingBy()
		Map<String, Long> countMap = List.of("a", "b", "c", "b", "a").stream()
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		print("count map = ", countMap);
		
		
		
		
		
	}
	
	public static void print(Object obj) {
		System.out.println(obj);
	}
	
	public static void print(String msg, Object obj) {
		System.out.println(msg + obj);
	}

}
