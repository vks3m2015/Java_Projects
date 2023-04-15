package com.javatechie.jpa.entity;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.*;


@Entity
@Table(name="user")
public class User {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	int userId;
	
	@Column(name="simplyName")
	String userName;
	
	@Embedded
	@AttributeOverrides({
		@AttributeOverride(name = "city", column = @Column(name="HOME_CITY_NAME")),
		@AttributeOverride(name = "state", column = @Column(name="HOME_STATE_NAME")),
		@AttributeOverride(name = "pincode", column = @Column(name="HOME_PINCODE"))
	})
	Address homeAddress;
	
	@Embedded
	Address officeAddress;
	/*
	@ElementCollection
	@JoinTable(name="user_children", joinColumns = @JoinColumn(name= "user_id"))
	Collection<Child> listOfChildren = new ArrayList<Child>();
	*/
	
	@OneToMany(mappedBy = "user")
	Collection<Vehicle> vehicle = new ArrayList<>();
	
	/*
	 * @ManyToMany Collection<Gym> gymList = new ArrayList<>();
	 */
	
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
/*	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}*/
	/*public Address getHomeAddress() {
		return homeAddress;
	}
	public void setHomeAddress(Address homeAddress) {
		this.homeAddress = homeAddress;
	}
	public Address getOfficeAddress() {
		return officeAddress;
	}
	public void setOfficeAddress(Address officeAddress) {
		this.officeAddress = officeAddress;
	}*/
	
	
	
	
	
}
