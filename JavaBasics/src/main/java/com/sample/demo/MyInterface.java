package com.sample.demo;

public interface MyInterface {
	default void newMethod() {
		System.out.println("In the interface");
	}
}
