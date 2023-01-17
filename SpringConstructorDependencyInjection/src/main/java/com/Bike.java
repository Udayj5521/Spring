package com;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Bike {
	private String brand;
	private String color;
	private double cost;

	public Bike(String brand, String color, double cost) {
		super();
		this.brand = brand;
		this.color = color;
		this.cost = cost;
	}

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("BikeBeans.xml");

		Bike b = (Bike) context.getBean("myBike");
		System.out.println("Brand: " + b.brand);
		System.out.println("Color: " + b.color);
		System.out.println("Cost: " + b.cost);

	}

}
