package com.cts.SpringAopDemo;

import java.util.Scanner;

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

	public void setPinCode(int pinCode) {
		this.pinCode = pinCode;
	}

	public int getBalance() {
		return balance;
	}

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

		// Type your code here
		balance= balance + amount;
		System.out.println("Your  balance is "+balance);
	}

	public void doWithdraw(int amount) {

		// Type your code here
		if(amount <= balance) {
			balance-=amount;
			System.out.println("You have successfully withdrawn "+amount);
		}
		else {
			System.out.println("Insufficient Fund");
		}

	}

	public void doChangePin(int oldPin, int pin) {

		// Type your code here
		if(oldPin == pinCode) {
			pinCode = pin;
		}
		else {
			throw new RuntimeException();
		}

	}

	public void showBalance() {

		// Type your code here
		System.out.println("Your balance is "+balance);
	}

}
