package com.autowire.setter;

import org.springframework.beans.factory.annotation.Autowired;

public class Car {
	private Enginee enginee;

	public Car() {
		System.out.println("Car Constructor");
	}

	public Enginee getEnginee() {
		return enginee;
	}
//Autowired on Setter Methods
	@Autowired
	public void setEnginee(Enginee enginee) {
		this.enginee = enginee;
	}
	
	
}
