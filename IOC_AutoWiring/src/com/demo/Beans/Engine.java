package com.demo.Beans;

public class Engine {
	
	private String ModelYear;

	
	


	public String getModelYear() {
		return ModelYear;
	}


	public void setModelYear(String modelYear) {
		ModelYear = modelYear;
	}




	@Override
	public String toString() {
		return "Engine [ModelYear=" + ModelYear + "]";
	}



}
