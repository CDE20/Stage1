package com.cts.eezee;
import java.util.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cts.eezee.model.Booking;

import com.cts.eezee.service.TransportService;

public class Main {

	public static void main(String[] args) throws ParseException {
		Scanner sc=new Scanner(System.in);
	ApplicationContext context=new ClassPathXmlApplicationContext("bean.xml");
	TransportService transportservice=(TransportService) context.getBean("transport");
	Booking obj=new Booking();
		System.out.println("Enter the Customer Name");
		String customerName=sc.nextLine();
		obj.setCustomerName(customerName);
		System.out.println("Enter the Mobile Number");
		long mobile=sc.nextLong();
		obj.setMobileNumber(mobile);
		System.out.println("Enter the Destination");
		String destination=sc.next();
		destination=destination.toLowerCase();
		destination=destination.substring(0,1).toUpperCase()+destination.substring(1);
		obj.setDestination(destination);
		System.out.println("Enter the Date of Jouney <dd-MM-yyy>");
		String date=sc.next();
		SimpleDateFormat df=new SimpleDateFormat("dd-MM-yyyy");
		obj.setDateOfJourney(df.parse(date));
		transportservice.registerBooking(obj);
		
		
	}	

}
