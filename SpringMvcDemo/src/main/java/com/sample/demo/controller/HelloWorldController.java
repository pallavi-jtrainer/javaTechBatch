package com.sample.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloWorldController {
	@RequestMapping("/welcome")
	public ModelAndView sayHello() {
		String message = "Welcome to MVC";
		
		return new ModelAndView("welcome", "message", message);
	}
}
