package com.cts.engineAnalysis;

public class DieselEngine extends Engine  {


	// Type your code here
	public int getPerformance(){
	       
		    int torque = getTorque();
		    int rpm = getRpm();
		    int horsepower = (int)((torque*rpm)/63025);
		    
		    return horsepower;
		}

}
