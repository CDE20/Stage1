package com.cts.engineAnalysis;

public class DieselEngine  extends Engine{
	// Type your code here

	@Override
	public int getPerformance() {
		return (getTorque() * getRpm())/63025;
	}


	

}
