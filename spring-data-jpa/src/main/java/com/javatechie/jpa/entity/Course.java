package com.javatechie.jpa.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Course {
	
	@Id
	int courseId;
	
	String course_name;
	
	

}
