package com.sample.JdcDemoProject.persistence;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import com.sample.JdcDemoProject.model.Actor;
import com.sample.JdcDemoProject.model.Gender;

public class ActorDb {

	private static final String DB_URL = "jdbc:mysql://localhost:3306/actordb?allowPublicKeyRetrieval=true&serverTimezone=UTC";
	private static final String USER = "root";
	private static final String PASS = "Pass1234";
	
	public static List<Actor> retrieveAll() {
		String sql = "SELECT * FROM ACTOR";
		
		List<Actor> list = new ArrayList<Actor>();
		
		try {
			//1. register the driver
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			//2. create the connection
			Connection con = DriverManager.getConnection(DB_URL, USER, PASS);
			
			//3. create the sql statement
			Statement stmt = con.createStatement();
			
			//4. execute query
			ResultSet rs = stmt.executeQuery(sql);
			
			//process the resultset
			while(rs.next()) {
				Actor a = new Actor();
				int id = rs.getInt("ACTORID");
				a.setActorId(id);
				
				a.setFirstName(rs.getString("FIRSTNAME"));
				a.setLastName(rs.getString("LASTNAME"));
				
				//converting string to enum
				String g = rs.getString("GENDER");
				Gender gen = Gender.valueOf(g);
				
				a.setGender(gen);
				
				//converting java.sql.Date to java.time.LocalDate
				Date dob = rs.getDate("DOB");
				LocalDate ld = dob.toLocalDate();
				a.setDob(ld);
				
				a.setPhone(rs.getString("PHONE"));
				a.setFees(rs.getDouble("FEES"));
				
				list.add(a);
			}
			//5. close the connection
			con.close();
		} catch (ClassNotFoundException ex) {
			System.out.println(ex.getMessage());
		} catch (SQLException ex) {
			System.out.println(ex.getMessage());
		}
		
		return list;
	}
	
	public static Actor findById(int id) {
		Actor actor = new Actor();
		
		
		String sql = "SELECT * FROM ACTOR WHERE ACTORID = ?";
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection(DB_URL, USER, PASS);
			
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setInt(1, id);
			
			ResultSet rs = ps.executeQuery();
			while(rs.next()) {
				actor.setActorId(rs.getInt("ACTORID"));
				actor.setFirstName(rs.getString("FIRSTNAME"));
				actor.setLastName(rs.getString("LASTNAME"));
				
				//converting string to enum
				String g = rs.getString("GENDER");
				Gender gen = Gender.valueOf(g);
				
				actor.setGender(gen);
				
				//converting java.sql.Date to java.time.LocalDate
				Date dob = rs.getDate("DOB");
				LocalDate ld = dob.toLocalDate();
				actor.setDob(ld);
				
				actor.setPhone(rs.getString("PHONE"));
				actor.setFees(rs.getDouble("FEES"));
			}
			con.close();
		} catch (ClassNotFoundException ex) {
			System.out.println(ex.getMessage());
		} catch (SQLException ex) {
			System.out.println(ex.getMessage());
		}
		
		return actor;
	}
	
	private static int getLastId() {
		int id = 0;
		
		String sql = "SELECT ACTORID FROM ACTOR ORDER BY ACTORID DESC LIMIT 1";
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			Connection con = DriverManager.getConnection(DB_URL, USER, PASS);
			
			Statement stmt = con.createStatement();
			
			ResultSet rs = stmt.executeQuery(sql);
			
			while(rs.next()) {
				id = rs.getInt("ACTORID");
			}
			con.close();
		} catch(ClassNotFoundException ex) {
			System.out.println(ex.getMessage());
		} catch (SQLException ex) {
			System.out.println(ex.getMessage());
		}
		
		return id;
	}
	
	public static int insertIntoDb(String fName, String lName, String ph, double fees, Date dob, String gender) {
		String sql = "INSERT INTO ACTOR (ACTORID, FIRSTNAME, LASTNAME, PHONE, DOB, GENDER, FEES) " +
				"VALUES (?, ?, ?, ?, ?, ?, ?)";
		
		
		int res = 0;
		int id = getLastId();
		
		if (id == 0) {
			id = 1;
		} else {
			++id;
		}
		
//		String sql = "INSERT INTO ACTOR (ACTORID, FIRSTNAME, LASTNAME, PHONE, DOB, GENDER, FEES) " +
//				"VALUES (" + id + ", " + fName + "," + lName + "," + ph + " ";
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection(DB_URL, USER, PASS);
			
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setInt(1, id);
			ps.setString(2, fName);
			ps.setString(3, lName);
			ps.setString(4, ph);
			ps.setDate(5, dob);
			ps.setString(6, gender);
			ps.setDouble(7, fees);
			
			res = ps.executeUpdate();
			
			con.close();
		} catch(ClassNotFoundException ex) {
			System.out.println(ex.getMessage());
		} catch (SQLException ex) {
			System.out.println(ex.getMessage());
		}
		
		return res;
	}
}
