package com.sample.demo;

public class Demo1 extends DemoClass{
	public final int A;
	
//	public Demo1() {
//		a = 10;
//	}
	{
		A = 10;
	}
	
	public static int stat;
	
//	static {
//		stat = 12;
//		staticMethod();
//	}
	
	public static void staticMethod() {
		System.out.println("In private static method");
	}
	
	
	public void method() {
		id = 1;
		System.out.println(id);
	}

	@Override
	public void method2() {
		// TODO Auto-generated method stub
		
	}
}
