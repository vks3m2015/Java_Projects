package com.vik.resttemplate.service;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.ByteArrayResource;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.multipart.MultipartFile;

import com.vik.resttemplate.model.Employee;

@Service
public class MyService {
	
	@Autowired
	RestTemplate restTemplate;
	
	
	
	void uploadWithMetaData(MultipartFile file) throws IOException{
		
		MultiValueMap<String,Object> multipartRequest = new LinkedMultiValueMap<>(); 
        
		//Attachment File header & body
		HttpHeaders requestHeadersAttachment = new HttpHeaders();
		requestHeadersAttachment.setContentType(MediaType.MULTIPART_FORM_DATA);
		
		ByteArrayResource fileAsResource = new ByteArrayResource(file.getBytes()){
		    @Override
		    public String getFilename(){
		        return file.getOriginalFilename();
		    }
		};
		HttpEntity<ByteArrayResource> fileAttachmentment = new HttpEntity<>(fileAsResource,requestHeadersAttachment);
		multipartRequest.set("file",fileAttachmentment);

        // Request Json Header and Body
		HttpHeaders requestHeadersJSON = new HttpHeaders();
		requestHeadersJSON.setContentType(MediaType.APPLICATION_JSON);
		
		Employee employee = new Employee();
		employee.setId(123);
		employee.setName("Vks");
		
		HttpEntity<Employee> requestEntityJSON = new HttpEntity<>(employee, requestHeadersJSON);
		multipartRequest.set("emp",requestEntityJSON);
		
		HttpHeaders requestHeaders = new HttpHeaders();
		requestHeaders.setContentType(MediaType.MULTIPART_FORM_DATA);//Main request's headers

		HttpEntity<MultiValueMap<String,Object>> requestEntity = new HttpEntity<>(multipartRequest,requestHeaders);//final request 

		ResponseEntity<String> response = restTemplate.exchange("http://localhost:8080/employee/email",
				HttpMethod.POST,
				requestEntity,
				String.class);
		
	}

}
