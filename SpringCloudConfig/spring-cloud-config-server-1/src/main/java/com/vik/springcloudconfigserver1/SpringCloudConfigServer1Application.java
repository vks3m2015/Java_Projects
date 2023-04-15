package com.vik.springcloudconfigserver1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class SpringCloudConfigServer1Application {

	public static void main(String[] args) {
		SpringApplication.run(SpringCloudConfigServer1Application.class, args);
	}

}
