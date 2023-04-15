package com.vik.ui.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import com.vik.ui.interceptors.SomeInterceptor;

@Component
public class WebAppConfiguration implements WebMvcConfigurer {
	
	@Autowired
	SomeInterceptor interceptor;
	
	@Override
	public void addInterceptors(InterceptorRegistry registry) {
		registry.addInterceptor(interceptor);
	}

}
