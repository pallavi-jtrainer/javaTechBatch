package com.sample.aopdemo.Spring_Aop_Demo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.sample.aopdemo.Spring_Aop_Demo.service.EmployeeService;

//import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
        EmployeeService obj = (EmployeeService) ctx.getBean("employeeService", EmployeeService.class);
        System.out.println(obj.getEmployee().getEmpName());
        ctx.close();
    }
}
