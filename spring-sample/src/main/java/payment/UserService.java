package payment;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class UserService {
	
	@Autowired
	@Qualifier("paytmPayment")
	Payment payment;
	
	public void processPayment()
	{
		System.out.println(" inside class UserService method processPayment");
		payment.doTransaction();
	}

}
