package com.cts.eezee;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cts.eezee.model.Booking;

import com.cts.eezee.service.TransportService;

public class Main {

	public static void main(String[] args) throws ParseException {
		
	
	Scanner sc = new Scanner(System.in);
	// code here
		ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
		TransportService transportService = (TransportService)context.getBean("transportService");
		Booking booking = (Booking)context.getBean("booking");
		System.out.println("Enter the Customer Name");
		String name = sc.nextLine();
		System.out.println("Enter the Mobile Number");
		long number = sc.nextLong();
		sc.nextLine();
		System.out.println("Enter the Destination");
		String destination = sc.nextLine();
		System.out.println("Enter the Date of Jouney <dd-MM-yyy>");
		String date = sc.nextLine();
	    SimpleDateFormat format=new SimpleDateFormat("dd-mm-yyyy");
		Date dateOfJourney=format.parse(date);
		
		booking.setCustomerName(name);
		booking.setMobileNumber(number);
		booking.setDestination(destination);
		booking.setDateOfJourney(dateOfJourney);
		
		transportService.registerBooking(booking);
		
		
	}	

}
