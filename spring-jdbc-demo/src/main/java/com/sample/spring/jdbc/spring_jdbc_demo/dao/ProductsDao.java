package com.sample.spring.jdbc.spring_jdbc_demo.dao;

import java.util.List;

import com.sample.spring.jdbc.spring_jdbc_demo.model.Products;

public interface ProductsDao {
	public List<Products> listAllProducts();
	public Products getProductById(int id);
	
	public void saveProduct(Products product);
	
	public void updateProductPrice(int id, double price);
	public void deleteProduct(int id);
}
