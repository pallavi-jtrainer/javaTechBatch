package com.sample.demo.model;

public class Courses {
	private int courseId;
	private String title;
	private String description;
	
	public Courses() {
		
	}
	
	public Courses(int id, String name, String desc) {
		this.courseId = id;
		this.title = name;
		this.description = desc;
	}
	
	public int getCourseId() {
		return courseId;
	}
	
	public void setCourseId(int courseId) {
		this.courseId = courseId;
	}
	
	public String getDescription() {
		return description;
	}
	
	public void setDescription(String description) {
		this.description = description;
	}
	
	public String getTitle() {
		return title;
	}
	
	public void setTitle(String title) {
		this.title = title;
	}
	
	@Override
	public String toString() {
		return "Course Details: [Id: " + courseId + ", Title: " + title + ", Description: " + description
				+ "]";
	}
}
