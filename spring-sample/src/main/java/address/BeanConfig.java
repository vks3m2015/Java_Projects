package address;

import org.springframework.context.annotation.*;

@Configuration
public class BeanConfig {
	
	@Bean
	public Address address()
	{
		return new Address("kanpur", "up", 208005);
	}
	

}
