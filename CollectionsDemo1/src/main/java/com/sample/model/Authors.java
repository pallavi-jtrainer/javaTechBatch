package com.sample.model;

import java.util.List;
import java.util.Objects;

public class Authors {
	
	private int authorId;
	private String name;
	private List<Books> books;
	
	public int getAuthorId() {
		return authorId;
	}
	
	public void setAuthorId(int authorId) {
		this.authorId = authorId;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public List<Books> getBooks() {
		return books;
	}
	
	public void setBooks(List<Books> books) {
		this.books = books;
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(authorId, books, name);
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Authors other = (Authors) obj;
		return authorId == other.authorId && Objects.equals(books, other.books) && Objects.equals(name, other.name);
	}
	
	@Override
	public String toString() {
		return "Authors [authorId=" + authorId + ", name=" + name + ", books=" + books + "]";
	}
	
	public Authors(int authorId, String name) {
		this.authorId = authorId;
		this.name = name;
	}
	
	public Authors() {
		
	}
	
	public Authors(int authorId, String name, List<Books> books) {
		this.authorId = authorId;
		this.name = name;
		this.books = books;
	}
	
	
}
