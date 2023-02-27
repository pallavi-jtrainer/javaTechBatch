package com.sample;

import com.sample.demo.Demo1;
import com.sample.demo.Interface2;
import com.sample.demo.InterfaceImpl;
import com.sample.demo.MyInterface;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
//        System.out.println( "Hello World!" );
    	Demo1 obj = new Demo1();
    	obj.m1();
    	Demo1.staticMethod();
    	
//    	InterfaceImpl i1 = new InterfaceImpl();
//    	i1.n1();
    	
    	Interface2 i1 = new Interface2() {
			
			@Override
			public void n1() {
				System.out.println("In interface");
				
			}
		};
		i1.n1();
    }
}
