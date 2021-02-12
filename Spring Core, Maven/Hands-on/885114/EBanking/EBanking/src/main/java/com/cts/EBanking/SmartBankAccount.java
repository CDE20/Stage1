package com.cts.EBanking;

import java.text.DecimalFormat;
import java.util.List;

public class SmartBankAccount extends BankAccount {

//	SmartBankAccount() {
//
//	}

	public SmartBankAccount(int customerId, String name, double balance, List<String> accounts) {
		super(customerId, name, balance, accounts);
		System.out.println(customerId + " " + name + " " + balance + " " + accounts);
	}

	@Override
	public double calculateFixedAccount(double amount, int months) {
		double fixedAmount = -1;

		double P = amount;
		double r = 0.10;
		double n = 12;
		double t = months;

		if (amount > 9999 && amount < 1000001 && months < 121 && months > 0) {
			fixedAmount = P * Math.pow((1 + r / n), (n * (t /12)));
		}
		
		DecimalFormat df = new DecimalFormat("#.00");
		String format = df.format(fixedAmount);
		fixedAmount = Double.parseDouble(format);
		
		return fixedAmount;
	}

	@Override
	public double calculateRecurringAccount(double amount, int months) {
		double recurringAmount = -1;

		double P = amount;
		double r = 7;
		double n = months;
		if (amount > 999 && amount < 50001 && months < 61 && months > 0) {
			recurringAmount = (P * n) + (P * (n * (n + 1) / (2 * 12)) * (r / 100));
		}
		
		
		return recurringAmount;
	}

	// type your code here

}
