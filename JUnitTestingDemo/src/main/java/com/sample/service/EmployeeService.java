package com.sample.service;

//import java.util.List;

import com.sample.entity.Employee;

public interface EmployeeService {
	public int createEmployee(Employee e);
	public Employee[] retrieveAllEmployees();
	public Employee getEmployeeById(int id);
}
