package com.spring.ui;
import com.spring.app.AddressBook;
import com.spring.app.Address;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import java.util.*;

public class Driver {
	
	
	public static AddressBook loadAddressBook()
	{
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        AddressBook ab = (AddressBook)context.getBean("addbook");
		return ab;
	}
	
	public static void main(String[] args)
	{
		//invoke the loadAddressBook() method from main retrieve the AddressBook object, get the details from the user set the values and display the values
       
        AddressBook addrbook =Driver.loadAddressBook();
        Scanner sc = new Scanner(System.in);
        Address addr = addrbook.getTempAddress();
       
        System.out.println("Enter the temporary address");
        System.out.println("Enter the house name");
        addr.setHouseName(sc.nextLine());
        System.out.println("Enter the street");
        addr.setStreet(sc.nextLine());
        System.out.println("Enter the city");
        addr.setCity(sc.nextLine());
        System.out.println("Enter the state");
        addr.setState(sc.nextLine());
        System.out.println("Enter the phone number");
        addrbook.setPhoneNumber(sc.nextLine());
        
        System.out.println("Temporary address");
        System.out.println("House name:"+addr.getHouseName());
        System.out.println("Street:"+addr.getStreet());
        System.out.println("City:"+addr.getCity());
        System.out.println("State:"+addr.getState());
        System.out.println("Phone Number:"+addrbook.getPhoneNumber());
	}

}
