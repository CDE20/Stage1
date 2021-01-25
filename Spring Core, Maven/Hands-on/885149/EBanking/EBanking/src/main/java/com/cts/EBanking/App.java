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
		DecimalFormat numberFormat = new DecimalFormat("###.00");
		ApplicationContext context = new ClassPathXmlApplicationContext("classpath:spring.xml");
		BankAccount acc = (SmartBankAccount) context.getBean("smartBankAccount");
		Scanner scanner = new Scanner(System.in);
		System.out.println("Welcome Mr/Ms: " + acc.getName());
		System.out.println("Your customer id is :" + acc.getCustomerId());
		System.out.println("Please select account type");
		int i = 1;
		for (String s : acc.getAccounts()) {
			System.out.println(i++ + " " + s);
		}
		switch (scanner.nextInt()) {

		case 1:
			System.out.println("Select transaction type \n 1.Deposit \n 2.Withdraw");
			int choice = scanner.nextInt();
			if (choice == 1) {
				// Do call deposite
				System.out.println("Enter amount to be deposited");
				double amt = scanner.nextDouble();
				System.out.println("Your balance amount is " + acc.doDeposit(amt));

			} else if (choice == 2) {
				// Do call Withdraw
				System.out.println("Enter amount to be withdrawn");
				double amt = scanner.nextDouble();
				System.out.println("Your balance amount is " + acc.doWithdraw(amt));

			} else {
				System.out.println("Wrong choice");
			}
			break;
		case 2:
			// Code for recurringAccount
			System.out.println("Enter monthly installment");
			double amt = scanner.nextDouble();
			System.out.println("Enter tenure in months");
			int t = scanner.nextInt();
			System.out.println("Your balance after " + t + " months will be " + acc.calculateRecurringAccount(amt, t));

			break;
		case 3:
			// Code for FD
			System.out.println("Enter FD amount");
			double amt1 = scanner.nextDouble();
			System.out.println("Enter tenure in months");
			int month = scanner.nextInt();
			System.out.println("Your balance after " + month + " months will be "
					+ numberFormat.format(acc.calculateFixedAccount(amt1, month)));
			break;

		default:
			System.out.println("Wrong Choice");

		}

	}
}
