package com.sample;

public class AccountDeposit implements Runnable {

	private BankAccount account;
	private double amount;
	
	public BankAccount getAccount() {
		return account;
	}
	
	public double getAmount() {
		return amount;
	}
	
	public void setAccount(BankAccount account) {
		this.account = account;
	}
	
	public void setAmount(double amount) {
		this.amount = amount;
	}
	
	public AccountDeposit() {
		
	}
	
	public AccountDeposit(BankAccount account, double amount) {
		this.account = account;
		this.amount = amount;
	}
	
	@Override
	public void run() {
		try {
			for(int i = 0; i < 10; i++) {
				account.depositAmount(amount);
				Thread.sleep(1000);
			}
		} catch(InterruptedException ex) {
			System.out.println("Deposit Interrupted");
		}
	}
}
