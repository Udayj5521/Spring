package com.configuration.bean.annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSaveHelloWorld {
	public static void main(String[] args) {

		ApplicationContext context = new AnnotationConfigApplicationContext(HelloWorldConfig.class);

		HelloWorld h = context.getBean(HelloWorld.class);
		h.setMessage("GoodMorning");
		System.out.println(h.getMessage());
	}

}
