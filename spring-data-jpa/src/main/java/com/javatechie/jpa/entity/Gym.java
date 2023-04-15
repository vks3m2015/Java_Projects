package com.javatechie.jpa.entity;

import java.util.ArrayList;
import java.util.Collection;

import javax.persistence.*;

@Entity
public class Gym {
	
	@Id
	@GeneratedValue
	int gymId;
	String gymName;
	
	/*
	 * @ManyToMany(mappedBy = "gymList") Collection<User> userList = new
	 * ArrayList<>();
	 * 
	 * public int getGymId() { return gymId; } public void setGymId(int gymId) {
	 * this.gymId = gymId; } public String getGymName() { return gymName; } public
	 * void setGymName(String gymName) { this.gymName = gymName; }
	 */
	

}
