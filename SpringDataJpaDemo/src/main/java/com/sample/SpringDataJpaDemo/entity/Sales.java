package com.sample.SpringDataJpaDemo.entity;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="sales")
public class Sales {
	@Id
	@Column(name = "saleid")
	private long saleId;
	
	@Column(name = "saledate", columnDefinition = "date not null")
	private LocalDate saleDate;
	
	@Column(name="amount", nullable=false)
	private double amount;
	
	@OneToOne
	@JoinColumn(name="carid")
	private Cars car;
	
	@OneToOne
	@JoinColumn(name="buyerid")
	private Buyer buyer;
	
	@OneToOne
	@JoinColumn(name="staffid")
	private Staff staff;

	public long getSaleId() {
		return saleId;
	}

	public LocalDate getSaleDate() {
		return saleDate;
	}

	public double getAmount() {
		return amount;
	}

	public Cars getCar() {
		return car;
	}

	public Buyer getBuyer() {
		return buyer;
	}

	public Staff getStaff() {
		return staff;
	}

	public void setSaleId(long saleId) {
		this.saleId = saleId;
	}

	public void setSaleDate(LocalDate saleDate) {
		this.saleDate = saleDate;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	public void setCar(Cars car) {
		this.car = car;
	}

	public void setBuyer(Buyer buyer) {
		this.buyer = buyer;
	}

	public void setStaff(Staff staff) {
		this.staff = staff;
	}

	public Sales(long saleId, LocalDate saleDate, double amount, Cars car, Buyer buyer, Staff staff) {
		this.saleId = saleId;
		this.saleDate = saleDate;
		this.amount = amount;
		this.car = car;
		this.buyer = buyer;
		this.staff = staff;
	}

	public Sales() {
		
	}

	@Override
	public String toString() {
		return "Sales [saleId=" + saleId + ", saleDate=" + saleDate + ", amount=" + amount + ", car=" + car + ", buyer="
				+ buyer + ", staff=" + staff + "]";
	}
	
	
	
}
