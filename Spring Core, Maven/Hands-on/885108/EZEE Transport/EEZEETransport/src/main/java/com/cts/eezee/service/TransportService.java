package com.cts.eezee.service;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Map.Entry;

import com.cts.eezee.model.Booking;
import com.cts.eezee.model.Vehicle;

public class TransportService {
	private Vehicle vehicle;
	
	public Vehicle getVehicle() {
		return vehicle;
	}

	public void setVehicle(Vehicle vehicle) {
		this.vehicle = vehicle;
	}

	public void registerBooking(Booking booking) throws ParseException {
		
		
		// code here
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Customer Name");
		booking.setCustomerName(sc.nextLine());
		System.out.println("Enter the Mobile Number");
		booking.setMobileNumber(sc.nextLong());
		System.out.println("Enter the Destination");
		booking.setDestination(sc.next());
		System.out.println("Enter the Date of Jouney<dd-MM-yyy>");
		booking.setDateOfJourney(new SimpleDateFormat("dd-MM-yyyy").parse(sc.next()));
		calculateTravelCost(this.getVehicle().getSource(), booking.getDestination(), booking.getDateOfJourney());
		
	}
	public void calculateTravelCost(String source, String destination, Date doj) {

		// code here
		if(checkAvailableDateForTravel(doj))
			System.out.println("Total Travel Cost is Rs. "+getCost(destination));
		else
			System.out.println("Invalid Travel Date");
	}
	
	public boolean checkAvailableDateForTravel(Date doj) {
		
		
		// code here
		Date date;
		
		try {
			String today = new SimpleDateFormat("dd-MM-yyyy").format(new Date());
			date = new SimpleDateFormat("dd-MM-yyyy").parse(today);
		//	Calendar c = Calendar.getInstance();
		//	c.setTime(date);
		//	c.add(Calendar.DATE, 1);
			//System.out.println(date);
			//Date date1;
		//	date1 = new SimpleDateFormat("dd-MM-yyyy").parse(new SimpleDateFormat("dd-MM-yyyy").format(c.getTime()));
			//System.out.println(date1);
			if(date.equals(doj) || doj.after(date))
				return true;
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		return false;
	}
	
	public double getCost(String destination) {
		
		// code here
		return this.getVehicle().getDestinationMap().get(destination);
	}


}
