package com.sample.SpringDataJpaDemo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "owner")
public class Owner {
	@Id
	@Column(name="ownerid")
	private long ownerId;
	
	@Column(name="ownername", nullable=false, length=150)
	private String ownerName;
	
	@Column(name="email", nullable=false, length=100, unique=true)
	private String email;
	
	@Column(name="passcode", nullable=false, length=100)
	private String passcode;
	
	@Column(name="address", nullable=false)
	private String address;
	
	@Column(name="contact", nullable=false, length=15, unique=true)
	private String contact;

	public long getOwnerId() {
		return ownerId;
	}

	public String getOwnerName() {
		return ownerName;
	}

	public String getEmail() {
		return email;
	}

	public String getPasscode() {
		return passcode;
	}

	public String getAddress() {
		return address;
	}

	public String getContact() {
		return contact;
	}

	public void setOwnerId(long ownerId) {
		this.ownerId = ownerId;
	}

	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void setPasscode(String passcode) {
		this.passcode = passcode;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public void setContact(String contact) {
		this.contact = contact;
	}

	public Owner() {
		
	}

	public Owner(long ownerId, String ownerName, String email, String passcode, String address, String contact) {
		this.ownerId = ownerId;
		this.ownerName = ownerName;
		this.email = email;
		this.passcode = passcode;
		this.address = address;
		this.contact = contact;
	}

	@Override
	public String toString() {
		return "Owner [ownerId=" + ownerId + ", ownerName=" + ownerName + ", email=" + email + ", passcode=" + passcode
				+ ", address=" + address + ", contact=" + contact + "]";
	}
	
}
