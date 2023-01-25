package com.autowire.constructor;

import org.springframework.beans.factory.annotation.Autowired;

public class Car {

	private Enginee enginee;

//Autowired on Constructor
	@Autowired
	public Car(Enginee enginee) {
		System.out.println("Inside Car Constructor");
		this.enginee = enginee;
	}

}
