package com.sample.model;

import java.time.LocalDate;
import java.util.Objects;

/**
 * Student class
 * @author Pallavi Prasad
 *
 */
public class Student {
	private int studentId;
	private String name;
	private int age;
	private LocalDate dob;
	private Address address;
	
	public int getStudentId() {
		return studentId;
	}
	
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public int getAge() {
		return age;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public Student() {
		
	}

	public Student(int studentId, String name, int age) {
		this.studentId = studentId;
		this.name = name;
		this.age = age;
	}
	
	public Student(int studentId, String name, int age, LocalDate dob) {
		this.studentId = studentId;
		this.name = name;
		this.age = age;
		this.dob = dob;
	}
	
	public Student(int studentId, String name, int age, Address address) {
		this.studentId = studentId;
		this.name = name;
		this.age = age;
		this.address = address;
	}

	@Override
	public int hashCode() {
		return Objects.hash(age, name, studentId, dob);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		return age == other.age 
				&& Objects.equals(name, other.name) 
				&& studentId == other.studentId
				&& Objects.equals(dob, other.dob);
	}
	
	@Override
	public String toString() {
		return "Student Details: [Id: " + studentId + ", Name: " + name + ", Age: " + age 
				+ ", Date Of Birth: " + dob + "]";
	}
	
	public Address getAddress() {
		return address;
	}
	
	public void setAddress(Address address) {
		this.address = address;
	}
	
	public LocalDate getDob() {
		return dob;
	}
	
	public void setDob(LocalDate dob) {
		this.dob = dob;
	}
}
