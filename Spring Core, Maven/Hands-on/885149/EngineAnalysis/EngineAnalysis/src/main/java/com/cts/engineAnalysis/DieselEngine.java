package com.cts.engineAnalysis;

public class DieselEngine extends Engine {

	@Override
	public int getPerformance() {
		return (this.getTorque() * this.getRpm()) / 63025;
	}

}
