package com.sample.demo.dao;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;

import com.sample.demo.model.Employee;

public class EmployeeDaoImpl implements EmployeeDao{
	private DataSource dataSource;
	
	public void setDataSource(DataSource dataSource) {
		this.dataSource = dataSource;
	}
	
	private Employee getLastRec() {
		String sql = "SELECT * FROM EMPLOYEE ORDER BY DESC LIMIT 1";
		JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);
		
		Employee e = jdbcTemplate.queryForObject(sql, new EmployeeRowMapper());
		
		return e;
		
	}

	@Override
	public List<Employee> getAllEmployees() {
		String sql = "SELECT * FROM EMPLOYEE";
		
		JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);
		List<Employee> list = jdbcTemplate.query(sql, new EmployeeRowMapper());
		
		return list;
	}

	@Override
	public Employee findEmployeeById(int id) {
		String sql = "SELECT * FROM EMPLOYEE WHERE EMPID = ?";
		
		JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);
		
		Employee e = jdbcTemplate.queryForObject(sql, new EmployeeRowMapper(), new Object[] {id});
		
		return e;
	}

	@Override
	public int save(Employee e) {
		String sql = "INSERT INTO EMPLOYEE (EMPID, FIRSTNAME, LASTNAME, PHONE, EMAIL, DESIGNATION) "
				+ "VALUES (?, ?, ?, ?, ?, ?)";
		int res = 0;
		
		Employee emp = getLastRec();
		int id = emp.getEmpId() + 1;
		
		JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);
		
		Object[] args = new Object[] {id, e.getFirstName(), e.getLastName(), e.getPhone(),
				e.getEmail(), e.getDesignation()};
		
		res = jdbcTemplate.update(sql, args);
		return res;
	}

	@Override
	public int update(Employee e) {
		String sql ="UPDATE EMPLOYEE SET PHONE = ?, DESIGNATION = ? WHERE EMPID = ?";
		JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);
		
		Object[] args = new Object[] {e.getPhone(), e.getDesignation(), e.getEmpId()};
		
		int res = jdbcTemplate.update(sql, args);
		
		return res;
	}

	@Override
	public int deleteEmployeeById(int id) {
		String sql = "DELETE FROM EMPLOYEE WHERE EMPID = ?";
		JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);
		
		int res = jdbcTemplate.update(sql, id);
		
		return res;
	}
}
