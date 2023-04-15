package payment;

import org.springframework.stereotype.Service;

@Service
public class PaytmPayment implements Payment{

	public void doTransaction() {
		System.out.println(" transaction through PAYTM....");
	}
}
