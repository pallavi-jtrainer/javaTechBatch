package com.sample.model;

public class Student {
	private static int studentId;
	private String name;
	
	public static int getStudentId() {
		return studentId;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String argName) {
		name = argName;
	}
	
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
	
	public static class Address {
		private int pincode;
		private String city;
		
		@Override
		public String toString() {
			return "Details: [Id: "+ getStudentId()  + "]";
		}
		
		public void setCity(String city) {
			this.city = city;
		}
		
		public void setPincode(int pincode) {
			this.pincode = pincode;
		}
		
		public String getCity() {
			return city;
		}
		
		public int getPincode() {
			return pincode;
		}
		
	}
	
	
}
