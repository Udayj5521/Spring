package com.autowired;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSaveCarEnginee {
	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("Car.xml");
		
		Car c = (Car) context.getBean("myCar");
	} 

}
