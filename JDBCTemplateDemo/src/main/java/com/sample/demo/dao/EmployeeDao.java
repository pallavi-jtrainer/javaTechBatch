package com.sample.demo.dao;

import java.util.List;

import com.sample.demo.model.Employee;

public interface EmployeeDao {
	public List<Employee> getAllEmployees();
	public Employee findEmployeeById(int id);
	
	public int save(Employee e);
	public int update(Employee e);
	public int deleteEmployeeById(int id);
}
