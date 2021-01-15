package com.spring.ui;

import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.app.Address;
import com.spring.app.AddressBook;

public class Driver {

	public static AddressBook loadAddressBook() {
		@SuppressWarnings("resource")
		ApplicationContext apc = new ClassPathXmlApplicationContext("applicationContext.xml");
		AddressBook e = (AddressBook) apc.getBean("addBook");
		return e;
	}

	public static void main(String[] args) {
		// invoke the loadAddressBook() method from main retrieve the
		// AddressBook object, get the details from the user set the values and
		// display the values
		AddressBook adBook=loadAddressBook();
		//Address ad = adBook.getTempAddress();
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the temporary address");
		System.out.println("Enter the house name");
		adBook.getTempAddress().setHouseName(sc.nextLine());
		System.out.println("Enter the street");
		adBook.getTempAddress().setStreet(sc.nextLine());
		System.out.println("Enter the city");
		adBook.getTempAddress().setCity(sc.nextLine());
		System.out.println("Enter the state");
		adBook.getTempAddress().setState(sc.nextLine());
		System.out.println("Enter the phone number");
		adBook.setPhoneNumber(sc.nextLine());
		System.out.println("Temporary address");
		System.out.println("House name:"+adBook.getTempAddress().getHouseName());
		System.out.println("Street:"+adBook.getTempAddress().getStreet());
		System.out.println("City:"+adBook.getTempAddress().getCity());
		System.out.println("State:"+adBook.getTempAddress().getState());
		System.out.println("Phone number:"+adBook.getPhoneNumber());
	}

}
