package com.sample.SpringDataJpaDemo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="staff")
public class Staff {
	@Id
	@Column(name="staffid")
	private long staffId;
	
	@Column(name="staffname", nullable=false, length=100)
	private String staffName;
	
	@Column(name="email", nullable=false, length=100, unique=true)
	private String email;
	
	@Column(name="passcode", nullable=false, length=100)
	private String passcode;
	
	@Column(name="contact", nullable=false, length=15, unique=true)
	private String contact;

	public long getStaffId() {
		return staffId;
	}

	public String getStaffName() {
		return staffName;
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

	public void setStaffId(long staffId) {
		this.staffId = staffId;
	}

	public void setStaffName(String staffName) {
		this.staffName = staffName;
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

	public Staff(long staffId, String staffName, String email, String passcode, String contact) {
		this.staffId = staffId;
		this.staffName = staffName;
		this.email = email;
		this.passcode = passcode;
		this.contact = contact;
	}
	
	public Staff() {
		
	}

	@Override
	public String toString() {
		return "Staff [staffId=" + staffId + ", staffName=" + staffName + ", email=" + email + ", passcode=" + passcode
				+ ", contact=" + contact + "]";
	}
	
}
