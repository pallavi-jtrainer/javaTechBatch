package demo;

public abstract class BankAccount {
	private int acccountNo;
	private String accountHolder;
	private double balance;
	
	public final int getAcccountNo() {
		return acccountNo;
	}
	
	public final double getBalance() {
		return balance;
	}
	
	public final String getAccountHolder() {
		return accountHolder;
	}
	
	public final void setAcccountNo(final int acccountNo) {
		this.acccountNo = acccountNo;
	}
	
	public final void setBalance(final double balance) {
		this.balance = balance;
	}
	
	public final void setAccountHolder(final String accountHolder) {
		this.accountHolder = accountHolder;
	}
	
//	public BankAccount() {
//		
//	}
//	
//	public BankAccount(final int no, final String name, final double bal) {
//		this.acccountNo = no;
//		this.accountHolder = name;
//		this.balance = bal;
//	}
	
	public abstract void deposit(double amt);
	public abstract void withdrawal(double amt);
	public abstract void display();
}
