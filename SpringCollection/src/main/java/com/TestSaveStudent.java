package com;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSaveStudent {
	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("StudentBeans.xml");

		Student s = (Student) context.getBean("myStudent");
		System.out.println("Set Elements - ID: " + s.getId());
		System.out.println("List Elements - Name: " + s.getName());
		System.out.println("Properties Elements - Marks: " + s.getMarks());
		System.out.println("Map Elements  - Address: " + s.getAddress());

	}

}
