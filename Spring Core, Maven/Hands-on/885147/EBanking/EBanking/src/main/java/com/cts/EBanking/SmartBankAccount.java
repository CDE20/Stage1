package com.cts.EBanking;

import java.text.DecimalFormat;
import java.util.List;

public class SmartBankAccount extends BankAccount {
	
	private DecimalFormat decimalFormat = new DecimalFormat(".00");
	
	public SmartBankAccount(int customerId, String name, double balance, List<String> accounts){
		super(customerId,name,balance,accounts);
	}

	@Override
	public double calculateFixedAccount(double amount, int months) {
		double fixedAmount=0;
		double r=0.1;
		if(amount > 9999 && amount < 1000001 && months > 0 && months < 121) {
			fixedAmount = amount * Math.pow((1+(r/12)),months);
			return Double.parseDouble(decimalFormat.format(fixedAmount));
		}
		return -1;
	}

	@Override
	public double calculateRecurringAccount(double amount, int months) {
		double recurringAmount=0;
		double r = 0.07;
		if(amount > 999 && amount < 50001 && months > 0 && months < 61) {
		    recurringAmount = (amount*months) + (amount*(months*(months+1)/(24.0))*r);
			return Double.parseDouble(decimalFormat.format(recurringAmount));
		}
		return -1;
		
	}
	
   // type  your code here
   
   
	

	
}
