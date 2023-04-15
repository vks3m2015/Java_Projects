package com.vik.faulttolerance.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.fasterxml.jackson.databind.JsonNode;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

@Service
public class MyService {
	
	@Autowired
	RestTemplate restTemplate;
	
	
	@HystrixCommand(fallbackMethod = "defaultResponse")
	public String call() {
		//JsonNode node = restTemplate.getForObject("https://reqres.in/api/user/2", JsonNode.class);
		JsonNode node = restTemplate.getForObject("https://reqres.in/api/users?delay=30000", JsonNode.class);
		
		return node.toString();
	}
	
	private String defaultResponse() {
		return " Default Response...........";
	}
	

}
