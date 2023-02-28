package com.sample;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;

import com.sample.model.Student;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
//       Date date = new Date();
//       
//       System.out.println(date);
       
//       SimpleDateFormat sdf = new SimpleDateFormat("mm-dd-yyyy");
//       String str = sdf.format(date);
//       System.out.println("Date String: " + str);
//       
//       try {
//    	   date = sdf.parse(str);
//       } catch (ParseException ex) {
//    	   System.out.println(ex.getMessage());
//       }
//       
//       System.out.println("After conversion: "  +date);
       
//       LocalDate ld = LocalDate.now();
//       System.out.println("LocalDate: " + ld);
//       
//       ld = ld.plusDays(4);
//       
//       System.out.println("Plus 4 days: " + ld);
       
    	//non static or local inner class
//       Student student = new Student();
//       student.setStudentId(1);
//       student.setName("ABC");
//       
//       Student.Address address = student.new Address();
//       System.out.println(address.toString());
       
       //static inner class
//    	Student student = new Student();
//    	Student.Address address = new Student.Address();
//    	System.out.println(address.toString());
       
//       String s = "hello";
//       s = "world";
    	
    	String s = new String("hello");
  //  	s = new String("world");
    	
    	StringBuffer sb = new StringBuffer(s);
    	sb.append(" world");
    	
    	System.out.println(sb);
    	
    	sb.deleteCharAt(4);
    	System.out.println(sb);
    	
    	sb.insert(3, "test");
    	System.out.println(sb);
       
       
       
       
       
       
       
       
       
    }
}
