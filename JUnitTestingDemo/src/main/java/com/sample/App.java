package com.sample;

import java.util.Scanner;

import com.sample.dao.EmployeeDaoImpl;
import com.sample.entity.Employee;
import com.sample.service.EmployeeService;
import com.sample.service.EmployeeServiceImpl;

/**
 * Hello world!
 *
 */
public class App 
{
	static Scanner sc = new Scanner(System.in);
	private static void mainMenu() {
		EmployeeService es = new EmployeeServiceImpl(new EmployeeDaoImpl());
		
		while(true) {
			System.out.println("1. View All Employees");
			System.out.println("2. View Employee Details");
			System.out.println("3. Add New Employee");
			System.out.println("4. Exit");
			int ch = sc.nextInt();
			
			switch(ch) {
				case 1: Employee[] eList = es.retrieveAllEmployees();
					for(Employee e: eList) {
						System.out.println(e.toString());
					}
					break;
				case 2:
					System.out.print("ID please: ");
					int id = sc.nextInt();
					
					Employee e = es.getEmployeeById(id);
					System.out.println(e.toString());
					break;
				case 3:
					System.out.print("Name: ");
					String name = sc.next();
					System.out.print("Salary: ");
					double salary = sc.nextDouble();
					
					Employee emp = new Employee(0, name, salary);
					int res = es.createEmployee(emp);
					String s = "Unable to add employee";
					if(res > 0) {
						s = "Employee inserted successfully";
					}
					System.out.println(s);
					break;
				default:
					Runtime.getRuntime().exit(0);
			}
		}
		
	}
    public static void main( String[] args )
    {
        mainMenu();
    }
}
