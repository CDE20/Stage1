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
		// Configuration and Input data read here
		// Refer sample input details

		ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		SmartBankAccount smartBankAccount = context.getBean("smartBankAccount", SmartBankAccount.class);

		System.out.println("Welcome Mr/Ms: " + smartBankAccount.getName());
		System.out.println("Your customer id is :" + smartBankAccount.getCustomerId());

		int i = 1;
		System.out.println("Please select account type");
		for (String accountType : smartBankAccount.getAccounts()) {
			System.out.println(i++ + " " + accountType);
		}

		Scanner scanner = new Scanner(System.in);
		switch (scanner.nextInt()) {

		case 1:
			System.out.println("Select transaction type \n 1.Deposit \n 2.Withdraw");
			int choice = scanner.nextInt();
			if (choice == 1) {
				// Do call deposite
				System.out.println("Enter amount to be deposited");
				int amount = scanner.nextInt();
				double balance = smartBankAccount.doDeposit(amount);
				
				DecimalFormat df = new DecimalFormat("#.00");
				System.out.println("Your balance amount is " + df.format(balance));

			} else if (choice == 2) {
				// Do call Withdraw
				System.out.println("Enter amount to be withdrawn");
				int amount = scanner.nextInt();
				double balance = smartBankAccount.doWithdraw(amount);
				
				DecimalFormat df = new DecimalFormat("#.00");
				System.out.println("Your balance amount is " + df.format(balance));

			} else {
				System.out.println("Wrong choice");
			}
			break;
		case 2:
			// Code for recurringAccount
			System.out.println("Enter monthly installment");
			int amount = scanner.nextInt();
			System.out.println("Enter tenure in months");
			int tenure = scanner.nextInt();
			
			double balance = smartBankAccount.calculateRecurringAccount(amount, tenure);
			
			DecimalFormat df = new DecimalFormat("#.00");
			System.out.println("Your balance after " + tenure + " months will be " + df.format(balance));
			break;
		case 3:
			// Code for FD
			System.out.println("Enter FD amount");
			int fdAmount = scanner.nextInt();
			System.out.println("Enter tenure in months");
			int tenureMonths = scanner.nextInt();
			
			double balanceAmount = smartBankAccount.calculateFixedAccount(fdAmount, tenureMonths);
			
			DecimalFormat df2 = new DecimalFormat("#.00");
			System.out.println("Your balance after " + tenureMonths + " months will be " + df2.format(balanceAmount));
			break;
			
		default:
			System.out.println("Wrong Choice");

		}

	}
}
