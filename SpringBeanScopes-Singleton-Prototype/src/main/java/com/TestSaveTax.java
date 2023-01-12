package com;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSaveTax {
	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("TaxBeans.xml");

		Tax t1 = (Tax) context.getBean("myTax");
		t1.setAccountHolder("Ashok");
		System.out.println("T1: " + t1.getAccountHolder());

		Tax t2 = (Tax) context.getBean("myTax");
		System.out.println("T2: " + t2.getAccountHolder());

		Tax t3 = (Tax) context.getBean("myTax");
		System.out.println("T3: " + t3.getAccountHolder());
	}

}
