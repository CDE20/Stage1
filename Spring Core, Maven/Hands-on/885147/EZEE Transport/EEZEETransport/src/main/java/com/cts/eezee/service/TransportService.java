package com.cts.eezee.service;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
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
		calculateTravelCost(vehicle.getSource(), booking.getDestination(), booking.getDateOfJourney());
		
		
	}
	public void calculateTravelCost(String source, String destination, Date doj) {

		// code here
		boolean date = checkAvailableDateForTravel(doj);
		if(date) {
			System.out.println("Total Travel Cost is Rs. "+getCost(destination));
		}
		else {
			System.out.println("Invalid Travel Date");
		}
		
	
	}
	
	public boolean checkAvailableDateForTravel(Date doj) {
		
		
		// code here
		Date current = new Date();
		boolean flag=false;
		if(doj.equals(current) || doj.after(current))
			flag=true;
		
		return flag;
		
	}
	
	public double getCost(String destination) {
		
		// code here
		double cost=0;
		
		if(vehicle.getDestinationMap().containsKey(destination)) {
			cost = vehicle.getDestinationMap().get(destination);
		}
		
		
		
		return cost;
	}


}
