package com.lazy;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSaveCar {
	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("CarBeans.xml");

		Car c = (Car) context.getBean("myCar");

		System.out.println("Brand: " + c.getBrand());
		System.out.println("Color: " + c.getColor());
		System.out.println("Cost: " + c.getCost());

	}

}
