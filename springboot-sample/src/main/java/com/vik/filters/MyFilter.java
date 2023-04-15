package com.vik.filters;

import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Component;
import org.springframework.web.filter.OncePerRequestFilter;
import org.springframework.web.servlet.DispatcherServlet;

@Component
public class MyFilter implements Filter{

	DispatcherServlet ds = null;
	//OncePerRequestFilter
	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {

		HttpServletRequest r1 = (HttpServletRequest) request;
		System.out.println("MyFilter : convert the object to this URL is ::" +r1.getRequestURI());
		chain.doFilter(request, response);
		System.out.println("MyFilter : done with request sending response URL is  ::" +r1.getRequestURI());
	}

}
