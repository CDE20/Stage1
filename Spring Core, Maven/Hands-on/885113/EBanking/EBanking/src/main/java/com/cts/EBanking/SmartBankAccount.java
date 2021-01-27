package com.cts.EBanking;

import java.text.DecimalFormat;
import java.util.List;

public class SmartBankAccount extends BankAccount  {
	private DecimalFormat df=new DecimalFormat(".00");
	public SmartBankAccount(int customerId, String name, double balance, List<String> accounts){
		super(customerId,name,balance,accounts);
	}

	@Override
	public double calculateFixedAccount(double amount, int months) {
		double finalamount=0;
		if(amount>9999 && amount<1000001 && months>0 && months<121) {	
		finalamount=Math.pow(1+(0.1/months),(months))*amount;
			finalamount = amount * Math.pow((1 + (0.1 / 12)), months);

		return	Double.parseDouble(df.format(finalamount));
		 
		}
		
		return -1;
}

public double calculateRecurringAccount(double amount, int months) {
double finalamount=0;
if(amount>999 &&amount<50001 && months>0 && months<61) {
finalamount=  (amount*months)+(amount*(months*(months+1)/(24.0))*(0.07));
return Double.parseDouble(df.format(finalamount));
}
return -1;
	}
}
