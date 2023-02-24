package com.sample.model;

import java.util.List;

public class Courses {
	private int courseId;
	private String courseName;
	
	private List<Student> students;

	public int getCourseId() {
		return courseId;
	}

	public void setCourseId(int courseId) {
		this.courseId = courseId;
	}

	public String getCourseName() {
		return courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

	public List<Student> getStudents() {
		return students;
	}

	public void setStudents(List<Student> students) {
		this.students = students;
	}
	
	public Courses() {
		
	}

	public Courses(int courseId, String courseName, List<Student> students) {
		this.courseId = courseId;
		this.courseName = courseName;
		this.students = students;
	}
}
