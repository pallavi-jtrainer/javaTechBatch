package com.sample.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.sample.entity.Employee;

public class EmployeeDaoImpl implements EmployeeDao{
	final String url = "jdbc:mysql://localhost:3306/sampledb?useSSL=false";
	final String user = "root";
	final String pass = "Pass1234";
	
	@Override
	public int createEmployee(Employee e) {
		int res = 0;
		String sql = "INSERT INTO EMPLOYEE (EMPLOYEENAME, SALARY) VALUES (?, ?)";
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection(url, user, pass);
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, e.getEmployeeName());
			ps.setDouble(2, e.getSalary());
			
			res = ps.executeUpdate();
			
			con.close();
		} catch (ClassNotFoundException | SQLException ex) {
			System.out.println(ex.getMessage());
		}
		return res;
	}

	@Override
	public List<Employee> retrieveAllEmployees() {
		List<Employee> eList = new ArrayList<Employee>();
		
		String sql = "SELECT * FROM EMPLOYEE";
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection(url, user, pass);
			Statement stmt = con.createStatement();
			
			ResultSet rs = stmt.executeQuery(sql);
			
			while(rs.next()) {
				Employee e = new Employee();
				e.setEmployeeId(rs.getInt("EMPLOYEEID"));
				e.setEmployeeName(rs.getString("EMPLOYEENAME"));
				e.setSalary(rs.getDouble("SALARY"));
				
				eList.add(e);
			}
			
			con.close();
		} catch (ClassNotFoundException | SQLException ex) {
			System.out.println(ex.getMessage());
		}
		
		return eList;
	}

	@Override
	public Employee getEmployeeById(int id) {
		String sql = "SELECT * FROM EMPLOYEE WHERE EMPLOYEEID = ?";
		Employee e = new Employee();
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection(url, user, pass);
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setInt(1, id);
			
			ResultSet rs = ps.executeQuery();
			
			while(rs.next()) {
				e.setEmployeeId(rs.getInt("EMPLOYEEID"));
				e.setEmployeeName(rs.getString("EMPLOYEENAME"));
				e.setSalary(rs.getDouble("SALARY"));
				
			}
			con.close();
		} catch (ClassNotFoundException | SQLException ex) {
			System.out.println(ex.getMessage());
		}
		return e;
	}

}
