package com.cts.engineAnalysis;

public class DieselEngine extends Engine  {


	// Type your code here
	@Override
    public int getPerformance() {
        /*int horsepower=0;
         horsepower = (getTorque()) * (getTorque())/(63025);
        return horsepower;*/
        return super.getTorque()*super.getRpm()/63025;
    }
	

}
