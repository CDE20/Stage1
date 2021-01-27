package com.cts.engineAnalysis;

public class PetrolEngine extends Engine {

// Type your code here


	public int getPerformance(){
	    int horsepower = ( getTorque() * getRpm() )/5252 ;
	    return horsepower;
	}
	

}
