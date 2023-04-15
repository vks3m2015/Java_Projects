package concepts.string;

//Timetaken in concatenation String > StringBuffer > StringBuilder
public class PerformanceTestForConcat {

	public static void main(String[] args) {
		
		//String
		String str = "Vikas";
		long currentMS = System.currentTimeMillis();
		for(int i = 0; i<= 10000; i++) {
			str = str + " Singh";
		}
		//126ms
		System.out.println(" String time taken = "+ (System.currentTimeMillis() - currentMS));
		
		
	   StringBuffer sbuffer = new StringBuffer("Vikas");
	   currentMS = System.currentTimeMillis(); 
       for(int i = 0; i<= 10000; i++) {
    	   sbuffer.append(" Singh"); 
		}
       //1ms
       System.out.println(" StringBuffer time taken = "+ (System.currentTimeMillis() - currentMS));
       
       
       StringBuilder sbuilder = new StringBuilder("Vikas");	
       currentMS = System.currentTimeMillis();
       for(int i = 0; i<= 10000; i++) {
			sbuilder.append(" Singh");
		}
       //0ms
       System.out.println(" StringBuilder time taken = "+ (System.currentTimeMillis() - currentMS));
	   currentMS = System.currentTimeMillis(); 

	}

}
