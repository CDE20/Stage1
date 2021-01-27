package com.cts.eezee;

import java.text.ParseException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import java.util.*;
import java.text.*;
import com.cts.eezee.model.Booking;

import com.cts.eezee.service.TransportService;

public class Main {

	public static void main(String[] args) throws ParseException {
		
	ApplicationContext context= new ClassPathXmlApplicationContext("bean.xml");
	Booking bObj = (Booking)context.getBean("booking");
	TransportService tObj = (TransportService)context.getBean("service");
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the Customer Name");
	String name=sc.nextLine();
	System.out.println("Enter the Mobile Number");
	long phone=sc.nextLong();
	System.out.println("Enter the Destination");
	String destination=sc.next();
	System.out.println("Enter the Date of Jouney <dd-MM-yyy>");
	String dateString=sc.next();
	SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
	// code here
	Date date = sdf.parse(dateString);
	bObj.setCustomerName(name);
	bObj.setMobileNumber(phone);
	bObj.setDestination(destination);
	bObj.setDateOfJourney(date);
	tObj.registerBooking(bObj);
	}	

}
