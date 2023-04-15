package com.javatechie.jpa.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

@Entity
public class Post {

	@Id
	@GeneratedValue
	@Column(name = "ID")
	Long id;
	
	@Column(name = "TITLE")
	String title;
	
	@OneToMany
	@JoinColumn(name = "POST_ID")
	List<PostComment> comments = new ArrayList<>();
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	
	
}
