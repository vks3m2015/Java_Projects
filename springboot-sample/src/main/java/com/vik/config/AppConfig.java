package com.vik.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
//import org.springframework.stereotype.Component;

import com.vik.model.Person;

//@Component
//@Configuration
public class AppConfig {
	
	//@Bean
	public Person person() {
		return new Person();
	}

}
