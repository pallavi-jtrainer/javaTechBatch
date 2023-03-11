package com.sample.spring.jdbc.spring_jdbc_demo.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.sample.spring.jdbc.spring_jdbc_demo.model.Products;

public class ProductsRowMapper implements RowMapper<Products>{

	@Override
	public Products mapRow(ResultSet rs, int rowNum) throws SQLException {
		Products p = new Products();
		p.setProductId(rs.getInt("PRODUCTID"));
		p.setProductName(rs.getString("PRODUCTNAME"));
		p.setUnitPrice(rs.getDouble("UNITPRICE"));
		return p;
	}

}
