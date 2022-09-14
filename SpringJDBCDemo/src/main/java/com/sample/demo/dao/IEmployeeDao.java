package com.sample.demo.dao;

import java.util.List;

import com.sample.demo.model.Employee;

public interface IEmployeeDao {
	
	//define CRUD operations
	//read
	public List<Employee> getAll();
	public Employee getById(int id);
	
	//create
	public int save(Employee employee);
	
	//update
	public int update(Employee employee);
	
	//delete
	public int deleteById(int id);
	
}
