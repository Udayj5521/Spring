package com;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainClass {
	public static void main(String[] args) {

//		HelloWorld h = new HelloWorld();
//		h.setMessage("Good Morning");
//
//		System.out.println(h.getMessage());

		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");

		HelloWorld h = (HelloWorld) context.getBean("myHello");
		System.out.println(h.getMessage());
	}

}
