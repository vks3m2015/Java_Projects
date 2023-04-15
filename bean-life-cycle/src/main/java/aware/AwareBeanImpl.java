package aware;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import java.util.Arrays;

public class AwareBeanImpl implements BeanNameAware, BeanFactoryAware, ApplicationContextAware {

	static{
		System.out.println("STATIC BLOCK ######### AwareBeanImpl class #########");
	}
    
	@Override
	public void setBeanName(String beanName) {
		System.out.println("BeanNameAware :: setBeanName method of AwareBeanImpl is called, beanName =>"+beanName);
		//System.out.println("setBeanName:: Bean Name defined in context= " + beanName);
	}

	@Override
	public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
		System.out.println("BeanFactoryAware :: setBeanFactory method of AwareBeanImpl is called");
		//System.out.println("setBeanFactory:: AwareBeanImpl singleton= " + beanFactory.isSingleton("awareBean"));
	}

	@Override
	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
		System.out.println("ApplicationContextApplicationContext :: setApplicationContext method of AwareBeanImpl is called, Bean Definition Names= "
				+ Arrays.toString(applicationContext.getBeanDefinitionNames()));
	}
}
