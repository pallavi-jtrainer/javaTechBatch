package com.sample;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class BankAccount {
	private double balance;
	private Lock accountLock;
	
	public double getBalance() {
		return balance;
	}
	
	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	public void depositAmount(double amount) {
		
		try {
			accountLock.lock();
			System.out.println("Depositing amount " + amount);
			balance += amount;
			System.out.println("Current Balance: " + balance);
		} catch(Exception e) {
			System.out.println(e.getMessage());
		} finally {
			accountLock.unlock();
		}
	}
	
	public void withdrawAmount(double amount) {
		accountLock.lock();
		try {
			System.out.println("Withdrawing amount " + amount);
			balance -= amount;
			System.out.println("Current Balance: " + balance);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		} finally {
			accountLock.unlock();
		}
	}
	
	public BankAccount() {
		balance = 10000;
		accountLock = new ReentrantLock();
	}
	
	public BankAccount(double amt) {
		balance = amt;
	}
}
