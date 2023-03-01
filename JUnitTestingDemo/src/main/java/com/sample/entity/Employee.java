package com.sample.entity;

import java.util.Objects;

import com.sample.service.EmployeeService;
import com.sample.service.EmployeeServiceImpl;

/**
 * Employee Class - entity
 * @author Pallavi Prasad
 *
 */
public class Employee {
	private int employeeId;
	private String employeeName;
	private double salary;
	
	/**
	 * default constructor
	 */
	public Employee() {
		
	}
	
	/**
	 * parameterized constructor
	 * @param employeeId for employee id - int
	 * @param employeeName for employeeName - String
	 * @param salary - for salary - double
	 */
	public Employee(int employeeId, String employeeName, double salary) {
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.salary = salary;
	}
	
	public int getEmployeeId() {
		return employeeId;
	}
	
	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}
	
	public String getEmployeeName() {
		return employeeName;
	}
	
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	
	public double getSalary() {
		return salary;
	}
	
	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	@Override
	public String toString() {
		return "Employee Info: [Id: "+ employeeId + ", Name: " 
				+ employeeName + ", Salary: " + salary + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(employeeId, employeeName, salary);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		return employeeId == other.employeeId && Objects.equals(employeeName, other.employeeName)
				&& Double.doubleToLongBits(salary) == Double.doubleToLongBits(other.salary);
	}
	
//	public String addNewEmployee(Employee e) {
//		EmployeeService es = new EmployeeServiceImpl();
//		
//		String str = es.createEmployee(e);
//		return str;
//	}
	
}
