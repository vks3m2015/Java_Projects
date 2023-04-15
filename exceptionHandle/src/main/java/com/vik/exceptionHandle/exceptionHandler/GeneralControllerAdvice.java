package com.vik.exceptionHandle.exceptionHandler;

import java.util.Date;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.context.request.WebRequest;

import com.vik.exceptionHandle.exceptions.ResourceNotFoundException;
import com.vik.exceptionHandle.model.ErrorMessage;

@RestControllerAdvice
public class GeneralControllerAdvice {
	
	/*
	 * @ExceptionHandler(ArithmeticException.class)
	 * 
	 * @ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR) public ResponseEntity
	 * handleException(ArithmeticException e, WebRequest web) {
	 * System.out.println(" Inside Exception handler............."); return
	 * ResponseEntity.ok("All Good....");
	 * 
	 * }
	 */

	
	@ExceptionHandler(ResourceNotFoundException.class)
	@ResponseStatus(HttpStatus.NOT_FOUND)
	public ErrorMessage handleException2(ResourceNotFoundException e, WebRequest web) {
		System.out.println(" Inside Exception handler.............");
		return new ErrorMessage(HttpStatus.NOT_FOUND.value(), 
				new Date(), 
				e.getMessage(), 
				web.getDescription(false));
	}
	

}
