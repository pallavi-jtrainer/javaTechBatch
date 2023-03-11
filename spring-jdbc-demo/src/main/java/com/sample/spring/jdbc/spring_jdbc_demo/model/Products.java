package com.sample.spring.jdbc.spring_jdbc_demo.model;

public class Products {
	private int productId;
	private String productName;
	private double unitPrice;
	
	public int getProductId() {
		return productId;
	}
	
	public void setProductId(int productId) {
		this.productId = productId;
	}
	
	public String getProductName() {
		return productName;
	}
	
	public void setProductName(String productName) {
		this.productName = productName;
	}
	
	public double getUnitPrice() {
		return unitPrice;
	}
	
	public void setUnitPrice(double price) {
		this.unitPrice = price;
	}
	
	public Products(int productId, String productName, double price) {
		this.productId = productId;
		this.productName = productName;
		this.unitPrice = price;
	}
	
	public Products() {
		
	}

	@Override
	public String toString() {
		return "Products [productId=" + productId + ", productName=" + productName + ", price=" + unitPrice + "]";
	}
}
