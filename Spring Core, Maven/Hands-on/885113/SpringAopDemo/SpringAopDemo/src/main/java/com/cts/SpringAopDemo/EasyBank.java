package com.cts.SpringAopDemo;

import java.util.Scanner;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

// Type your code here
@Component
public class EasyBank {

	private int pinCode = 6789;
	private int balance = 10000;
	private int tempPin;

	public int getPinCode() {
		return pinCode;
	}
	@Value("6789")
	public void setPinCode(int pinCode) {
		this.pinCode = pinCode;
	}

	public int getBalance() {
		return balance;
	}

	@Value("10000")
	public void setBalance(int balance) {
		this.balance = balance;
	}

	public int getTempPin() {
		return tempPin;
	}

	public void setTempPin(int tempPin) {
		this.tempPin = tempPin;
	}

	public void doDeposit(int amount) {

		if(amount>0) {
			balance=balance+amount;
		System.out.println("Your  balance is "+balance);
		}
		
		
	}

	public void doWithdraw(int amount) {

	if(balance>=amount) {
		balance=balance-amount;
		System.out.println("You have successfully withdrawn "+amount); 		 
	}
	else
System.out.println("Insufficient Fund");

	}

	public void doChangePin(int oldPin, int pin) {
if(oldPin!=pinCode ||
!Integer.toString(pin).matches("^[1-9]{1}[0-9]{3}")) {
	System.out.println("Invalid pin");
	return;
}
		pinCode=pin;
	}

	public void showBalance() {
System.out.println("Your balance is "+balance);
		// Type your code here
		
	}

}
