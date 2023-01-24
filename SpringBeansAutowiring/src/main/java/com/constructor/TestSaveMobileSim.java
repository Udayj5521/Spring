package com.constructor;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSaveMobileSim {
	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("MobileConstructorBeans.xml");

		Mobile m = (Mobile) context.getBean("myMobile");
		System.out.println("Mobile Brand: "+m.getBrand());
		System.out.println("Sim Provider "+m.getSim().getProvider());
	}
}
