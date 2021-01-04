package com.cts.engineAnalysis;

public class PetrolEngine extends Engine {

	@Override
	public int getPerformance() {
		// TODO Auto-generated method stub
		return (this.getTorque()*this.getRpm())/5252;
	}
}
