package com.cts.EBanking;

import java.text.DecimalFormat;
import java.util.List;

public class SmartBankAccount extends BankAccount {
	DecimalFormat decimalFormat = new DecimalFormat("###.00");

	public SmartBankAccount(int customerId, String name, double balance, List<String> accounts) {
		super(customerId, name, balance, accounts);
	}

	@Override
	public double calculateFixedAccount(double amount, int months) {
		// TODO Auto-generated method stub
		double A = -1;
		if (amount > 9999 && amount < 1000001 && months > 0 && months < 121) {
			A = amount * Math.pow((1 + 0.1 / 12), months);
		}
		return Double.parseDouble(decimalFormat.format(A));
	}

	@Override
	public double calculateRecurringAccount(double amount, int months) {
		double A = -1;
		if (amount > 999 && amount < 50001 && months > 0 && months < 61) {
			A = (amount * months) + (amount * months * (months + 1) * 0.07 / 24);
		}
		return Double.parseDouble(decimalFormat.format(A));
	}

	// type your code here

}
