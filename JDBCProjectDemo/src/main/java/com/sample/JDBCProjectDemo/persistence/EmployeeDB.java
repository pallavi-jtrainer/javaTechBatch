package com.sample.JDBCProjectDemo.persistence;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.sample.JDBCProjectDemo.model.Employee;

public class EmployeeDB {
	private static final String JDBC_URL = "jdbc:mysql://localhost:3306/employeedb";
	private static final String USER = "root";
	private static final String PASS = "Pass1234";
	
	private static int getLastId() {
		int id = 0;
		
		String sql = "SELECT EMPID FROM EMPLOYEE ORDER BY EMPID DESC LIMIT 1";
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection(JDBC_URL, USER, PASS);
			Statement stmt = con.createStatement();
			
			ResultSet rs = stmt.executeQuery(sql);
			while(rs.next()) {
				id = rs.getInt("EMPID");
			}
			con.close();
		} catch (ClassNotFoundException | SQLException e) {
			System.out.println(e.getMessage());
		}
		
		return id;
	}
	
	public static List<Employee> retrieveAllEmployees() {
		List<Employee> eList = new ArrayList<Employee>();
		
		String sql = "SELECT * FROM EMPLOYEE";
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection(JDBC_URL, USER, PASS);
			Statement stmt = con.createStatement();
			
			ResultSet rs = stmt.executeQuery(sql);
			while(rs.next()) {
				Employee e = new Employee();
				e.setEmpId(rs.getInt("EMPID"));
				e.setFirstName(rs.getString("FIRSTNAME"));
				e.setLastName(rs.getString("LASTNAME"));
				e.setEmail(rs.getString("EMAIL"));
				e.setPhone(rs.getString("PHONE"));
				e.setDesignation(rs.getString("DESIGNATION"));
				eList.add(e);
			}
			con.close();
		} catch (ClassNotFoundException | SQLException e) {
			System.out.println(e.getMessage());
		}
		
		return eList;
	}
	
	public static Employee findbyId(int id) {
		Employee e = new Employee();
		
		String sql = "SELECT * FROM EMPLOYEE WHERE EMPID = ?";
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection(JDBC_URL, USER, PASS);
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setInt(1, id);
			ResultSet rs = ps.executeQuery();
			while(rs.next()) {
				e.setEmpId(rs.getInt("EMPID"));
				e.setFirstName(rs.getString("FIRSTNAME"));
				e.setLastName(rs.getString("LASTNAME"));
				e.setEmail(rs.getString("EMAIL"));
				e.setPhone(rs.getString("PHONE"));
				e.setDesignation(rs.getString("DESIGNATION"));
			}
			con.close();
		} catch (ClassNotFoundException | SQLException ex) {
			System.out.println(ex.getMessage());
		}
		
		return e;
	}
	
	public static int insertNewEmployeeDetails(String fName, String lName, String em, String ph, String desig) {
		int id = getLastId();
		int res = 0;
		
		if (id == 0) {
			id = 1;
		} else {
			++id;
		}
		
		String sql = "INSERT INTO EMPLOYEE (EMPID, FIRSTNAME, LASTNAME, EMAIL, PHONE, DESIGNATION) " + 
				"VALUES (?, ?, ?, ?, ?, ?)";
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection(JDBC_URL, USER, PASS);
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setInt(1, id);
			ps.setString(2, fName);
			ps.setString(3, lName);
			ps.setString(4, em);
			ps.setString(5, ph);
			ps.setString(6, desig);
			
			res = ps.executeUpdate();
			con.close();
		} catch (ClassNotFoundException | SQLException ex) {
			System.out.println(ex.getMessage());
		}
		
		return res;
	}
	
	public static int deleteEmployee(int id) {
		String sql = "DELETE FROM EMPLOYEE WHERE EMPID = ?";
		
		int res = 0;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection(JDBC_URL, USER, PASS);
			
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setInt(1, id);
			
			res = ps.executeUpdate();
			con.close();
		} catch (ClassNotFoundException | SQLException ex) {
			System.out.println(ex.getMessage());
		}
		
		return res;
	}
	
	public static int updateEmployee(int id, String ph, String desg) {
		String sql = "UPDATE EMPLOYEE SET PHONE = ?, DESIGNATION = ? WHERE EMPID = ?";
		
		int res = 0;
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection(JDBC_URL, USER, PASS);
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, ph);
			ps.setString(2, desg);
			ps.setInt(3, id);
			
			res = ps.executeUpdate();
			con.close();
		} catch (ClassNotFoundException | SQLException ex) {
			System.out.println(ex.getMessage());
		}
		
		return res;
	
	}
}
