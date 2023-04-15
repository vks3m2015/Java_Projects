package aware;

import payment.UserService;
import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class ApplicationContextAwareImpl implements ApplicationContextAware {
	
	@Override
	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {

		UserService us = (UserService) applicationContext.getBean(UserService.class);
		us.processPayment();
		System.out.println("us ====" + us);
	}
}