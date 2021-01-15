package com.cts.engineAnalysis;

public class PetrolEngine extends Engine  {

// Type your code here
@Override
    public int getPerformance() {
       /* int horsepower=0;
         horsepower = (getTorque()) * (getTorque())/(5252);
        return horsepower;*/
        return super.getTorque()*super.getRpm()/5252;
    }
	
	

}
