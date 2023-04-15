package concepts;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import concepts.models.Address;

public class CloneUtils {

	public static void main(String[] args) throws JsonProcessingException {
		
		cloneUsingJackson();
		

	}
	
	static void cloneUsingJackson() throws JsonProcessingException {
        ObjectMapper mapper = new ObjectMapper();
		
		Address address = new Address("Knp", "India");
		
		String jsonString = mapper.writeValueAsString(address);
		System.out.println(jsonString);
		
		Address addressClone = mapper.readValue(jsonString, Address.class);
		System.out.println("address clone = "+addressClone);
		
	}

}



