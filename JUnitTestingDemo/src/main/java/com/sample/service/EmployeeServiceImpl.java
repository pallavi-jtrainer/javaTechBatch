package com.sample.service;

import java.util.List;

import com.sample.dao.EmployeeDao;
import com.sample.dao.EmployeeDaoImpl;
import com.sample.entity.Employee;

public class EmployeeServiceImpl implements EmployeeService{

	EmployeeDao dao;
	
//	public EmployeeServiceImpl() {
//		dao = new EmployeeDaoImpl();
//	}
	
	public EmployeeServiceImpl(EmployeeDaoImpl dao) {
		this.dao = dao;
	}
	
	@Override
	public int createEmployee(Employee e) {
		int res = dao.createEmployee(e);
//		String str = "Unable to add new employee";
//		
//		if(res > 0) {
//			str = "Employee added successfully";
//		}
		return res;
	}

	@Override
	public Employee[] retrieveAllEmployees() {
		List<Employee> eList = dao.retrieveAllEmployees();
		return eList.toArray(new Employee[eList.size()]);
	}

	@Override
	public Employee getEmployeeById(int id) {
		Employee e = dao.getEmployeeById(id);
		return e;
	}

}
