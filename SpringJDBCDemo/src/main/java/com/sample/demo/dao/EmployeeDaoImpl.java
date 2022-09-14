package com.sample.demo.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import com.sample.demo.model.Employee;

public class EmployeeDaoImpl implements IEmployeeDao {

	private DataSource dataSource;
	
	public void setDataSource(DataSource dataSource) {
		this.dataSource = dataSource;
	}
	
	private int getLastId() {
		int id = 0;
		
		String sql = "SELECT EMPID FROM EMPLOYEE ORDER BY EMPID DESC LIMIT 1";
		
		Connection con = null;
		Statement stmt = null;
		ResultSet rs = null;
		
		try {
			con = dataSource.getConnection();
			
			stmt = con.createStatement();
			rs = stmt.executeQuery(sql);
			
			while(rs.next()) {
				id = rs.getInt("EMPID");
			}
		} catch (SQLException ex) {
			System.out.println(ex.getMessage());
		} finally {
			try {
				rs.close();
				stmt.close();
				con.close();
			} catch (SQLException ex) {
				System.out.println(ex.getMessage());
			}
		}
		
		return id;
	}
	
	@Override
	public List<Employee> getAll() {
		String sql = "SELECT * FROM EMPLOYEE";
		List<Employee> list = new ArrayList<Employee>();
		
		Connection con = null;
		Statement stmt = null;
		ResultSet rs = null;
		
		try {
			con = dataSource.getConnection();
			
			stmt = con.createStatement();
			rs = stmt.executeQuery(sql);
			
			while(rs.next()) {
				Employee e = new Employee();
				e.setEmpId(rs.getInt("EMPID"));
				e.setFirstName(rs.getString("FIRSTNAME"));
				e.setLastName(rs.getString("LASTNAME"));
				e.setEmail(rs.getString("EMAIL"));
				e.setPhone(rs.getString("PHONE"));
				e.setDesignation(rs.getString("DESIGNATION"));
				list.add(e);
			}
			
		} catch (SQLException ex) {
			System.out.println(ex.getMessage());
		} finally {
			try {
				rs.close();
				stmt.close();
				con.close();
			} catch (SQLException e) {
				System.out.println(e.getMessage());
			}
		}
		
		return list;
	}

	@Override
	public Employee getById(int id) {
		Employee e = new Employee();
		
		String sql = "SELECT * FROM EMPLOYEE WHERE EMPID = ?";
		
		Connection con = null;
		PreparedStatement stmt = null;
		ResultSet rs = null;
		
		try {
			con = dataSource.getConnection();
			
			stmt = con.prepareStatement(sql);
			stmt.setInt(1, id);
			rs = stmt.executeQuery();
			
			while(rs.next()) {
				e.setEmpId(rs.getInt("EMPID"));
				e.setFirstName(rs.getString("FIRSTNAME"));
				e.setLastName(rs.getString("LASTNAME"));
				e.setEmail(rs.getString("EMAIL"));
				e.setPhone(rs.getString("PHONE"));
				e.setDesignation(rs.getString("DESIGNATION"));
			}
			
		} catch (SQLException ex) {
			System.out.println(ex.getMessage());
		} finally {
			try {
				rs.close();
				stmt.close();
				con.close();
			} catch (SQLException ex) {
				System.out.println(ex.getMessage());
			}
		}
		return e;
	}

	@Override
	public int save(Employee employee) {
		String sql = "INSERT INTO EMPLOYEE (EMPID, FIRSTNAME, LASTNAME, PHONE, EMAIL, DESIGNATION) "
				+ "VALUES (?, ?, ?, ?, ?, ?)";
		int res = 0;
		
		Connection con = null;
		PreparedStatement stmt = null;
		
		int id = getLastId();
		
		if (id == 0) {
			id = 1;
		} else {
			++id;
		}
		
		try {
			con = dataSource.getConnection();	
			stmt = con.prepareStatement(sql);
			stmt.setInt(1, id);
			stmt.setString(2, employee.getFirstName());
			stmt.setString(3, employee.getLastName());
			stmt.setString(4, employee.getPhone());
			stmt.setString(5, employee.getEmail());
			stmt.setString(6, employee.getDesignation());
			
			res = stmt.executeUpdate();
			
		} catch (SQLException ex) {
			System.out.println(ex.getMessage());
		} finally {
			try {
				stmt.close();
				con.close();
			} catch (SQLException ex) {
				System.out.println(ex.getMessage());
			}
		}
		
		return res;
	}

	@Override
	public int update(Employee employee) {
		int res = 0;
		
		String sql = "UPDATE EMPLOYEE SET PHONE = ?, DESIGNATION = ? WHERE EMPID = ?";
		
		Connection con = null;
		PreparedStatement stmt = null;
		
		try {
			con = dataSource.getConnection();	
			stmt = con.prepareStatement(sql);
			stmt.setString(1, employee.getPhone());
			stmt.setString(2, employee.getDesignation());
			stmt.setInt(3, employee.getEmpId());
			
			res = stmt.executeUpdate();
			
		} catch (SQLException ex) {
			System.out.println(ex.getMessage());
		} finally {
			try {
				stmt.close();
				con.close();
			} catch (SQLException ex) {
				System.out.println(ex.getMessage());
			}
		}
		
		return res;
	}

	@Override
	public int deleteById(int id) {
		int res = 0;
		
		String sql = "DELETE FROM EMPLOYEE WHERE EMPID = ?";
		
		Connection con = null;
		PreparedStatement stmt = null;
		
		try {
			con = dataSource.getConnection();	
			stmt = con.prepareStatement(sql);
			stmt.setInt(1, id);
			
			res = stmt.executeUpdate();
			
		} catch (SQLException ex) {
			System.out.println(ex.getMessage());
		} finally {
			try {
				stmt.close();
				con.close();
			} catch (SQLException ex) {
				System.out.println(ex.getMessage());
			}
		}
		
		return res;
	}

}
