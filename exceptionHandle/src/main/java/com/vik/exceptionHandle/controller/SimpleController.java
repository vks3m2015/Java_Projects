package com.vik.exceptionHandle.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SimpleController {
	
	//default Error msg 
	/*
{
    "timestamp": "2023-02-13T19:39:03.709+00:00",
    "status": 500,
    "error": "Internal Server Error",
    "path": "/welcome3"
}
	 */
	
	//bydefault it will send 500 status code and default error msg respnse body
	@RequestMapping(value = "/welcome")
	public String arithMeticEx(){
		System.out.println(" in controller......");
		return 1/0 + "";
	}
	
	////bydefault it will send 500 status code and  default error msg respnse body
	@RequestMapping(value = "/welcome2")
	public String nullPointerEx(){
		System.out.println(" in controller......");
		String str = null;
		return str.concat("vikas");
	}
	
	//bydefault it will send 500 status code and respnse body -> {"timestamp": "2023-02-13T19:39:03.709+00:00", "status": 500,"error": "Internal Server Error","path": "/welcome3"}
	@RequestMapping(value = "/welcome3")
	public String Ex() throws Exception{
		System.out.println(" in controller......");
		throw new Exception("Checked Exception...");
	}

}
