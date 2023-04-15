package hashMapConcepts;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

import java.util.*;

public class Test {
	
	public static void main(String[] arg)
	{
		
		LinkedList<String> ll = new LinkedList<String>();
		/*ConcurrentHashMap<String, String> hm = new ConcurrentHashMap<String, String>();
		hm.put("name", "vikas");
		hm.put("company", "aricent");
		hm.put("desig", "SE");
		
		
		Set<Entry<String, String>> st = hm.entrySet();
		
		System.out.println("set =="+ st);
		
		for(Entry<String, String> entry : st)
		{
			System.out.println("  === "+entry);
		}
		
		
		int i = 'a';
		System.out.println(" i == "+i);
		
		String s = "vikas";
		String t = "svika";
		
		System.out.println(" hashcode  s = "+s.hashCode() + "  hashcode  t = "+t.hashCode());
		
		
		int a;
		if((a = 10) == 12)
		{}
		
		System.out.println("  value of a =="+ (a=12));
		
		byte by = 50;
		//by = by * 65;     //compile time error
		
		by = (byte)(by*50);
		
		System.out.println( " by = "+ by);*/
	/*	int h =0;
		for (int i = 0; i < 4; i++) {
            h = 31 * h +  1;
            
            System.out.println(" h == "+h);
        }
		
		System.out.println(" -- "+ (2^3));
		
		*/
		Employee emp = new Employee();
		
		HashMap<Employee, Integer> emap = new HashMap<Employee, Integer>();
		//System.out.println(" put ====="+emap.put(emp, 51393));
		//System.out.println(" put 2====="+emap.put(emp, 51394));
		
		//emp.setCompany("Cavisson");
		//System.out.println("  emp id =="+ emap.get(emp));
		
		emap.size();
		
		Integer x =5;
		System.out.println(" ..........."+ x.equals(5));
		
		//System.out.println(" ..........."+ (new Integer(5) instanceof Integer));
		

	}

}
