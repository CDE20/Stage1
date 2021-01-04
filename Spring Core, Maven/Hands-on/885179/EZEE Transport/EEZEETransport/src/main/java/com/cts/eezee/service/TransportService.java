package com.cts.eezee.service;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

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
		calculateTravelCost(vehicle.getSource(), booking.getDestination(), booking.getDateOfJourney());
	}

	public void calculateTravelCost(String source, String destination, Date doj) {

		if (checkAvailableDateForTravel(doj)) {
			System.out.println("Total Travel Cost is Rs. " + getCost(destination));
		} else {
			System.out.println("Invalid Travel Date");
		}
	}

	public boolean checkAvailableDateForTravel(Date doj) {

		Date now;
		try {
			now = new SimpleDateFormat("dd-MM-yyyy").parse("27-04-2020");
			if (doj.after(now))
				return true;
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return false;
	}

	public double getCost(String destination) {

		if (vehicle.getDestinationMap().containsKey(destination))
			return vehicle.getDestinationMap().get(destination);
		return 0.0;
	}

}
