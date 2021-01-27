package com.cts.EBanking;

import java.text.DecimalFormat;
import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class App {
	public static void main(String[] args) {

		new SkeletonValidator();
		ApplicationContext context=new ClassPathXmlApplicationContext("spring.xml");
		SmartBankAccount obj=(SmartBankAccount) context.getBean("smartBankAccount");	
		Scanner scanner = new Scanner(System.in);		
		System.out.println("Welcome Mr/Ms: "+obj.getName());
		System.out.println("Your customer id is : "+obj.getCustomerId());
		System.out.println("Please select account type\r\n" + 
				"1 CurrentAccount\r\n" + 
				"2 RecurringAccount\r\n" + 
				"3 FixedAccount\r\n" + 
				"");
		int choice1;
		do {
			choice1=scanner.nextInt();
		switch (choice1) {

		case 1:
			//System.out.println("id is "+obj.getCustomerId());
			System.out.println("Select transaction type \n 1.Deposit \n 2.Withdraw");
			int choice = scanner.nextInt();
			
			if (choice == 1) {
				//Do call deposite
				System.out.println("Enter amount to be deposited");
				double amount =scanner.nextDouble();
				amount=obj.doDeposit(amount);
				System.out.printf("Your balance amount is %.2f",amount);

			} else if (choice == 2) {
				System.out.println("Enter amount to be withdrawn");
				double amount=scanner.nextDouble();
				amount=obj.doWithdraw(amount);
				System.out.printf("Your balance amount is %.2f",amount);

			} else {
				System.out.println("Wrong choice");
			}
			break;
		case 2:
			System.out.println("Enter monthly installment");
			double amount1=scanner.nextDouble();
			System.out.println("Enter tenure in months");
			int months1=scanner.nextInt();
			System.out.println("Your balance after " +months1+" months will be "+obj.calculateRecurringAccount(amount1, months1));
			break;
		case 3:
			System.out.println("Enter FD amount");
			double amount=scanner.nextDouble();
			System.out.println("Enter tenure in months");
			int months=scanner.nextInt();
			System.out.println("Your balance after "+months+" months will be "+obj.calculateFixedAccount(amount, months));
			
			break;

		default:
			System.out.println("Wrong Choice");

		}
		}while(choice1!=3);
	}
}
