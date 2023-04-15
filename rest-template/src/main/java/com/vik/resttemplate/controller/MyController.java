package com.vik.resttemplate.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.vik.resttemplate.model.Employee;

@RestController
public class MyController {
	
	@PostMapping("/upload")
	public ResponseEntity<String> upload(@RequestPart("emp") Employee employee,
			@RequestPart("file") MultipartFile file ){
		
		return ResponseEntity.status(HttpStatus.OK).body("Got Request...");
		
	}

}
