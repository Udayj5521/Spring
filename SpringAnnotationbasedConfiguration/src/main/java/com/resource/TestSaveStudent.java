package com.resource;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSaveStudent {
	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("StudentBeans.xml");

		Student s = (Student) context.getBean("myStudent");
		System.out.println("Name: "+s.getName());
		System.out.println("Age: "+s.getAge());

	}

}
