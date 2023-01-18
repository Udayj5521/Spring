package com;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainClass {
	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("AddressBeans.xml");

		Address a = (Address) context.getBean("myAddress");

		System.out.println("Set Elements: " + a.getAddressSet());

	}

}
