package com.vik.faulttolerance;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
//import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.context.annotation.Bean;
import org.springframework.http.client.HttpComponentsClientHttpRequestFactory;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
//@EnableCircuitBreaker
public class FaultToleranceApplication {

	public static void main(String[] args) {
		SpringApplication.run(FaultToleranceApplication.class, args);
	}
	
	@Bean
	RestTemplate restTemp() {
		//Adding Timeout
		HttpComponentsClientHttpRequestFactory clientHttpRequestFactory = new HttpComponentsClientHttpRequestFactory();
		clientHttpRequestFactory.setConnectTimeout(20000);
		return new RestTemplate(clientHttpRequestFactory);
	}

}
