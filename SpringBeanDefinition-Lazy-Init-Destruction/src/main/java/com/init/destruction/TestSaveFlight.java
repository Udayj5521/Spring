package com.init.destruction;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSaveFlight {
	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("FlightBeans.xml");

		Flight f = (Flight) context.getBean("myFlight");
	}

}
