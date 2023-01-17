package com;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSaveMobileSim {
	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("MobileBeans.xml");

		Mobile m = (Mobile) context.getBean("myMobile");

		System.out.println("MobileBrand: " + m.getBrand());
		System.out.println("SimNetwork: " + m.getSim().getNetwork());
	}

}
