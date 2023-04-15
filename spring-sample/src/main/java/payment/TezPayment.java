package payment;

import org.springframework.stereotype.Service;

@Service
public class TezPayment implements Payment{

	public void doTransaction() {
		System.out.println(" transaction through TEZ....");
		
	}
}
