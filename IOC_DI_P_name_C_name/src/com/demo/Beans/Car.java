package com.demo.Beans;

public class Car {
	private String carname;
	private Engine engine;

	public String getCarname() {
		return carname;
	}

	public void setCarname(String carname) {
		this.carname = carname;
	}

	public Engine getEngine() {
		return engine;
	}

	public void setEngine(Engine engine) {
		this.engine = engine;
	}

	public void display() {

		System.out.println(carname + " " + engine);

	}

}
