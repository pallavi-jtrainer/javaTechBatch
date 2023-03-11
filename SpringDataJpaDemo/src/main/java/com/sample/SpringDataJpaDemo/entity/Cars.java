package com.sample.SpringDataJpaDemo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.sample.SpringDataJpaDemo.utils.FuelTypes;

@Entity
@Table(name="cars")
public class Cars {
	@Id
	@Column(name = "carid" )
	private long carId;
	
	@Column(name="brand", nullable=false, length=100)
	private String brand;
	
	@Column(name="carname", nullable=false, length=100)
	private String carName;
	
	@Column(name="price", nullable=false)
	private double  price;
	
	@Column(name="model", nullable=false, length=100)
	private String model;
	
	@Column(name="color", nullable=false, length=100)
	private String color;
	
	@Column(name = "fueltype", columnDefinition = "varchar(25) not null" )
	private FuelTypes fuelType;
	
	@ManyToOne
	@JoinColumn(name="ownerid")
	private Owner owner;

	public long getCarId() {
		return carId;
	}

	public String getBrand() {
		return brand;
	}

	public String getCarName() {
		return carName;
	}

	public double getPrice() {
		return price;
	}

	public String getModel() {
		return model;
	}

	public String getColor() {
		return color;
	}

	public FuelTypes getFuelType() {
		return fuelType;
	}

	public Owner getOwner() {
		return owner;
	}

	public void setCarId(long carId) {
		this.carId = carId;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public void setCarName(String carName) {
		this.carName = carName;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public void setFuelType(FuelTypes fuelType) {
		this.fuelType = fuelType;
	}

	public void setOwner(Owner owner) {
		this.owner = owner;
	}

	public Cars() {
		
	}

	public Cars(long carId, String brand, String carName, double price, String model, String color, FuelTypes fuelType,
			Owner owner) {
		this.carId = carId;
		this.brand = brand;
		this.carName = carName;
		this.price = price;
		this.model = model;
		this.color = color;
		this.fuelType = fuelType;
		this.owner = owner;
	}

	@Override
	public String toString() {
		return "Cars [carId=" + carId + ", brand=" + brand + ", carName=" + carName + ", price=" + price + ", model="
				+ model + ", color=" + color + ", fuelType=" + fuelType + ", owner=" + owner.toString() + "]";
	}
	
}
