package com.cts.engineAnalysis;

public class PetrolEngine extends Engine {

	@Override
	public int getPerformance() {
		return (this.getTorque() *this.getRpm())/5252;
	}

// Type your code here
	
	

}
