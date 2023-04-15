package streams;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;

public class StreamsPrograms {
	
	//Find duplicate elements
	static void prog5() {
		List<Integer> list = Arrays.asList(2,10,2,5,15,10,2);
		
		//Method - 1 
		Set<Integer> duplicates = list.stream()
				.filter(num -> Collections.frequency(list, num) > 1)
				.collect(Collectors.toSet());
		
		System.out.println("duplicates" + duplicates);
		
		//Method - 2 
		Set<Integer> set = new HashSet<>();
		Set<Integer> duplicates2 = list.stream()
				.filter(num -> !set.add(num))
				.collect(Collectors.toSet());
		
		System.out.println("duplicates2" + duplicates2);
		
		
	}
	
	//find max/min
	static void prog6() {
		List<Integer> list = Arrays.asList(2,10,2,5,15,10,2);
		
		int max = list.stream().max(Comparator.comparing(Integer :: valueOf)).get();
		
		int min = list.stream().min(Comparator.comparing(Integer :: valueOf)).get();
		
		System.out.println("max = "+ max + " min = "+ min);
	}
	
	//Sort list
    static void prog7() {
    	List<Integer> list = Arrays.asList(2,10,2,5,15,10,2);
    	
    	
    	
    	List<Integer> sortAsc = list.stream().sorted().collect(Collectors.toList());
    	
    	System.out.println("sortAsc = "+sortAsc);
    	
    	List<Integer> sortDesc = list.stream().sorted(Collections.reverseOrder()).collect(Collectors.toList());
    	
    	System.out.println("sortDesc = "+sortDesc);
		
	}

    //limit skip
    static void prog8() {
    	List<Integer> list = Arrays.asList(2,10,2,5,15,10,2);
    	
    	int sumFirstN = list.stream().limit(3).mapToInt(num -> num).sum();
    	
    	int sumFirstN2 = list.stream().limit(3).reduce((a,b) -> a+b).get();
    	
    	
    	int sumSkippingN = list.stream().skip(3).reduce((a,b) -> a+b).get();
    	
    	
    	
    }

    //Find Second lowest/highest number
    static void prog9() {
    	List<Integer> list = Arrays.asList(2,10,2,5,15,10,2);
    	
    	int secH = list.stream().sorted(Collections.reverseOrder()).distinct().skip(1).findFirst().get();
    	
    	System.out.println(" Second highest num = "+ secH);
    	
    	int secL = list.stream().sorted().distinct().skip(1).findFirst().get();
    	
    	System.out.println(" Second lowest num = "+ secL);
    	
    	
    }
    
    //Multiply elements of a list
    static void prog10() {
    	List<Integer> list = Arrays.asList(2,10,2,5);
    	
    	int res = list.stream().reduce((a,b) -> a*b).get();
    	System.out.println(res);
    }
	
	//Square the integres and find average of those squares values that are less than 100 
	static void prog4() {
		List<Integer> list = Arrays.asList(2,10,12,5,15);
		
		double avg = list.stream()
				.map(num -> num * num)
				.filter(squNum -> squNum < 100)
				.mapToInt(squNum -> squNum)
				.average()
				.getAsDouble();
		
		System.out.println(" avg = "+avg);
		
	}

	//average of odd integers from int list
	static void prog2() {
		List<Integer> list = Arrays.asList(1,2,3,4,5);
		double avg = list.stream().filter(e -> e%2 == 1).mapToInt(e -> e.intValue()).average().getAsDouble();
				
			//	reduce((e1, e2) -> e1 + e2).map(e -> e/2).get();
		System.out.println(" average of "+list + "= "+ avg);
	}
	
	
	
	
	//Interview
	//from list of integers..create list that contains elements that start with number 1
	static void prog1() {
       
        List<Integer> list = Arrays.asList(10, 15, 5, 20, 25, 100);
	
		List<Integer> list2 = list.stream()
				.filter(n -> String.valueOf(n).startsWith("1"))
				.collect(Collectors.toList());
		
		System.out.println(list2);
	}
	
	static void prog3() {
		
		final class Employee{
			int id;
			int age;
			
			Employee(int id, int age){
				this.id = id;
				this.age = age;
			}
		}
		
		List<Employee> list = Arrays.asList(new Employee(123, 23), new Employee(345, 24), new Employee(567, 25));
		
		int sum = list.stream()
				.filter(emp -> emp.age % 2 != 0)
				.map( emp -> emp.age * emp.age)
				.mapToInt(age2 -> age2.intValue())
				.sum();
		
		
		int sum2 = list.stream()
				.filter(emp -> emp.age % 2 != 0)
				.map( emp -> emp.age * emp.age)
				.reduce( (a,b) -> a+b)
				.get();
				
				
		System.out.println(sum);
		System.out.println(sum2);
		
	}
	
	
	public static void main(String[] args) {
        // prog1();	
        // prog2();
        // prog3();
        // prog4();
        // prog5();
        // prog6();
        // prog7();
         //prog8();
        // prog9();
         prog10();

	}

}

