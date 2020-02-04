package com.demo.Beans;

public class Engine {
	
	private String ModelYear;

	
	
	
	public Engine(String modelYear) {
		super();
		ModelYear = modelYear;
	}


	@Override
	public String toString() {
		return "Engine [ModelYear=" + ModelYear + "]";
	}



}
