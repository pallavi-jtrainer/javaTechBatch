package com.sample.demo.model;

import org.springframework.stereotype.Component;

@Component
public class Developer implements Employee{
	@Override
	public void workInfo() {
	System.out.println("Develops Code");
		
	}
}
