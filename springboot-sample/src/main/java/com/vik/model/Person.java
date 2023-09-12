package com.vik.model;

import org.springframework.stereotype.Component;

//@Component
public class Person {
	
	int id;
	String name;
	
	public Person() {
		super();
		System.out.println(" default constructor of Person class called...");
	}

	public Person(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + "]";
	}
	
	
	

}
