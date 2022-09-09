package com.sample.demo;
import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name");
        String name = sc.next();
        System.out.println("Enter the age");
        int age = sc.nextInt();
        System.out.println("Enter location");
        String loc = sc.next();

        if (age < 18 || age > 60) {
            System.out.println("No Eligible for Insurance");
        } else {
            if (loc.equals("city") || loc.equals("CITY") || loc.equals("City")) {
                if(age >= 18 && age <=25) {
                    System.out.println(name + ", Preminum is Rs.12000");
                }

                if (age > 25 && age <= 40) {
                    System.out.println(name + ", Preminum is Rs.25000");
                }

                if (age > 40 && age < 60) {
                    System.out.println(name + ", Preminum is Rs.30000");
                }
            } 

            if (loc.equals("village") || loc.equals("VILLAGE") || loc.equals("Village")) {
                if(age >= 18 && age <=25) {
                    System.out.println(name + ", Preminum is Rs.8000");
                }

                if (age > 25 && age <= 40) {
                    System.out.println(name + ", Preminum is Rs.18000");
                }

                if (age > 40 && age < 60) {
                    System.out.println(name + ", Preminum is Rs.25000");
                }
            } 
            
        }
        sc.close();
    }
}
