package com.spring.ui;
import java.util.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.app.AddressBook;

public class Driver {
	
	
	public static AddressBook loadAddressBook()
	{
		ApplicationContext context = new ClassPathXmlApplicationContext("classpath:applicationContext.xml");
		AddressBook book = (AddressBook) context.getBean("addressBookBean"); 
		return book;
	}
	
	public static void main(String[] args)
	{
		//invoke the loadAddressBook() method from main retrieve the AddressBook object, get the details from the user set the values and display the values
		Scanner sc = new Scanner(System.in);
		AddressBook ab = loadAddressBook();
		System.out.println("Enter the temporary address\nEnter the house name");
		String houseName = sc.next();
		System.out.println("Enter the street");
		sc.nextLine();
		String street = sc.nextLine();
		System.out.println("Enter the city");
		String city = sc.nextLine();
		System.out.println("Enter the state");
		String state = sc.nextLine();
		System.out.println("Enter the phone number");
		String phone = sc.next();
		ab.setPhoneNumber(phone);
		ab.getTempAddress().setHouseName(houseName);
		ab.getTempAddress().setCity(city);
		ab.getTempAddress().setState(state);
		ab.getTempAddress().setStreet(street);
		System.out.println("Temporary address");
		System.out.println("House name:"+ab.getTempAddress().getHouseName());
		System.out.println("Street:"+ab.getTempAddress().getStreet());
		System.out.println("City:"+ab.getTempAddress().getCity());
		System.out.println("State:"+ab.getTempAddress().getState());
		System.out.println("Phone number:"+ab.getPhoneNumber());
	}

}
