package com.sample.demo.model;

import org.springframework.stereotype.Component;

@Component
public class Manager implements Employee{

	@Override
	public void workInfo() {
		System.out.println("Manages the Office and employees");		
	}
	
	public void info() {
		System.out.println("I am the manager");
	}
}
