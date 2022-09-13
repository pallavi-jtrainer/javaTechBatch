package com.sample.JDBCProjectDemo;

import java.util.Scanner;

import com.sample.JDBCProjectDemo.factory.EmployeeFactory;
import com.sample.JDBCProjectDemo.model.Employee;

/**
 * Hello world!
 *
 */
public class App 
{
	Scanner sc = new Scanner(System.in);
	
	private void mainMenu() {
		System.out.println("-----------------Menu-----------------");
		System.out.println("1. View All Employees");
		System.out.println("2. View Employee Details");
		System.out.println("3. Add a New Employee");
		System.out.println("4. Update Employee Details");
		System.out.println("5. Remove Employee");
		System.out.println("6. Exit");
		System.out.print("Enter your option: ");
		int ch = sc.nextInt();
		
		subMenu(ch);
	}
	
	private void subMenu(int ch) {
		Employee e = new Employee();
		switch(ch) {
		case 1:
			Employee[] eList = EmployeeFactory.retrieveAllEmployees();
			if(eList.length > 0) {
				for(Employee e1: eList) {
					System.out.println(e1.toString());
				}
			} else {
				System.out.println("Unable to list employees");
			}
			break;
		case 2:
			System.out.println("enter Employee id: ");
			int id = sc.nextInt();
			
			e = EmployeeFactory.findById(id);
			
			if (e != null) {
				System.out.println(e.toString());
			} else {
				System.out.println("Employee Not found!!");
			}
			break;
		case 3:
			String msg = getEmployeeDetails();
			System.out.println(msg);
			break;
		case 4:
			System.out.println("enter Employee id: ");
			int i = sc.nextInt();
			String s = updateEmployee(i);
			System.out.println(s);
			break;
		case 5:
			System.out.println("enter Employee id: ");
			int x = sc.nextInt();
			String str = e.deleteEmployee(x);
			System.out.println(str);
			break;
		case 6:
			sc.close();
			Runtime.getRuntime().exit(0);
		default:
			break;
		}
		
		mainMenu();
	}
	
	private String getEmployeeDetails() {
		Employee e = new Employee();
		
		System.out.print("Enter First Name: ");
		String fName = sc.next();
		System.out.print("Enter Last Name: ");
		String lName = sc.next();
		System.out.print("Enter Email: ");
		String em = sc.next();
		System.out.print("Enter Phone no: ");
		String ph = sc.next();
		System.out.print("Enter Designation: ");
		String desig = sc.next();
		String str = e.addNewEmployee(fName, lName, em, ph, desig);
		return str;
	}
	
	private String updateEmployee(int id) {
		Employee e = EmployeeFactory.findById(id);
		String s = "Unable to find employee";
		
		if (e != null) {
			System.out.println("1. Update Phone\n2. Update Designation\n3. Back to main");
			int op = sc.nextInt();
			switch(op) {
			case 1:
				System.out.print("Enter phone: ");
				String ph = sc.next();
				s = e.updateEmployee(id, ph, e.getDesignation());
				break;
			case 2:
				System.out.print("Enter designation: ");
				String desg = sc.next();
				s = e.updateEmployee(id, e.getPhone(), desg);
				break;
			default:
				break;
			}
		}
		return s;
	}
	
    public static void main( String[] args )
    {
       App obj = new App();
       obj.mainMenu();
    }
}
