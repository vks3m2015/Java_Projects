package hashMapConcepts;

//https://www.journaldev.com/780/comparable-and-comparator-in-java-example --NEED TO DO

import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class SortByValues {
  public static void main(String[] args) {
      HashMap<Integer, String> hmap = new HashMap<Integer, String>();
      hmap.put(5, "A");
      hmap.put(11, "C");
      hmap.put(4, "Z");
      hmap.put(77, "Y");
      hmap.put(9, "P");
      hmap.put(66, "Q");
      hmap.put(0, "R");
      
      
      System.out.println("Before Sorting:");
      
      Set<Map.Entry<Integer, String>> set = hmap.entrySet();
      Iterator<Map.Entry<Integer, String>> iterator = set.iterator();
      
      while(iterator.hasNext()) 
      {
           Map.Entry<Integer, String> me = iterator.next();
           System.out.print(me.getKey() + ": ");
           System.out.println(me.getValue());
      }
      
      
      Map<Integer, String> map = sortByValues(hmap); 
      
      System.out.println("After Sorting:");
      
      Set<Map.Entry<Integer, String>> set2 = map.entrySet();
      Iterator<Map.Entry<Integer, String>> iterator2 = set2.iterator();
      
      while(iterator2.hasNext()) 
      {
           Map.Entry<Integer, String> me2 = iterator2.next();
           System.out.print(me2.getKey() + ": ");
           System.out.println(me2.getValue());
      }
  }

  private static HashMap<Integer, String> sortByValues(HashMap<Integer, String> map) 
  { 
	  
       List<Map.Entry<Integer, String>> list = new LinkedList<Map.Entry<Integer, String>>(map.entrySet());
       
       // Defined Custom Comparator here
       Collections.sort(list, new Comparator<Map.Entry<Integer, String>>() 
       {
    	   
            public int compare(Map.Entry<Integer, String> o1, Map.Entry<Integer, String> o2) {
               return (o1.getValue()).compareTo(o2.getValue());
            }
       });

       // Here I am copying the sorted list in HashMap
       // using LinkedHashMap to preserve the insertion order
       HashMap<Integer, String> sortedHashMap = new LinkedHashMap<Integer, String>();
       for (Iterator<Map.Entry<Integer, String>> it = list.iterator(); it.hasNext();) {
              Map.Entry<Integer, String> entry = it.next();
              sortedHashMap.put(entry.getKey(), entry.getValue());
       } 
       return sortedHashMap;
  }
}