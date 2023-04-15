package com.javatechie.jpa.entity;

import javax.persistence.*;

@Entity
public class Vehicle {
	
	@Id
	@GeneratedValue
	int vehicleId;
	String vehicleName;
	
	@ManyToOne
	@JoinColumn(name="user_id")
	User user;
	
	public int getVehicleId() {
		return vehicleId;
	}
	public void setVehicleId(int vehicleId) {
		this.vehicleId = vehicleId;
	}
	public String getVehicleName() {
		return vehicleName;
	}
	public void setVehicleName(String vehicleName) {
		this.vehicleName = vehicleName;
	}
	
	

}
