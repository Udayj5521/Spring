package com.constuctor;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

class Enginee {
	String model;
	String cc;

	public Enginee(String model, String cc) {
		super();
		this.model = model;
		this.cc = cc;
	}
}

public class Car {
	String brand;
	Enginee e;

	public Car(String brand, Enginee e) {
		super();
		this.brand = brand;
		this.e = e;
	}

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("CarBeans.xml");

		Car c = (Car) context.getBean("myCar");

		System.out.println("Brand: " + c.brand);
		System.out.println("Model: " + c.e.model);
		System.out.println("CC: " + c.e.cc);
	}

}
