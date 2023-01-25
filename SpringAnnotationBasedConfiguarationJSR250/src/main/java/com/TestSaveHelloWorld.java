package com;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSaveHelloWorld {
	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
		
		HelloWorld h = (HelloWorld) context.getBean("myHelloWorld");
		System.out.println("Message: "+h.getMessage());
		
	}

}
