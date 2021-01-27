package com.cts.engineAnalysis;

public class PetrolEngine extends Engine {

	@Override
	public int getPerformance() {
		int horsepower = ( getTorque() * getRpm())/5252; 
		return horsepower;
	}

// Type your code here
	
	

}
