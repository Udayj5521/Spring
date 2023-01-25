package com;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSaveStudentAddress {
	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
		
		Student s = (Student) context.getBean("myStudent");
	
	System.out.println("Name: "+s.getName());
	System.out.println("City: "+s.getAddress().getCity());
	System.out.println("State :"+s.getAddress().getState());
		
	}

}
