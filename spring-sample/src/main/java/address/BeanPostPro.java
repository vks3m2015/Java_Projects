/**
 * 
 */
package address;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

/**
 * @author Vikas Singh
 *
 */
public class BeanPostPro implements BeanPostProcessor {

	@Override
	public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
		System.out.println("bean post pro .......");
		return BeanPostProcessor.super.postProcessBeforeInitialization(bean, beanName);
	}

	@Override
	public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
		System.out.println("bean post pro .......++++++++++");
		return BeanPostProcessor.super.postProcessAfterInitialization(bean, beanName);
	}

}
