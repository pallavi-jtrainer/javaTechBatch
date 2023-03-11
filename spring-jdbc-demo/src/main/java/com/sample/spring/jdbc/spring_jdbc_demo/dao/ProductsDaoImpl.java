package com.sample.spring.jdbc.spring_jdbc_demo.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import com.sample.spring.jdbc.spring_jdbc_demo.model.Products;

public class ProductsDaoImpl implements ProductsDao {
	
	private DataSource dataSource;
	
	public void setDataSource(DataSource dataSource) {
		this.dataSource = dataSource;
	}

	@Override
	public List<Products> listAllProducts() {
		String sql = "SELECT * FROM PRODUCTS";
		Connection con = null;
		Statement s = null;
		List<Products> products = new ArrayList<Products>();
		
		try {
			con = dataSource.getConnection();
			s = con.createStatement();
			ResultSet rs = s.executeQuery(sql);
			
			while(rs.next()) {
				Products p = new Products();
				p.setProductId(rs.getInt("PRODUCTID"));
				p.setProductName(rs.getString("PRODUCTNAME"));
				p.setUnitPrice(rs.getDouble("UNITPRICE"));
				
				products.add(p);
			}
			
			s.closeOnCompletion();
			con.close();
		} catch (SQLException ex) {
			System.out.println(ex.getMessage());
		}
		return products;
	}

	@Override
	public Products getProductById(int id) {
		String sql = "SELECT * FROM PRODUCTS WHERE PRODUCTID = ?";
		PreparedStatement ps = null;
		Connection con = null;
		
		Products p = new Products();
		try {
			con = dataSource.getConnection();
			ps = con.prepareStatement(sql);
			ps.setInt(1, id);
			ResultSet rs = ps.executeQuery();
			
			while(rs.next()) {
				
				p.setProductId(rs.getInt("PRODUCTID"));
				p.setProductName(rs.getString("PRODUCTNAME"));
				p.setUnitPrice(rs.getDouble("UNITPRICE"));
				
			}
			
			ps.close();
			con.close();
		} catch (SQLException ex) {
			System.out.println(ex.getMessage());
		}
		
		return p;
	}

	@Override
	public void saveProduct(Products product) {
		String sql = "INSERT INTO PRODUCTS VALUES (?, ?, ?)";
		Connection con = null;
		PreparedStatement ps = null;
		
		try {
			con = dataSource.getConnection();
			ps = con.prepareStatement(sql);
			
			ps.setInt(1, product.getProductId());
			ps.setString(2, product.getProductName());
			ps.setDouble(3, product.getUnitPrice());
			
			int res = ps.executeUpdate();
			if (res > 0) {
				System.out.println("Product uploaded successfully");
			} else {
				System.out.println("Product not uploaded");
			}
			
		} catch (SQLException ex) {
			System.out.println(ex.getMessage());
		} finally {
			try {
				ps.close();
				con.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		
	}

	@Override
	public void updateProductPrice(int id, double price) {
		
	}

	@Override
	public void deleteProduct(int id) {
		
	}

}
