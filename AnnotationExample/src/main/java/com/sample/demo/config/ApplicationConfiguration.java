package com.sample.demo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.sample.demo.model.Developer;
import com.sample.demo.model.Manager;

@Configuration
public class ApplicationConfiguration {

	@Bean(name="manager")
	public Manager getManager() {
		return new Manager();
	}
	
	@Bean(name="dev")
	public Developer getDeveloper() {
		return new Developer();
	}
}
