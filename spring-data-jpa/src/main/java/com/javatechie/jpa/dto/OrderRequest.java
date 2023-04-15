package com.javatechie.jpa.dto;

import com.javatechie.jpa.entity.Customer;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;


public class OrderRequest {

    private Customer customer;

    
	public OrderRequest() {
		super();
	}

	public OrderRequest(Customer customer) {
		super();
		this.customer = customer;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	 
	
}
