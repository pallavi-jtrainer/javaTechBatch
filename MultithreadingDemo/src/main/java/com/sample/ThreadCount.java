package com.sample;

public class ThreadCount extends Thread {

	public ThreadCount() {
		super("Thread Running");
		System.out.println("Thread Count Object");
		start();
	}
	
	@Override
	public void run() {
		try {
			Thread.currentThread().setPriority(2);
			for(int i = 0; i < 10; i++) {
				System.out.println("Thread in loop");
				System.out.println("Priority: " + Thread.currentThread().getPriority());
				System.out.println("Name: " + Thread.currentThread().getName());
				Thread.sleep(1000);
			}
		} catch(InterruptedException ex) {
			System.out.println(ex.getMessage());
		}
	}
}
