package com.cts.engineAnalysis;

public class Car {

	private String name;
	private Engine engine;

	// Type your code here
	public Car(String name, Engine engine) {
		this.name = name;
		this.engine = engine;
	}

	public void getReport() {

		String engineName = null;
		if (engine instanceof PetrolEngine)
			engineName = "petrol";
		else if (engine instanceof DieselEngine)
			engineName = "diesel";
		// Type your code here
		System.out
				.println(name + " car with " + engineName + " engine gives " + engine.getPerformance() + " horsepower");
	}

}
