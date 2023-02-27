package com.sample.model;

import java.util.Objects;

public class Books implements Comparable<Books>{
	private int bookId;
	private String title;
	private double price;
	public int getBookId() {
		return bookId;
	}
	public void setBookId(int bookId) {
		this.bookId = bookId;
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
		return Objects.hash(bookId, price, title);
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
		return bookId == other.bookId && Double.doubleToLongBits(price) == Double.doubleToLongBits(other.price)
				&& Objects.equals(title, other.title);
	}
	@Override
	public String toString() {
		return "Books [bookId=" + bookId + ", title=" + title + ", price=" + price + "]";
	}
	
	public Books() {
		
	}
	public Books(int bookId, String title, double price) {
		this.bookId = bookId;
		this.title = title;
		this.price = price;
	}
	@Override
	public int compareTo(Books o) {
		return o.getBookId();
	}
	
	
}
