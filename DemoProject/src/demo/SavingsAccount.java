package demo;

public class SavingsAccount extends BankAccount{

	@Override
	public void deposit(double amt) {
		double bal = this.getBalance();
		bal += amt;
		this.setBalance(bal);
		System.out.println(amt + " deposited. Current Balance: " + bal);
		
	}

	@Override
	public void withdrawal(double amt) {
		double bal = this.getBalance();
		if(bal > amt) {
			bal -= amt;
			this.setBalance(bal);
			System.out.println(amt + " withdrawn. Current Balance: " + bal);
		} else {
			System.out.println("Insufficient Balance");
		}
		
	}

	@Override
	public void display() {
		System.out.println("Account Details:");
		System.out.println("Account#: " + this.getAcccountNo());
		System.out.println("Account Holder Name: " + this.getAccountHolder());
		System.out.println("Current Balance: " + this.getBalance());
	}

}
