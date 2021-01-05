package com.cts.engineAnalysis;

public class DieselEngine extends Engine {

	@Override
	public int getPerformance() {
		// TODO Auto-generated method stub
		return (this.getTorque()*this.getRpm())/63025;
	}


	// Type your code here
	

}
