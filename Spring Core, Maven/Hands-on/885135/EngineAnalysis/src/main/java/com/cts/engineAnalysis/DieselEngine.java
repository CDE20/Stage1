package com.cts.engineAnalysis;

public class DieselEngine  extends Engine{

    

	// Type your code here
	public int getPerformance(){
	    int horsepower = (getTorque() * getRpm())/63025;
	    return horsepower;
	}

}
