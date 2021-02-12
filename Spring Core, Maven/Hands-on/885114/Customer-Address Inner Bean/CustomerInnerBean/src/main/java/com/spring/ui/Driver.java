package com.spring.ui;

import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.app.Address;
import com.spring.app.AddressBook;

public class Driver {

	public static AddressBook loadAddressBook() {

		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		AddressBook addressBook = context.getBean("addressBook", AddressBook.class);
		return addressBook;
	}

	public static void main(String[] args) {
		// invoke the loadAddressBook() method from main retrieve the AddressBook
		// object, get the details from the user set the values and display the values
		AddressBook addressBook = loadAddressBook();

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the temporary address");
		System.out.println("Enter the house name");
		String houseName = sc.nextLine();

		System.out.println("Enter the street");
		String street = sc.nextLine();

		System.out.println("Enter the city");
		String city = sc.nextLine();

		System.out.println("Enter the state");
		String state = sc.nextLine();

		System.out.println("Enter the phone number");
		String phoneNumber = sc.nextLine();

		Address address = addressBook.getTempAddress();
		address.setHouseName(houseName);
		address.setStreet(street);
		address.setCity(city);
		address.setState(state);

		addressBook.setPhoneNumber(phoneNumber);

		System.out.println();
		System.out.println("Temporary address");

		System.out.println("House Name:" + addressBook.getTempAddress().getHouseName());
		System.out.println("Street:" + addressBook.getTempAddress().getStreet());
		System.out.println("City:" + addressBook.getTempAddress().getCity());
		System.out.println("State:" + addressBook.getTempAddress().getState());
		System.out.println("Phone number:" + addressBook.getPhoneNumber());
	}

}