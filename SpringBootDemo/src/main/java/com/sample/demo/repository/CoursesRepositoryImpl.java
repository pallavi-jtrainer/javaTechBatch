package com.sample.demo.repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.sample.demo.model.Courses;

@Repository
public class CoursesRepositoryImpl implements CourseRepository {
	
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	@Override
	public List<Courses> retrieveAll() {
		String sql = "SELECT * FROM COURSES";
		
		List<Courses> courses =  jdbcTemplate.query(sql, BeanPropertyRowMapper.newInstance(Courses.class));
		return courses;
	}

	@Override
	public Courses findById(int id) {
		String sql = "SELECT * FROM COURSES WHERE COURSEID = ?";
		
		Courses course = jdbcTemplate.queryForObject(sql, BeanPropertyRowMapper.newInstance(Courses.class), id);
		
		return course;
	}

	@Override
	public List<Courses> findByTitleContains(String title) {
		String sql = "SELECT * FROM COURSES WHERE TITLE LIKE '%" + title + "%'";
		
		List<Courses> courses = jdbcTemplate.query(sql, BeanPropertyRowMapper.newInstance(Courses.class));
		return courses;
	}

	private Courses getLastRec() {
		String sql = "SELECT * FROM COURSES ORDER BY COURSEID DESC LIMIT 1";
		Courses c = jdbcTemplate.queryForObject(sql, BeanPropertyRowMapper.newInstance(Courses.class));
		return c;
	}
	
	@Override
	public int save(Courses c) {
		Courses course = getLastRec();
		int id = course.getCourseId()  + 1; 
		String sql = "INSERT INTO COURSES (COURSEID, TITLE, DESCRIPTION) VALUES " +
				"(?, ?, ?)";
		
		Object[] args = new Object[] {id, c.getTitle(), c.getDescription()};
		
		id = jdbcTemplate.update(sql, args);
		return id;
	}

	@Override
	public int update(Courses c) {
		String sql = "UPDATE COURSES SET TITLE = ?, DESCRIPTION = ? WHERE COURSEID = ?";
		
		Object[] args = new Object[] {c.getTitle(), c.getDescription(), c.getCourseId()};
		int res = jdbcTemplate.update(sql, args);
		
		return res;
	}

	@Override
	public int deleteById(int id) {
		String sql = "DELETE FROM COURSES WHERE COURSEID = ?";
		
		int res = jdbcTemplate.update(sql, id);
		
		return res;
	}

}
