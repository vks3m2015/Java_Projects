package lambdaExp;

import java.util.function.Consumer;

public class ConsumerInterface {

	
	
	public static void main(String[] args) {
		Consumer<String> consumer1 = (str) ->  System.out.println(" 1.. " +str);
		consumer1.accept("hello..");
		
		Consumer<String> consumer2 = (str) ->  System.out.println(" 2.. " +str);
		Consumer<String> consumer3 = (str) ->  System.out.println(" 3.. " +str);
        
        
        consumer2.andThen(consumer3).accept("vikky");
	}

}
