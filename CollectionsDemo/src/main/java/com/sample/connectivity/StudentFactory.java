package com.sample.connectivity;

import java.util.List;

import com.sample.model.Student;
import com.sample.persistence.StudentDb;

public class StudentFactory {
	
	public static String insertIntoDb(Student s) {
		String str = StudentDb.insertStudentDetails(s);
		return str;
	}
	
	public static Student[] retrieveAllStudents() {
		List<Student> list = StudentDb.retrieveAllStudents();
		
		return list.toArray(new Student[list.size()]);
	}
}
