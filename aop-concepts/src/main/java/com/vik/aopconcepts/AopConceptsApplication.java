package com.vik.aopconcepts;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.vik.aopconcepts.models.Triangles;

@SpringBootApplication
public class AopConceptsApplication {

	public static void main(String[] args) {
		ApplicationContext applicationContext = SpringApplication.run(AopConceptsApplication.class, args);
		
		/*for (String name : applicationContext.getBeanDefinitionNames()) {
			System.out.println(name);
		}*/
		
		Triangles tri = applicationContext.getBean("triangles", Triangles.class);
		System.out.println("......................."+tri.getName());
	}

}
