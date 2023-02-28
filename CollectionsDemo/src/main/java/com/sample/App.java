package com.sample;

import java.time.LocalDate;
import java.util.LinkedList;
import java.util.Scanner;

import com.sample.connectivity.StudentFactory;
import com.sample.model.Address;
import com.sample.model.Courses;

//import java.util.LinkedList;
//import java.util.List;

import com.sample.model.Student;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	
    	
    	Scanner sc = new Scanner(System.in);
    	System.out.print("Student Name: ");
    	String name = sc.next();
    	
    	System.out.print("Age: ");
    	int age = sc.nextInt();
    	
    	System.out.print("Day: ");
    	int dd = sc.nextInt();
    	System.out.print("Month: ");
    	int mm = sc.nextInt();
    	System.out.print("Year: ");
    	int yy = sc.nextInt();
    	
    	LocalDate dob = LocalDate.of(yy, mm, dd); 
    	
    	Student s = new Student(0, name, age, dob);
    	
    	String str = StudentFactory.insertIntoDb(s);
    	
    	System.out.println(str);
    	
    	Student[] students = StudentFactory.retrieveAllStudents();
    	for(Student s1: students) {
    		System.out.println(s1.toString());
    	}
    	
    	
//        List<String> names = new LinkedList<String>();
//        
//        names.add("Prithvi");
//        names.add("Prakruthi");
//        names.add("Pranav");
//        
//        System.out.println(names);
//        names.add(0, "Poornima");
//        System.out.println(names);
//        
//    	Address address = new Address(12, "12th cross", "Bangalore");
//    	
//        LinkedList<Student> students = new LinkedList<Student>();
//        students.add(new Student(100, "Prithvi", 12, address));
//        students.add(new Student(102, "Pranav",12));
//        
//        Courses course = new Courses(101, "Java", students);
//        System.out.println("ID: " + course.getCourseId());
//        System.out.println("Name: " + course.getCourseName());
//        System.out.println("Students: " );
//        for(Student s: course.getStudents()) {
//        	System.out.println(s.toString());
//        	System.out.println("Address: " + s.getAddress());
//        }
//        
//        System.out.println(students);
//        students.addFirst(new Student(105, "Nayan", 13));
//        
//        System.out.println(students);
//        //Student s = students.remove(6);
//        Student s = students.poll();
//        System.out.println(s.toString());
        
    }
}
