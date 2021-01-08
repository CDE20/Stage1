package com.cts.engineAnalysis;

public class PetrolEngine extends Engine {

// Type your code here
		public int getPerformance(){
		   
		    int torque = getTorque();
		    int rpm = getRpm();
		    int horsepower = (int)((torque*rpm)/5252);
		    
		    return horsepower;
		}
	

}
