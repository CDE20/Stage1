package com.spring.ui;
import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.app.AddressBook;

public class Driver {
	
	
	public static AddressBook loadAddressBook()
	{
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		AddressBook addressBook = (AddressBook) context.getBean("addressBook");
		return addressBook;
	}
	
	public static void main(String[] args)
	{
		//invoke the loadAddressBook() method from main retrieve the AddressBook object, get the details from the user set the values and display the values
		AddressBook addressBook = loadAddressBook();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the temporary address\nEnter the house name");
		addressBook.getTempAddress().setHouseName(sc.nextLine());
		System.out.println("Enter the street");
		addressBook.getTempAddress().setStreet(sc.nextLine());
		System.out.println("Enter the city");
		addressBook.getTempAddress().setCity(sc.nextLine());
		System.out.println("Enter the state");
		addressBook.getTempAddress().setState(sc.nextLine());
		System.out.println("Enter the phone number");
		addressBook.setPhoneNumber(sc.nextLine());
		System.out.println("Temporary address\nHouse name:"+addressBook.getTempAddress().getHouseName()+"\nStreet:"+addressBook.getTempAddress().getStreet()+
				"\nCity:"+addressBook.getTempAddress().getCity()+"\nState:"+addressBook.getTempAddress().getState()+"\nPhone number:"+addressBook.getPhoneNumber());
	}

}
