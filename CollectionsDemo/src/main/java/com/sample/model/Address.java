package com.sample.model;

public class Address {
	private int doorNo;
	private String street;
	private String city;
	public int getDoorNo() {
		return doorNo;
	}
	public void setDoorNo(int doorNo) {
		this.doorNo = doorNo;
	}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public Address(int doorNo, String street, String city) {
		this.doorNo = doorNo;
		this.street = street;
		this.city = city;
	}
	
	public Address() {
		
	}
}
