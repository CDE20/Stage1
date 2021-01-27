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
		
		calculateTravelCost(vehicle.getSource(),booking.getDestination(), booking.getDateOfJourney());
	
		
	}
	public void calculateTravelCost(String source, String destination, Date doj) {

	if(checkAvailableDateForTravel(doj)) {
		System.out.println("TotalTravel Cost is Rs."+ getCost(destination));
	}
	else System.out.println("Invalid Travel Date");
		
		
	
	}
	
	public boolean checkAvailableDateForTravel(Date doj) {
		Date now;
		try {
			now=new SimpleDateFormat("dd-MM-yyyy").parse("27-04-2020");
			if(doj.after(now))
				return true;
			
		}catch(Exception e) {
		System.out.println(e.getMessage());
		}
			return false;
	}
	
	public double getCost(String destination) {
		if(vehicle.getDestinationMap().containsKey(destination))
	 return vehicle.getDestinationMap().get(destination);
		
		
		
		return 0.0;
	}


}
