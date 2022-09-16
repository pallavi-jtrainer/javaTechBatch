package com.sample.demo.repository;

import java.util.List;

import com.sample.demo.model.Courses;

public interface CourseRepository {
	public List<Courses> retrieveAll();
	public Courses findById(int id);
	public List<Courses> findByTitleContains(String title);
	
	public int save(Courses c);
	public int update(Courses c);
	public int deleteById(int id);
	
}
