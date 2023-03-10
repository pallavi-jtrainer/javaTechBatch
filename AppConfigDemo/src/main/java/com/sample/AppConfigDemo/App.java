package com.sample.AppConfigDemo;

//import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
       AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
       HelloWorld obj = (HelloWorld) context.getBean("helloWorld");
       System.out.println(obj.getMessage());
       context.close();
    }
}
