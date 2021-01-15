package com.cts.eezee;

import java.text.ParseException;
import java.util.Scanner;
import java.text.*;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cts.eezee.model.Booking;

import com.cts.eezee.service.TransportService;

public class Main {

	public static void main(String[] args) throws ParseException {
		
	
	
	// code here
	Scanner sc = new Scanner(System.in);
		ApplicationContext context = new ClassPathXmlApplicationContext("classpath:bean.xml");
		TransportService service = (TransportService) context.getBean("transportService");
		Booking booking = (Booking) context.getBean("booking");
		System.out.println("Enter Customer Name");
		String name = sc.nextLine();
		System.out.println("Enter the Mobile Number");
		Long mobile = sc.nextLong();
		System.out.println("Enter Customer Destination");
		String destination = sc.next();
		System.out.println("Enter the Date of Jouney <dd-MM-yyy>");
		String date = sc.next();
		booking.setCustomerName(name);
		booking.setDestination(destination);
		booking.setMobileNumber(mobile);
		SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy"); 
		booking.setDateOfJourney(sdf.parse(date));
		service.registerBooking(booking);
		
		
	}	

}
