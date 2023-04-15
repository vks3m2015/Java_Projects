package com.vik.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.vik.model.Address;
import com.vik.model.Person;

@RestController
public class SampleController {
	
	@RequestMapping(value = "/welcome")
	public String sayHi(){
		return "Hi";
	}
	
	//, consumes = MediaType.APPLICATION_XML_VALUE, headers = "Accept=application/xml"
	@RequestMapping(value = "/address", method = RequestMethod.POST)
	public Address getAddress(@RequestBody Person person){
		
		System.out.println("person =="+person);
		
		Address address = new Address("kanpur", "UP", 208005);
		return address;
	}
	
	@RequestMapping(value = "/info/{id}", method = RequestMethod.GET )
	public void getInfo(@PathVariable("id") String id, @RequestParam("flag") String flag){
		
		System.out.println(" id =="+id + " flag ="+flag);
	}

}
