package com.cts.engineAnalysis;

public class PetrolEngine extends Engine {

// Type your code here

	private int torque;
	private int rpm;
	private String fuel;

	@Override
	public int getPerformance() {
		return (torque * rpm) / 5252;
//		return 0;
	}

	public String getFuel() {
		return fuel;
	}

	public int getTorque() {
		return torque;
	}

	public void setTorque(int torque) {
		this.torque = torque;
	}

	public int getRpm() {
		return rpm;
	}

	public void setRpm(int rpm) {
		this.rpm = rpm;
	}

	public void setFuel(String fuel) {
		this.fuel = fuel;
	}

}
