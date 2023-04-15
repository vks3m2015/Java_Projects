package com.javatechie.jpa.entity;

import javax.persistence.*;

@Entity
public class PostComment {

	@Id
	@GeneratedValue
	private Long id;
	
	private String review;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getReview() {
		return review;
	}
	public void setReview(String review) {
		this.review = review;
	}
	
	
	
}
