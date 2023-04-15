package generalFeatures;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ForEach {

	public static void main(String[] args) {
		
		List<String> languages = new ArrayList<>();
		languages.add("Java");
		languages.add("C");
		languages.add("Python");
		
		//languages.forEach(name -> System.out.println(name));
		
		Map<Integer, String> languageMap = new HashMap<>();
		languageMap.put(1, "Java");
		languageMap.put(2, "C");
		languageMap.put(3, "Python");
		languageMap.put(4, ".NET");
		
		//try{
		languageMap.forEach((key, value) -> {
			
			System.out.println(key +" : "+value);
			
			if(key == 2) languageMap.remove(2);
			
		} );
		/*}catch(Exception e){
			e.printStackTrace();
			
		}*/
		
      //  languageMap.forEach((key, value) -> System.out.println(key +" : "+value));
		
		
		//languageMap.entrySet().forEach(entry -> System.out.println(entry.getKey() + " : "+ entry.getValue()));
		
	}

}
