package demo;

//import java.util.Scanner;
import staticpack.OuterClass;

public class MainClass {

	public static void main(String[] args) {
		OuterClass o = new OuterClass();
		OuterClass.InnerClass obj = o.new InnerClass();
		obj.show();
		
		//static inner class object
		OuterClass.Inner obj2 = new OuterClass.Inner();
		obj2.show();
//		
//		StaticDemo sd = new StaticDemo();
//		StaticDemo.setId(23);
//		sd.setName("Test1");
//
//		System.out.println("Object 1: " + StaticDemo.getId());
//		System.out.println("Object 1 Name: " + sd.getName());
//		StaticDemo sd1 = new StaticDemo();
//		sd1.setId(34);
//		sd1.setName("Test2");
//		System.out.println("Object 2: " + sd1.getId());
//		System.out.println("Object 1: " + sd.getId());
//		System.out.println("Object 2 Name: " + sd1.getName());
//		System.out.println("Object 1 Name: " + sd.getName());
		
//		SavingsAccount sa = new SavingsAccount();
//		Scanner sc = new Scanner(System.in);
//		System.out.print("Enter Account Number: ");
//		int no = sc.nextInt();
//		System.out.print("Enter Name: ");
//		String name = sc.next();
//		System.out.print("Enter Initial Balance: ");
//		double bal = sc.nextDouble();
//		
//		sa.setAcccountNo(no);
//		sa.setAccountHolder(name);
//		sa.setBalance(bal);
//		
//		sa.display();
//		
//		System.out.println("Enter amt to Deposit: ");
//		double amt = sc.nextDouble();
//		sa.deposit(amt);
//		System.out.println("After Deposit");
//		sa.display();
//		
//		System.out.print("Enter amt to withdraw: ");
//		amt = sc.nextDouble();
//		sa.withdrawal(amt);
//		System.out.println("After Withdrawal");
//		sa.display();
//		
//		sc.close();

	}

}
