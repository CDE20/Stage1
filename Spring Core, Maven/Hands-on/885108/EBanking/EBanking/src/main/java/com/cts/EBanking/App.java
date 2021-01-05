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
		
		Scanner scanner = new Scanner(System.in);		
		ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		SmartBankAccount smart = (SmartBankAccount) context.getBean("smartBankAccount");
		DecimalFormat df= new DecimalFormat("###.00");
		System.out.println("Welcome Mr/Ms: "+smart.getName()+"\nYour customer id is :"+smart.getCustomerId()+"\nPlease select account type");
		int count =1 ;
		for(String s : smart.getAccounts()){
			System.out.println(count+" "+s);
			count++;
		}
		switch (scanner.nextInt()) {

		case 1:
			System.out.println("Select transaction type \n 1.Deposit \n 2.Withdraw");
			int choice = scanner.nextInt();
			if (choice == 1) {
				System.out.println("Enter amount to be deposited");
				smart.doDeposit(scanner.nextDouble());
				System.out.println("Your balance amount is "+df.format(smart.getBalance()));
			} else if (choice == 2) {
				//Do call Withdraw				
				System.out.println("Enter amount to be withdrawn");
				smart.doWithdraw(scanner.nextDouble());
				System.out.println("Your balance amount is "+df.format(smart.getBalance()));
			} else {
				System.out.println("Wrong choice");
			}
			break;
		case 2:
			//Code for recurringAccount
			System.out.println("Enter monthly installment");
			double installment  = scanner.nextDouble();
			if(installment > 999 && installment < 50001)
			System.out.println("Enter tenure in months");
			int months = scanner.nextInt();
			if(months > 0 && months < 61)
				System.out.println("Your balance after "+months+" months will be "+smart.calculateRecurringAccount(installment, months));
			break;
		case 3:
			//Code for FD 
			System.out.println("Enter FD amount");
			double fd_amount  = scanner.nextDouble();
			if(fd_amount > 9999 && fd_amount < 1000001)
			System.out.println("Enter tenure in months");
			int months_ = scanner.nextInt();
			if(months_ > 0 && months_ < 121)
			System.out.println("Your balance after "+months_+" months will be "+smart.calculateFixedAccount(fd_amount, months_));
				break;

		default:
			System.out.println("Wrong Choice");

		}

	}
}
