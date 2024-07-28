package com.tiennguyen.betamvc.Customer;

import java.sql.Date;
import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Customer {
	@Id
	@GeneratedValue
	private int id;
	private String zone;
	private String name;
	private LocalDate dob;
	private String address;
	public int getId() {
		return id;
	}
	
	public Customer() {
		
	}
	
	public Customer(int id,String zone, String name, LocalDate dob, String address) {
		super();
		this.id = id;
		this.zone=zone;
		this.name = name;
		this.dob = dob;
		this.address = address;
	}


	public void setId(int id) {
		this.id = id;
	}
	public String getZone() {
		return zone;
	}
	public void setZone(String zone) {
		this.zone = zone;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public LocalDate getDob() {
		return dob;
	}
	public void setDob(LocalDate dob) {
		this.dob = dob;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}


	@Override
	public String toString() {
		return "Customer [id=" + id + ", zone=" + zone + ", name=" + name + ", dob=" + dob + ", address=" + address + "]";
	}
	
	

}
