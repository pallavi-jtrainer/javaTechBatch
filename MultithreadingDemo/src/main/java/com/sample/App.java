package com.sample;

/**
 * Hello world!
 *
 */
//public class App extends Thread
//{
//    public static void main( String[] args )
//    {
//        App obj = new App();
//        obj.start();
//    }
//    
//    @Override
//    	public void run() {
//    		System.out.println("thread is running");
//    	}
//}

public class App {

//	@Override
//	public void run() {
//		
//		System.out.println("thread is running");
//	}
//	
	public static void main(String[] args) {
//		App obj = new App();
//		obj.run();
//		
//		ThreadCount t1 = new ThreadCount();
//		try {
//			while(t1.isAlive()) {
//				System.out.println("Main Thread Running");
//				Thread.sleep(1000);
//			}
//		} catch (InterruptedException ex) {
//			System.out.println("Main Thread Interrupted");
//		}
		BankAccount acc = new BankAccount();
		AccountDeposit ad = new AccountDeposit(acc, 2000);
		AccountWithdrawal aw = new AccountWithdrawal(acc, 2000);
		
		Thread t1 = new Thread(ad);
		Thread t2 = new Thread(aw);
		
		t1.start();
		t2.start();
		
	}
	
}