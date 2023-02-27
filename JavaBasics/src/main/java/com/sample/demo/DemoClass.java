package com.sample.demo;

public abstract class DemoClass {
	protected int id;
	private int id1;
	
	public void method1() {
		System.out.println(id1);
	}
	
	public abstract void method2();
	
	public final void m1() {System.out.println("In DemoClass");}
	public final int m1(int i) {
		return 0;
	}
}
