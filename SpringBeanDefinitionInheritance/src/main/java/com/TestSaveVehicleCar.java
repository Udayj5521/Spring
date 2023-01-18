package com;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSaveVehicleCar {
	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("VehicleCarBeans.xml");

		Vehicle v = (Vehicle) context.getBean("myVehicle");
		System.out.println("Vehicle Color: " + v.getColor());

		Car c = (Car) context.getBean("myCar");
		System.out.println("Car Color: " + c.getColor());
		System.out.println("Car Brand: " + c.getBrand());

	}

}
