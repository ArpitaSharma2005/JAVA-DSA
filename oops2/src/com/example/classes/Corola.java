package com.example.classes;

import com.example.intf.Car;

public class Corola implements Car {

	private Engine engine;  // Yeh field add karo

	public String getCar() {
		return "Toyota from Corola with engine type as: " + engine.type;
	}

	public Engine getEngine() {
		return engine;
	}

	public void setEngine(Engine engine) {
		this.engine = engine;
	}
}
