package com.sample.demo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.sample.demo.dao.IEmployeeDao;
import com.sample.demo.model.Employee;

import java.util.List;
import java.util.Scanner;

//import org.springframework.boot.SpringApplication;
//import org.springframework.boot.autoconfigure.SpringBootApplication;

//@SpringBootApplication
public class SpringJdbcDemoApplication {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("appConfiguration.xml");
		IEmployeeDao employeeDao = context.getBean("employeeDao", IEmployeeDao.class);
				
		while(true) {
			System.out.println();
			System.out.println("1. View All Employees");
			System.out.println("2. View Employee Details");
			System.out.println("3. Add new employee");
			System.out.println("4. Update Employee Details");
			System.out.println("5. Delete Employee");
			System.out.println("6. Exit");
			System.out.println("Your choice? ");
			
			int ch = sc.nextInt();
			
			switch(ch) {
			case 1:
				List<Employee> list = employeeDao.getAll();
				for(Employee emp: list) {
					System.out.println(emp.toString());
				}
				break;
			case 2:
				System.out.println("Enter id: ");
				int id = sc.nextInt();
				Employee e = employeeDao.getById(id);
				if(e.getEmpId() > 0) {
					System.out.println(e.toString());
				} else {
					System.out.println("Employee not found");
				}
				break;
			case 3:
				System.out.println("Enter first name:");
				String fName = sc.next();
				System.out.println("Enter last name:");
				String lName = sc.next();
				System.out.println("Enter Phone:");
				String ph = sc.next();
				System.out.println("Enter Email:");
				String em = sc.next();
				System.out.println("Enter Designation:");
				String desg = sc.next();
				
				Employee emp = new Employee();
				emp.setEmpId(0);
				emp.setFirstName(fName);
				emp.setLastName(lName);
				emp.setEmail(em);
				emp.setPhone(ph);
				emp.setDesignation(desg);
				
				int res = employeeDao.save(emp);
				
				if (res > 0) {
					System.out.println("Employee Added successfully");
				} else {
					System.out.println("Unable to add employee details");
				}
				
				break;
			case 6:
				sc.close();
				context.close();
				Runtime.getRuntime().exit(0);
			default:
				break;
			}
		}
		
//		SpringApplication.run(SpringJdbcDemoApplication.class, args);
	}

}
