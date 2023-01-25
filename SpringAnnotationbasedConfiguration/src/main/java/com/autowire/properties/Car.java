package com.autowire.properties;

import org.springframework.beans.factory.annotation.Autowired;

public class Car {
	//Autowired on properties
	@Autowired
	private Enginee enginee;

	public Car() {
		System.out.println("Car Constructor");
	}

	public Enginee getEnginee() {
		return enginee;
	}


	public void setEnginee(Enginee enginee) {
		this.enginee = enginee;
	}
	
	
}
