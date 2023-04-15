/* Q- Can we remove elements from HashMap while traversing it ?
 * 
 */
package hashMapConcepts;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

public class RemoveFromHashMap {
	
	public static void main(String[] arg)
	{
		
		/*  HashMap - FAIL FAST
		 * 
		 */
		Map<Integer, String> map = new HashMap<Integer, String>();
		
		map.put(1, "vikas");
		map.put(2, "ut");
		map.put(3, "deep");
		map.put(4, "someone");
		
		Set<Map.Entry<Integer, String>> entrySet = map.entrySet();
		
		for(Map.Entry<Integer, String> entry : entrySet)
		{
			Integer key = entry.getKey();
			String value = entry.getValue();
			
			System.out.println(" key ="+ key + "  value ="+value);
			
			/* It will throw - ConcurrentModificationException
			 * 
			 * if(key == 3)
				 map.remove(entry.getKey());
			*/
		}
		//map.remove(3);
		
		Iterator<Map.Entry<Integer, String>> itr = entrySet.iterator();
		
		while(itr.hasNext())
		{
			Map.Entry<Integer, String> entry = itr.next();
			
			Integer key = entry.getKey();
			String value = entry.getValue();
			
			System.out.println("Through Iterator :  key ="+ key + "  value ="+value);
			
			if(key == 3)
			{
				itr.remove();        //We can remove elements of HashMap through iterator 
				// map.remove(3);   //It will throw - ConcurrentModificationException
				//map.put(3, "x");   //It will throw - ConcurrentModificationException
			}
		}	
		
		
		System.out.println(" after removing... ");
		for(Map.Entry<Integer, String> entry : entrySet)
		{
			System.out.println(" key ="+ entry.getKey() + "  value ="+entry.getValue());
		}
		
		
		/*  ConcurrentHashMap - FAIL SAFE
		 * 
		 * 
		 */
        Map<Integer, String> ccmap = new ConcurrentHashMap<Integer, String>();
		
		ccmap.put(1, "vikas");
		ccmap.put(2, "ut");
		ccmap.put(3, "deep");
		ccmap.put(4, "someone");
		
		for(Map.Entry<Integer, String> entry : ccmap.entrySet())
		{
			Integer key = entry.getKey();
			String value = entry.getValue();
			
			System.out.println(" ConcurrentHashMap  key ="+ key + "  value ="+value);
			
			/* It will NOT throw - ConcurrentModificationException
			 * 
			 * */
			  if(key == 2)
			  {	  
				// System.out.println("inside if .. inside iteraton of concurrent hash map"); 
				 map.remove(key);
			  }	 
			
		}
		
		System.out.println(" \n After removing from ConcurrentHashMap ... ");    //Tosee removal or addition to map is not refleted here why??
		for(Map.Entry<Integer, String> entry : ccmap.entrySet())
		{
			System.out.println(" key ="+ entry.getKey() + "  value ="+entry.getValue());
		}
		
		
		
		Map<String, Integer> nameSalMap = new HashMap<String, Integer>();
		nameSalMap.put("A", 8000);
		nameSalMap.put("B", 12000);
		nameSalMap.put("C", 7000);
		
		//Increase salary by 2000 of those employees who have salary less than 10000
		//hire a new emp if already a emp with 12000
		
		for(Map.Entry<String, Integer> entry : nameSalMap.entrySet())
		{
			String key = entry.getKey();
			Integer value = entry.getValue();
			if(value < 10000)
				nameSalMap.put(key, value+2000);    //y not exception here??
			
			if(value == 12000)
				nameSalMap.put("D", 12000);
			
		}		
				
			
				
				
		System.out.println(" \n After removing from  name -salary HashMap ... ");    //Tosee removal or addition to map is not refleted here why??
		for(Map.Entry<String, Integer> entry : nameSalMap.entrySet())
		{
			System.out.println(" key ="+ entry.getKey() + "  value ="+entry.getValue());
		}		
				
				
				
				
				
				
				
				
		
	}

}



