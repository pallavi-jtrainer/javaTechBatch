package com.sample.aopdemo.Spring_Aop_Demo.service;

import com.sample.aopdemo.Spring_Aop_Demo.model.Employee;

public class EmployeeService {
	private Employee employee;
	
	public Employee getEmployee() {
		return employee;
	}
	
	public void setEmployee(Employee employee) {
		this.employee = employee;
	}
}
