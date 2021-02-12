package com.cts.eezee.service;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.Vector;
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
		ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
		Vehicle vehicle = context.getBean("vehicle", Vehicle.class);
		calculateTravelCost(vehicle.getSource(), booking.getDestination(), booking.getDateOfJourney());
	}

	public void calculateTravelCost(String source, String destination, Date doj) {

		// code here
		if(checkAvailableDateForTravel(doj)) {
			System.out.println("Total Travel Cost is Rs. " + getCost(destination));
		}
		else {
			System.out.println("Invalid Travel Date");
		}
	}

	public boolean checkAvailableDateForTravel(Date doj) {

		// code here
		Date currentDate = new Date();
		return doj.compareTo(currentDate) >= 0;
	}

	public double getCost(String destination) {

		// code here
		ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
		Vehicle vehicle = context.getBean("vehicle", Vehicle.class);
		return vehicle.getDestinationMap().get(destination);
	}

	@Override
	public String toString() {
		return "TransportService [vehicle=" + vehicle + "]";
	}
	
}
