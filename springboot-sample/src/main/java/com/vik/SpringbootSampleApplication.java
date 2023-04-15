package com.vik;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
//import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.web.WebApplicationInitializer;

import com.vik.config.AppConfig;
import com.vik.model.Person;

@SpringBootApplication  //(scanBasePackages = "com.vik.*")
//@ConditionalOnClass
//@ConditionalOnProperty
//@EnableWebSecurity
public class SpringbootSampleApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootSampleApplication.class, args);
		
		/*
		 * AnnotationConfigApplicationContext ctx = new
		 * AnnotationConfigApplicationContext(); ctx.register(AppConfig.class);
		 * ctx.refresh();
		 * 
		 * Person p1 = ctx.getBean(Person.class); Person p2 = ctx.getBean(Person.class);
		 * 
		 * 
		 * ctx.close();
		 */
		
		
	}

}
