package com.cts.engineAnalysis;

public class DieselEngine extends Engine {

	@Override
	public int getPerformance() {
		int horsepower = (getTorque() * getRpm())/63025;
		return horsepower;
	}


	// Type your code here
	

}
