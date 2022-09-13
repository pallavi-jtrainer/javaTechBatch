package com.sample.JDBCProjectDemo.factory;

import java.util.List;

import com.sample.JDBCProjectDemo.model.Employee;
import com.sample.JDBCProjectDemo.persistence.EmployeeDB;

public class EmployeeFactory {
	public static Employee[] retrieveAllEmployees() {
		List<Employee> eList = EmployeeDB.retrieveAllEmployees();
		Employee[] emps = eList.toArray(new Employee[eList.size()]);
		return emps;
	}
	
	public static Employee findById(int id) {
		Employee e = EmployeeDB.findbyId(id);
		return e;
	}
	
	public static int addNewEmployee(String fName, String lName, String em, String ph, String desig) {
		int res = EmployeeDB.insertNewEmployeeDetails(fName, lName, em, ph, desig);
		return res;
	}
	
	public static int deleteEmployee(int id) {
		int res = EmployeeDB.deleteEmployee(id);
		return res;
	}
	
	public static int updateEmployee(int id, String ph, String desg) {
		int res = EmployeeDB.updateEmployee(id, ph, desg);
		return res;
	}
}
