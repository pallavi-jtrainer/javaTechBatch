package com.sample.JdcDemoProject.model;

import java.sql.Date;
import java.time.LocalDate;
import java.util.Objects;

import com.sample.JdcDemoProject.factory.ActorFactory;

public class Actor {
	private int actorId;
	private String firstName;
	private String lastName;
	private LocalDate dob;
	private String phone;
	private double fees;
	private Gender gender;
	
	public int getActorId() {
		return actorId;
	}
	
	public void setActorId(int actorId) {
		this.actorId = actorId;
	}
	
	public String getFirstName() {
		return firstName;
	}
	
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	public String getLastName() {
		return lastName;
	}
	
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	public LocalDate getDob() {
		return dob;
	}
	
	public void setDob(LocalDate dob) {
		this.dob = dob;
	}
	
	public String getPhone() {
		return phone;
	}
	
	public void setPhone(String phone) {
		this.phone = phone;
	}
	
	public double getFees() {
		return fees;
	}
	
	public void setFees(double fees) {
		this.fees = fees;
	}
	
	public Gender getGender() {
		return gender;
	}
	
	public void setGender(Gender gender) {
		this.gender = gender;
	}
	
	@Override
	public String toString() {
		return "Actor [actorId=" + actorId + ", firstName=" + firstName + ", lastName=" + lastName + ", dob=" + dob
				+ ", phone=" + phone + ", fees=" + fees + ", gender=" + gender + "]";
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(actorId, dob, fees, firstName, gender, lastName, phone);
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Actor other = (Actor) obj;
		return actorId == other.actorId && Objects.equals(dob, other.dob)
				&& Double.doubleToLongBits(fees) == Double.doubleToLongBits(other.fees)
				&& Objects.equals(firstName, other.firstName) && gender == other.gender
				&& Objects.equals(lastName, other.lastName) && Objects.equals(phone, other.phone);
	}
	
	
	public Actor() {
		
	}

	public Actor(int actorId, String firstName, String lastName, LocalDate dob, String phone, double fees,
			Gender gender) {
		this.actorId = actorId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.dob = dob;
		this.phone = phone;
		this.fees = fees;
		this.gender = gender;
	}
	
	public String addNewActor(String fName, String lName, String ph, double sal, LocalDate birthDate, String gen) {
		Date sqlDate = Date.valueOf(birthDate);
		
		String str = "Unable to add actor details";
		
		int res = 0;
		if (gen.equals(Gender.MALE.name()) || gen.equals(Gender.FEMALE.name())) {
			res = ActorFactory.addNewActor(fName, lName, ph, sal, sqlDate, gen);
			if(res > 0) {
				str = "Actor details added successfully";
			}
		}
		
		return str;
	}
}
