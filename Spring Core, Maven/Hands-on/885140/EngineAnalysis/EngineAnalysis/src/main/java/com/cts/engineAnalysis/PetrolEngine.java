package com.cts.engineAnalysis;

public class PetrolEngine  extends Engine{

// Type your code here
	@Override
	public int getPerformance() {
		
		return (getTorque()*getRpm())/5252;
	}

	
	

}
