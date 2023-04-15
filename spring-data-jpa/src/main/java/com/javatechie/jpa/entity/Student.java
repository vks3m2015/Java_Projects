package com.javatechie.jpa.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Student {
	@Id
    int id;
    String name;
    
    @ManyToMany
    List<Course> coursesAdopted = new ArrayList<>();
    
}
