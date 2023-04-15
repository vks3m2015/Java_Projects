package com.vik.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.vik.model.Person;

@RestController
public class MyCotroller {
	
	//http://localhost:8080/v2/api-docs    -----> Swagger JSON
	//http://localhost:8080/swagger-ui.html   ----> Swagger UI
	
	
	@RequestMapping(value = "personInfo", commonMethod = RequestMethod.GET )
	public Person getPersonInfo( @RequestParam int id) {
		
		Person person = new Person(11, "vikky", "kanpur"); 
		return person;
	}
	

}
