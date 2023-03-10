package com.sample.aopdemo.Spring_Aop_Demo.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class EmployeeBeforeAspect {

	@Before("execution(public String getEmpName())")
	public void getEmpNameAdvice() {
		System.out.println("Executed before getEmpName()");
	}
	
	@Before("execution(* com.sample.aopdemo.Spring_Aop_Demo.service.*.get*())")
	public void getAllAdvice() {
		System.out.println("Service class getter called");
	}
}
