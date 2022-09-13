package com.sample.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.sample.demo.config.ApplicationConfiguration;
import com.sample.demo.model.Employee;
//import com.sample.demo.model.Manager;

//import org.springframework.boot.SpringApplication;
//import org.springframework.boot.autoconfigure.SpringBootApplication;

//@SpringBootApplication
public class AnnotationExampleApplication {

	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		ApplicationContext context = new AnnotationConfigApplicationContext(ApplicationConfiguration.class);
		Employee e = (Employee) context.getBean("manager");
		e.workInfo();
		
//		Manager m = (Manager) context.getBean("manager");
//		m.info();
		
		Employee e2 = (Employee) context.getBean("dev");
		e2.workInfo();
//		SpringApplication.run(AnnotationExampleApplication.class, args);
	}

}
