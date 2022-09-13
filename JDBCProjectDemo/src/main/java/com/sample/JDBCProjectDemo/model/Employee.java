package com.sample.JDBCProjectDemo.model;

import com.sample.JDBCProjectDemo.factory.EmployeeFactory;

public class Employee {
	private int empId;
	private String firstName;
	private String lastName;
	private String email;
	private String phone;
	private String designation;
	
	public int getEmpId() {
		return empId;
	}
	
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	
	public String getFirstName() {
		return firstName;
	}
	
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	public String getLastName() {
		return lastName;
	}
	
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	public String getEmail() {
		return email;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	public String getPhone() {
		return phone;
	}
	
	public void setPhone(String phone) {
		this.phone = phone;
	}
	
	public String getDesignation() {
		return designation;
	}
	
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	
	public Employee() {
		
	}

	public Employee(int empId, String firstName, String lastName, String email, String phone, String designation) {
		this.empId = empId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.phone = phone;
		this.designation = designation;
	}

	@Override
	public String toString() {
		return "Employee [Id=" + empId + ", First Name=" + firstName + ", Last Name=" + lastName + ", Email=" + email
				+ ", Phone=" + phone + ", Designation=" + designation + "]";
	}
	
	public String addNewEmployee(String fName, String lName, String em, String ph, String desig) {
		String str = "Unable to add new employee data";
		
		int res = EmployeeFactory.addNewEmployee(fName, lName, em, ph, desig);
		
		if (res > 0) {
			str = "New Employee Data uploaded";
		}
		
		return str;
	}
	
	public String deleteEmployee(int id) {
		String str = "Unable to delete employee.";
		
		int res = EmployeeFactory.deleteEmployee(id);
		
		if(res > 0) {
			str = "Employee with id: " + id + " deleted from database";
		}
		
		return str;
	}
	
	public String updateEmployee(int id, String ph, String desg) {
		String str = "Unable to update employee";
		
		int res = EmployeeFactory.updateEmployee(id, ph, desg);
		
		if (res > 0) {
			str = "Employee Details Updated";
		}
		
		return str;
	}
	
}
