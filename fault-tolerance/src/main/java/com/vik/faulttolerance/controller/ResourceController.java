package com.vik.faulttolerance.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.vik.faulttolerance.service.MyService;

@RestController
public class ResourceController {
	
	@Autowired
	MyService myService;
	
	@GetMapping("/user" )
	String getUsers() {
		return myService.call();
		
	}

}
