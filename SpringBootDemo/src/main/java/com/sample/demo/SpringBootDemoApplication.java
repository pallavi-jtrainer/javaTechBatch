package com.sample.demo;

import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.sample.demo.model.Courses;
import com.sample.demo.repository.CourseRepository;

@SpringBootApplication
public class SpringBootDemoApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(SpringBootDemoApplication.class, args);
		CourseRepository repo = ctx.getBean(CourseRepository.class);
//		
//		List<Courses> courses = repo.retrieveAll();
//		
//		for(Courses c: courses) {
//			System.out.println(c.toString());
//		}
		
		Courses c = new Courses(0, "MySQL Intense", "Learn MySQL Basics easily");
		
		int x = repo.save(c);
		
		if (x > 0) {
			System.out.println("New Course added");
		} else {
			System.out.println("Unsuccessful");
		}
	}

}
