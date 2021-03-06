package com.spring.ui;

import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.app.Address;
import com.spring.app.AddressBook;
public class Driver {
	
	
public static AddressBook loadAddressBook() {
	//	@SuppressWarnings("resource")
		ApplicationContext apc = new ClassPathXmlApplicationContext("applicationContext.xml");
		AddressBook e = (AddressBook) apc.getBean("addBook");
		return e;
	}

	public static void main(String[] args) {
		// invoke the loadAddressBook() method from main retrieve the
		// AddressBook object, get the details from the user set the values and
		// display the values
		AddressBook adBook=loadAddressBook();
		Address ad = adBook.getTempAddress();
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the temporary address");
		System.out.println("Enter the house name");
		ad.setHouseName(sc.nextLine());
		System.out.println("Enter the street");
		ad.setStreet(sc.nextLine());
		System.out.println("Enter the city");
		ad.setCity(sc.nextLine());
		System.out.println("Enter the state");
		ad.setState(sc.nextLine());
		System.out.println("Enter the phone number");
		adBook.setPhoneNumber(sc.nextLine());
		System.out.println("Temporary address");
		System.out.println("House name:"+ad.getHouseName());
		System.out.println("Street:"+ad.getStreet());
		System.out.println("City:"+ad.getCity());
		System.out.println("State:"+ad.getState());
		System.out.println("Phone number:"+adBook.getPhoneNumber());
	}

}
