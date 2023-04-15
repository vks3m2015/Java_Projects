package com.vik.ui.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class Greeting {
	
	@Autowired
	MessageProperties msgProps;
	
	
	@GetMapping("/greeting")
	public String greeting(@RequestParam String name, Model model) {
		String message = msgProps.greeting() +  "   " + name;
		model.addAttribute("greetingMessage", message);
		return "homePage";
	}

}
