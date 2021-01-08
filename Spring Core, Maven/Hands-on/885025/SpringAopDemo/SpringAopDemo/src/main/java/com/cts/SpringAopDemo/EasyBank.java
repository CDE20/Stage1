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
		setBalance(amount + getBalance());
    	System.out.println("Your  balance is "+getBalance());
	}

	public void doWithdraw(int amount) {

		// Type your code here
		if(amount>balance){
		    System.out.println("Insufficient Fund");
		}
		else{
		    balance = balance - amount;
		    System.out.println("You have successfully withdrawn "+amount);
		}

	}

	public void doChangePin(int oldPin, int pin) {

		// Type your code here
		String s = String.valueOf(pin);
    
    		if (oldPin == getPinCode()) {
   			if (s.substring(0, 1) != "0" && s.length() == 4)
   				setPinCode(pin);
   		} else {
    			throw new RuntimeException();
    
    		}

	}

	public void showBalance() {

		// Type your code here
		System.out.println("Your balance is "+balance);
		
	}

}
