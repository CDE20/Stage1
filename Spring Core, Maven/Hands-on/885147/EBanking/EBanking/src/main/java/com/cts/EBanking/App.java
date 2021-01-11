package com.cts.EBanking;

import java.text.DecimalFormat;
import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		// CODE SKELETON - VALIDATION STARTS
		// DO NOT CHANGE THIS CODE

		new SkeletonValidator();

		// CODE SKELETON - VALIDATION ENDS

		// Please start your code from here
		//Configuration and Input data read here
		//Refer sample input details
		DecimalFormat decimalFormat = new DecimalFormat(".00");
		ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		SmartBankAccount smartBankAccount = (SmartBankAccount) context.getBean("smartBankAccount");
		System.out.println("Welcome Mr/Ms: "+smartBankAccount.getName());
		System.out.println("Your customer id is :"+smartBankAccount.getCustomerId());
		System.out.println("Please select account type");
		System.out.println("1 CurrentAccount");
		System.out.println("2 RecurringAccount");
		System.out.println("3 FixedAccount");
		Scanner scanner = new Scanner(System.in);

		switch (scanner.nextInt()) {

		case 1:
			System.out.println("Select transaction type \n 1.Deposit \n 2.Withdraw");
			int choice = scanner.nextInt();
			if (choice == 1) {
				//Do call deposite
				System.out.println("Enter amount to be deposited");
				double amount=scanner.nextDouble();
				smartBankAccount.doDeposit(amount);
				System.out.println("Your balance amount is "+decimalFormat.format(smartBankAccount.getBalance()));

			} else if (choice == 2) {
				//Do call Withdraw	
				System.out.println("Enter amount to be withdrawn");
				double amount=scanner.nextDouble();
				smartBankAccount.doWithdraw(amount);
				System.out.println("Your balance amount is "+decimalFormat.format(smartBankAccount.getBalance()));
			} else {
				System.out.println("Wrong choice");
			}
			break;
		case 2:
			//Code for recurringAccount
			System.out.println("Enter monthly installment");
			double amount = scanner.nextDouble();
			System.out.println("Enter tenure in months");
			int months = scanner.nextInt();
			System.out.println("Your balance after "+months+" months will be "+decimalFormat.format(smartBankAccount.calculateRecurringAccount(amount, months)));
			break;
		case 3:
			//Code for FD 
			System.out.println("Enter FD amount");
			double fixedamount = scanner.nextDouble();
			System.out.println("Enter tenure in months");
			int n = scanner.nextInt();
			System.out.println("Your balance after "+n+" months will be "+decimalFormat.format(smartBankAccount.calculateFixedAccount(fixedamount, n)));
			break;

		default:
			System.out.println("Wrong Choice");

		}
		
	}
}
