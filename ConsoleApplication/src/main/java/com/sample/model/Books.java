package com.sample.model;

import java.util.Objects;

public class Books {
	private int bookNo;
	private String title;
	private double price;
	
	public Books() {
		
	}
	
	public Books(int bookNo, String title, double price) {
		super();
		this.bookNo = bookNo;
		this.title = title;
		this.price = price;
	}

	public int getBookNo() {
		return bookNo;
	}

	public void setBookNo(int bookNo) {
		this.bookNo = bookNo;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public int hashCode() {
		return Objects.hash(bookNo, price, title);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Books other = (Books) obj;
		return bookNo == other.bookNo && Double.doubleToLongBits(price) == Double.doubleToLongBits(other.price)
				&& Objects.equals(title, other.title);
	}

	@Override
	public String toString() {
		return "Books [bookNo=" + bookNo + ", title=" + title + ", price=" + price + "]";
	}
	
	
}
