package com.sample.spring.jdbc.spring_jdbc_demo.dao;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;

import com.sample.spring.jdbc.spring_jdbc_demo.model.Products;

public class ProductsDaoImpl2 implements ProductsDao{

	private DataSource dataSource;
	
	public void setDataSource(DataSource dataSource) {
		this.dataSource = dataSource;
	}
	
	
	@Override
	public List<Products> listAllProducts() {
		String sql = "SELECT * FROM PRODUCTS";
		
		JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);
		
		List<Products> products = jdbcTemplate.query(sql, 
				new ProductsRowMapper());
		return products;
	}

	@Override
	public Products getProductById(int id) {
		String sql = "SELECT * FROM PRODUCTS WHERE PRODUCTID = ?";
		
		JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);
		
		Products p = jdbcTemplate.queryForObject(sql, 
				new ProductsRowMapper(),
				new Object[] {id});
	
		return p;
	}

	@Override
	public void saveProduct(Products product) {
		String sql = "INSERT INTO PRODUCTS VALUES (?, ?, ?)";
		
		int res = 0;
		
		JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);
		Object[] args = new Object[] {product.getProductId(),
				product.getProductName(),
				product.getUnitPrice()};
		
		res = jdbcTemplate.update(sql, args);
		
		if (res > 0) {
			System.out.println("Product uploaded");
		} else {
			System.out.println("Unable to upload");
		}
		
	}

	@Override
	public void updateProductPrice(int id, double price) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteProduct(int id) {
		// TODO Auto-generated method stub
		
	}

}
