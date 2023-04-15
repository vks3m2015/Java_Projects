package com.vik.exceptionHandle.model;

import java.util.Date;

import lombok.Builder;
import lombok.Value;

//@Value
//@Builder
public class ErrorMessage {
	
	int statusCode;
	Date timestamp;
	String message;
	String description;
	public ErrorMessage(int statusCode, Date timestamp, String message, String description) {
		super();
		this.statusCode = statusCode;
		this.timestamp = timestamp;
		this.message = message;
		this.description = description;
	}

	
	
}
