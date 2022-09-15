package com.sample.demo.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.sample.demo.model.Employee;

public class EmployeeRowMapper implements RowMapper<Employee>{

	@Override
	public Employee mapRow(ResultSet rs, int rowNum) throws SQLException {
		Employee e = new Employee();
		e.setEmpId(rs.getInt("EMPID"));
		e.setFirstName(rs.getString("FIRSTNAME"));
		e.setLastName(rs.getString("LASTNAME"));
		e.setEmail(rs.getString("EMAIL"));
		e.setPhone(rs.getString("PHONE"));
		e.setDesignation(rs.getString("DESIGNATION"));
		
		return e;
	}
	
}
