package com.javatechie.jpa.controller;

import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.databind.JsonNode;
import com.javatechie.jpa.entity.User;
import com.javatechie.jpa.repository.UserRepository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@RestController
public class UserController {
	
	@Autowired
	UserRepository userRepository;
	
	@PostMapping("/userDetails")
	public void userDetails(@RequestBody User user){
		userRepository.save(user);
		
	}
	
	@GetMapping("/users")
	public List<User> users(){
		return userRepository.findAll();
	}
	
	@GetMapping("/test")
	public void test(){
		
		System.out.println("..."+ userRepository.getClass().getName());
	}
	

}
