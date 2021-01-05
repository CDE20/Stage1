package com.cts.engineAnalysis;

public class Car {
	
	private String name;
	private Engine engine;
	
	// Type your code here
	
	public void getReport(){
		if(engine instanceof PetrolEngine)
		System.out.println(name+" car with petrol engine gives "+engine.getPerformance()+" horsepower");
		if(engine instanceof DieselEngine)
			System.out.println(name+" car with diesel engine gives "+engine.getPerformance()+" horsepower");
	}

	public Car(String name, Engine engine) {
		super();
		this.name = name;
		this.engine = engine;
	}


}
