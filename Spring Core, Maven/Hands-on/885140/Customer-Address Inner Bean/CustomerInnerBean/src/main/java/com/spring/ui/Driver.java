package com.spring.ui;
import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.app.AddressBook;

public class Driver {
	
	
	public static AddressBook loadAddressBook()
	{
		ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
		AddressBook addressBook = (AddressBook) ctx.getBean("addressbook");
		return addressBook;
	}
	
	public static void main(String[] args)
	{
		//invoke the loadAddressBook() method from main retrieve the AddressBook object, get the details from the user set the values and display the values
		AddressBook addressBook = loadAddressBook();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the temporary address");
		System.out.println("Enter the house name");
		addressBook.getTempAddress().setHouseName(sc.nextLine());
		System.out.println("Enter the street");
		addressBook.getTempAddress().setStreet(sc.nextLine());
		System.out.println("Enter the city");
		addressBook.getTempAddress().setCity(sc.nextLine());
		System.out.println("Enter the state");
		addressBook.getTempAddress().setState(sc.nextLine());
		System.out.println("Enter the phone number");
		addressBook.setPhoneNumber(sc.nextLine());
		
		System.out.println("Temporary address");
		System.out.println("House name:" + addressBook.getTempAddress().getHouseName());
		System.out.println("Street:" + addressBook.getTempAddress().getStreet());
		System.out.println("City:" + addressBook.getTempAddress().getCity());
		System.out.println("State:" + addressBook.getTempAddress().getState());
		System.out.println("Phone number:" + addressBook.getPhoneNumber());
	}

}
