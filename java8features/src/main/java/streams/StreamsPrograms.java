package streams;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.function.Function;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import beans.Employee;
import beans.Student;

//TODO - https://stackoverflow.com/questions/63783027/how-to-group-and-aggregate-using-maxby-in-java-stream

public class StreamsPrograms {
	
	static void commonElements() {
		//list1 = {1,2,3,4,5}  
		//list2 = {3,4,5,6,7}
	    //Find out the common elements from the two lists (O/P - 3,4,5)
	}
	
	static void occuranceOfChars() {
		String str = "iamahumanbeing";
		//Note -> conversion string to stream
		Map<Character, Long> map = str.chars().mapToObj(ch -> (char) ch)
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
	    System.out.println(" map = "+ map); 
	}
	 
	
	static void topkOccurigWords() {
		String str = "the day is sunny day is sunny sunday sunny ";
		
		String[] strArr = str.split("\\s");
		
		Comparator<String> strComp = (str1, str2) -> str1.compareTo(str2) ;
		
		Comparator<Map.Entry<String, Integer>> entryComp = (entry1, entry2) -> entry1.getValue().compareTo(entry2.getValue()) ;
		
		
		Map<String, Integer> map2 = new TreeMap<>(strComp);

		
		
		
		Map<String, Long> map = Stream.of(str.split("\\s"))      //Arrays.stream(str.split("\\s"))
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
				.entrySet().stream()
				.sorted(Map.Entry.<String, Long>comparingByValue().reversed()).limit(3)
				// .map(entry -> entry.getKey())
				.collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (k1, k2) -> k1, LinkedHashMap::new));

		System.out.println("Top 3 occuring words = " + map);

	}
	
	//to complete
	static void studentsHavingMaxMarksPerSection() {
		List<Student> students = List.of(
				new Student(90, "A", "1", List.of(12,8)),
				new Student(80, "B", "1", List.of(11,9)),
				new Student(75, "C", "1", List.of(10,6)),
				new Student(93, "P", "2", List.of(6,8)),
				new Student(70, "Q", "2", List.of(8,10)),
				new Student(75, "X", "3", List.of(3,2)),
				new Student(75, "Y", "3", List.of(4,5))
				);
		
		Map<String, List<Student>> result = students.stream().collect(
				Collectors.groupingBy(Student :: getSection, Collectors.toList()));
		
		
		/*
		 * Map<String, Student> result2 = students.stream().collect(
		 * Collectors.groupingBy(Student :: getSection,
		 * Collectors.collectingAndThen(Collectors.maxBy(Comparator.comparing((Student
		 * stu) -> stu.getMarks().stream().mapToInt(m -> m).sum())), Optional::get));
		 */
		System.out.println(" map = "+ result);
		
		Student st = students.stream().max((stu1, stu2) -> 
		  stu2.getMarks().stream().mapToInt(m -> m).sum() - stu2.getMarks().stream().mapToInt(m -> m).sum()
		  ).get();
		
		//students.stream().max(Comparator.comparing(stu -> stu.getMarks().stream().mapToInt(m -> m).sum()));
		
		System.out.println(st);
		
		
	}
	
	static void sortMapByValue() {
		
		Map<String, Integer> budget = new HashMap<>();
	    budget.put("clothes", 120);
	    budget.put("grocery", 150);
	    budget.put("transportation", 100);
	    budget.put("utility", 130);
	    budget.put("rent", 1150);
	    budget.put("miscellneous", 90);
	    
	    System.out.println(" map = "+budget);
	    
	    //Ascending Order 
	    Map<String, Integer> sortedBudget = budget.entrySet().stream()
	    		.sorted(Map.Entry.comparingByValue())
	    		.collect(Collectors.toMap(Map.Entry :: getKey, Map.Entry :: getValue, (a,b) -> a, LinkedHashMap:: new));
	    
	    System.out.println(" sorted map = "+ sortedBudget);
	    
	    //Descending Order
	    Map<String, Integer> sortedBudgetReversed = budget.entrySet().stream()
	    		.sorted(Map.Entry.<String, Integer>comparingByValue().reversed())
	    		.collect(Collectors.toMap(Map.Entry :: getKey, Map.Entry :: getValue, (a,b) -> a, LinkedHashMap:: new));
	    
	    System.out.println(" reversed sorted map = "+ sortedBudgetReversed);
	    
		
	}
	
	static void findSecondHighestSalaryEmployeeName() {
		List<Employee> empList = Arrays.asList(
				new Employee(222, "A", 2000, "Knp", "UP"),
				new Employee(111, "B", 3000, "Knp", "UP"), 
				new Employee(333, "C", 3500, "Pune", "MH"),
				new Employee(333, "P", 3500, "Pune", "MH"),
				new Employee(123, "D", 3700, "Mumbai", "MH"),
				new Employee(123, "Z", 3700, "Mumbai", "MH"));
		
		//multiple employees having same salary (this will not work in that case)
		String name = empList.stream()
				.sorted(Comparator.comparing((Employee emp) -> emp.getSalary()).reversed())
				//.sorted((e1, e2) -> Double.valueOf(e2.getSalary()).compareTo(Double.valueOf(e1.getSalary()) ))
				.limit(2)
				.skip(1)
				.map(emp -> emp.getName())
				.findFirst()
				.get();
		
		System.out.println(" 2nd Highest Salary Employee name = "+name); //Z
		
		
		List<String> em = empList.stream().collect(Collectors.groupingBy(e -> e.getSalary()))
		    .entrySet().stream().sorted(Map.Entry.<Double, List<Employee>>comparingByKey().reversed())
		    .skip(1).findFirst().map(entry -> entry.getValue()).get().stream().map(emp -> emp.getName()).collect(Collectors.toList());
		    
		System.out.println(" 2nd Highest Salary Employee name.... = "+em);  //C,P
		
	}
	
	static void firstSortSalaryThenName() {
		List<Employee> empList = Arrays.asList(
				new Employee(222, "A", 5000.50),
				new Employee(111, "C", 3000.40), 
				new Employee(333, "B", 3000.40),
				new Employee(123, "A", 3700));
		
		
		List<Employee> sorted = empList.stream()
				///.sorted(Comparator.comparing( (Employee e) -> e.salary).thenComparing((Employee e) -> e.name))
				.sorted(Comparator.comparing( Employee :: getSalary).thenComparing(Employee :: getName	))

				.collect(Collectors.toList());
		
		System.out.println(" sorted : "+sorted);
		
		
	}
	
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
    	
    	//list = List.of(1,2,3);
    	
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
         //prog10();
		findSecondHighestSalaryEmployeeName();
		//firstSortSalaryThenName();
		//sortMapByValue();
		//studentsHavingMaxMarksPerSection();
		//topkOccurigWords();
		//occuranceOfChars();

	}

}

