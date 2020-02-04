package com.DI.Beans;

public class Car {

	private String[] Carname;
	private Engine[] Engine;

	public String[] getCarname() {
		return Carname;
	}

	public void setCarname(String[] carname) {
		Carname = carname;
	}

	public Engine[] getEngine() {
		return Engine;
	}

	public void setEngine(Engine[] engine) {
		this.Engine = engine;
	}

	public void Display() {

		for (String car : Carname) {

			System.out.println(car);
		}
		for(com.DI.Beans.Engine eng :Engine)
		{
			
			System.out.println(eng);
		}
	}

}
