package com.sample.demo;

import java.util.List;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.sample.demo.dao.EmployeeDao;
import com.sample.demo.model.Employee;

//import org.springframework.boot.SpringApplication;
//import org.springframework.boot.autoconfigure.SpringBootApplication;

//@SpringBootApplication
public class JdbcTemplateDemoApplication {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("appConfig.xml");
		EmployeeDao empDao = context.getBean("employeeDao", EmployeeDao.class);
		
//		List<Employee> eList = empDao.getAllEmployees();
//		for(Employee e: eList) {
//			System.out.println(e.toString());
//		}
		
//		Employee e = empDao.findEmployeeById(5);
//		System.out.println(e.toString());
		
//		Employee e = new Employee(6, "Lavanya", "Krishnan", "lavanya@jshds.c", "7388822", "Accountant");
//		int x = empDao.save(e);
//		
//		if (x > 0) {
//			System.out.println("Employee Added Successfully");
//		} else {
//			System.out.println("Unable to add employee");
//		}
		
//		Employee e = new Employee();
//		e.setEmpId(4);
//		e.setPhone("627718");
//		e.setDesignation("Lead Tester");
//		
//		int x = empDao.update(e);
//		
//		if (x > 0 ) {
//			System.out.println("Employee Data Updated");
//		} else {
//			System.out.println("Employee Not Found");
//		}
		
		int x = empDao.deleteEmployeeById(4);
		
		if (x > 0) {
			System.out.println("Employee Data Removed");
		} else {
			System.out.println("Employee Not Found");
		}
	}

}
