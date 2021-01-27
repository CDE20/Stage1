package com.cts.engineAnalysis;

public class DieselEngine extends Engine{

	@Override
	public int getPerformance() {
	int horsepower=(getRpm()*getTorque())/63025;
		return horsepower;
	}


	// Type your code here
	

}
