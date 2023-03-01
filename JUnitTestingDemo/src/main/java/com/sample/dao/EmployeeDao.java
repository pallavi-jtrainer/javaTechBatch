package com.sample.dao;

import java.util.List;

import com.sample.entity.Employee;

public interface EmployeeDao {
	public int createEmployee(Employee e);
	public List<Employee> retrieveAllEmployees();
	public Employee getEmployeeById(int id);
}
