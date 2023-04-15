package com.vik.ui.controller;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties("messages")
public class MessageProperties {
	
	private String greeting = "Good Morning ";
	
	public String greeting() {
		return greeting;
	}
	
	public void setGreeting(String greeting) {
		this.greeting = greeting;
	}
}
