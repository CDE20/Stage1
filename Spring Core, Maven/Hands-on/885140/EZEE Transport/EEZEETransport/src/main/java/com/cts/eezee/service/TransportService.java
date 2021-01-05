package com.cts.eezee.service;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.Map.Entry;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

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
		SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the Customer Name");
		booking.setCustomerName(sc.nextLine());
		System.out.println("Enter the Mobile Number");
		booking.setMobileNumber(sc.nextLong());
		System.out.println("Enter the Destination");
		sc.nextLine();
		booking.setDestination(sc.nextLine());
		System.out.println("Enter the Date of Jouney <dd-MM-yyy>");
		String dateString = sc.nextLine();
		Date date = dateFormat.parse(dateString);
		booking.setDateOfJourney(date);
		calculateTravelCost(vehicle.getSource(), booking.getDestination(), booking.getDateOfJourney());
	}

	public void calculateTravelCost(String source, String destination, Date doj) {

		// code here
		if(checkAvailableDateForTravel(doj)) {
			System.out.println("Total Travel Cost is Rs. " + getCost(destination));
		}
		else
		{
			System.out.println("Invalid Travel Date");
		}
		

	}

	public boolean checkAvailableDateForTravel(Date doj) {

		// code here
		SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
		Date currDate = new Date();
		try {
			currDate = dateFormat.parse("30-12-2020");
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		if(doj.equals(currDate) || doj.after(currDate))
			return true;
		return false;
	}

	public double getCost(String destination) {

		// code here
		Map<String, Double> destinationMap = vehicle.getDestinationMap();
		for (Entry<String,Double> entry : destinationMap.entrySet()) {
			if(entry.getKey().equals(destination))
					return entry.getValue();
		}
		return 0.0;
	}

}
