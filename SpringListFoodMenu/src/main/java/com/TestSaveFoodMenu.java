package com;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSaveFoodMenu {
	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("FoodBeans.xml");

		FoodMenu f = (FoodMenu) context.getBean("myFood");

		System.out.println("Food Items: " + f.getItems());
		System.out.println("Food Type: " + f.getType());
		System.out.println("Food Cost: " + f.getCost());

		System.out.println("--------------------------------");

		System.out.println(	f.getType().get(0) + " Item is " + f.getItems().get(0) + " Cost is " + f.getCost().get(1) + "Rs");
		System.out.println(	f.getType().get(0) + " Item is " + f.getItems().get(1) + " Cost is " + f.getCost().get(0) + "Rs");
	}

}
