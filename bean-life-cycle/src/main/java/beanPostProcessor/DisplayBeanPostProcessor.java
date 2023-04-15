package beanPostProcessor;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

/* bean post processor process all the bean instances in the IoC container one by one, not just a single bean instance.
 * bean post processors are used for checking the validity of bean properties or 
 *  altering bean properties according to certain criteria
 * 
 */

public class DisplayBeanPostProcessor implements BeanPostProcessor{
	
	public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException
    {
        System.out.println("\nBEANPOSTPROCESSOR :: postProcessBeforeInitialization  for :" + beanName);
        return bean;
    }
    
	public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException
    {
        System.out.println("\nBEANPOSTPROCESSOR :: postProcessAfterInitialization for :" + beanName);
        return bean;
    }

}
