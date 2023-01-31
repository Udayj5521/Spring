package com.autowired;

import org.springframework.beans.factory.annotation.Autowired;

public class Car {
	// Autowired on Properties
//	@Autowired
	private Enginee enginee;

//	Autowired on Constructor
	@Autowired
	public Car() {
		System.out.println("Car Constructor");
	}

	public Enginee getEnginee() {
		return enginee;
	}

//Autowired on Setter methods
//	@Autowired
	public void setEnginee(Enginee enginee) {
		this.enginee = enginee;
	}

}
