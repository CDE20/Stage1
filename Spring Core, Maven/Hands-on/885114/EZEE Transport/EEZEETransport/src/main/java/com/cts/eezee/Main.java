package com.cts.eezee;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cts.eezee.model.Booking;
import com.cts.eezee.model.Vehicle;
import com.cts.eezee.service.TransportService;

public class Main {

	public static void main(String[] args) throws ParseException {

		ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
		Vehicle vehicle = (Vehicle) context.getBean("vehicle");
		System.out.println(vehicle);
		
		TransportService transportService = context.getBean("transportService", TransportService.class);
		System.out.println(transportService);

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Customer Name");
		String customerName = sc.nextLine();

		System.out.println("Enter the Mobile Number");
		long mobileNumber = Long.parseLong(sc.nextLine());

		System.out.println("Enter the Destination");
		String destination = sc.nextLine();

		System.out.println("Enter the Date of Journey <dd-MM-yyyy>");
		SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
		Date dateOfJourney = sdf.parse(sc.nextLine());

		Booking booking = new Booking();
		booking.setCustomerName(customerName);
		booking.setMobileNumber(mobileNumber);
		booking.setDestination(destination);
		booking.setDateOfJourney(dateOfJourney);
		System.out.println(booking);

		TransportService service = new TransportService();
		service.registerBooking(booking);
		
	}

}
