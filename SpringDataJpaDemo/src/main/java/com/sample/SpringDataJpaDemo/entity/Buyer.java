package com.sample.SpringDataJpaDemo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "buyer")
public class Buyer {
	@Id
	@Column(name="buyerid")
	private long buyerId;
	
	@Column(name="buyername", nullable=false, length=150)
	private String buyerName;
	
	@Column(name="email", nullable=false, length=100, unique=true)
	private String email;
	
	@Column(name="passcode", nullable=false, length=75)
	private String passcode;
	
	@Column(name="contact", nullable=false, length=15, unique=true)
	private String contact;
	
	@Column(name="address", nullable=false)
	private String address;

	public long getBuyerId() {
		return buyerId;
	}

	public String getBuyerName() {
		return buyerName;
	}

	public String getEmail() {
		return email;
	}

	public String getPasscode() {
		return passcode;
	}

	public String getContact() {
		return contact;
	}

	public String getAddress() {
		return address;
	}

	public void setBuyerId(long buyerId) {
		this.buyerId = buyerId;
	}

	public void setBuyerName(String buyerName) {
		this.buyerName = buyerName;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void setPasscode(String passcode) {
		this.passcode = passcode;
	}

	public void setContact(String contact) {
		this.contact = contact;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Buyer() {
		
	}

	@Override
	public String toString() {
		return "Buyer [buyerId=" + buyerId + ", buyerName=" + buyerName + ", email=" + email + ", passcode=" + passcode
				+ ", contact=" + contact + ", address=" + address + "]";
	}

	public Buyer(long buyerId, String buyerName, String email, String passcode, String contact, String address) {
		this.buyerId = buyerId;
		this.buyerName = buyerName;
		this.email = email;
		this.passcode = passcode;
		this.contact = contact;
		this.address = address;
	}
	
	
	
}
