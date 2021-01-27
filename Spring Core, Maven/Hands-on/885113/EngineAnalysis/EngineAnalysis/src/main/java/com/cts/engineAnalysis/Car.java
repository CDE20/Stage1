package com.cts.engineAnalysis;

public class Car {
	
	private String name;
	private Engine engine;
	
	public Car(String name, Engine engine) {
		super();
		this.name = name;
		this.engine = engine;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}


	public Engine getEngine() {
		return engine;
	}
	public void setEngine(Engine engine) {
		this.engine = engine;
	}
	public void getReport(){
// 	     System.out.println(car.getName()+" car with " +car.getEngine().getFuel()+ " engine gives "+ car.getEngine().getPerformance()+ " horsepower");
// 		System.out.println(this.name+"");
// 		System.out.println(this.getEngine().getFuel());
// 		System.out.println(this.getEngine().getPerformance());
System.out.println(this.name+" car with "+this.getEngine().getFuel()+" engine gives "+this.getEngine().getPerformance()+" horsepower");
		
	}

}
