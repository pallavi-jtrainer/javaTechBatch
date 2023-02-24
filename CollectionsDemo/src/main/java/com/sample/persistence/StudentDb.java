package com.sample.persistence;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.sample.model.Student;

public class StudentDb {

	final static String url = "jdbc:mysql://localhost:3306/sampledb?useSSL=false";
	final static String user = "root";
	final static String pass = "Pass1234";
	
//	public StudentDb() {
//		url = "";
//	}
	
//	{
//		url = "";
//	}
	
	public static String insertStudentDetails(Student s) {
		String sql = "INSERT INTO STUDENT (STUDENTNAME, AGE) VALUES (?, ?)";
		String ans = "Not able to insert student details";
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			Connection con = DriverManager.getConnection(url, user, pass);
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, s.getName());
			ps.setInt(2, s.getAge());
			
			int res = ps.executeUpdate();
			if(res > 0) {
				ans = "Student details inserted successfully";
			}
			con.close();
		} catch (ClassNotFoundException ex) {
				System.out.println(ex.getMessage());
		} catch(SQLException ex) {
			System.out.println(ex.getMessage());
		}
		
		return ans;
	}
	
	public static List<Student> retrieveAllStudents() {
		List<Student> students = new ArrayList<Student>();
		
		String sql = "SELECT * FROM STUDENT";
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			Connection con = DriverManager.getConnection(url, user, pass);
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery(sql);
			
			while(rs.next()) {
				Student s = new Student();
				s.setStudentId(rs.getInt("STUDENTID"));
				s.setName(rs.getString("STUDENTNAME"));
				s.setAge(rs.getInt("AGE"));
				
				students.add(s);
			}
			
			con.close();
		} catch (ClassNotFoundException ex) {
				System.out.println(ex.getMessage());
		} catch(SQLException ex) {
			System.out.println(ex.getMessage());
		}
		
		return students;
	}
	
	public static Student retrieveStudentData(int id) {
		String sql = "SELECT * FROM STUDENT WHERE STUDENTID = ?";
		
		Student s = null;
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			Connection con = DriverManager.getConnection(url, user, pass);
			
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setInt(1, id);
			
			ResultSet rs = ps.executeQuery();
			
			while(rs.next()) {
				s = new Student();
				s.setStudentId(rs.getInt("STUDENTID"));
				s.setName(rs.getString("STUDENTNAME"));
				s.setAge(rs.getInt("AGE"));
			}
			con.close();
		} catch (ClassNotFoundException ex) {
			System.out.println(ex.getMessage());
		} catch(SQLException ex) {
			System.out.println(ex.getMessage());
		}
		return s;
	}
}
