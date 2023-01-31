package com.qualifier;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSaveProfileStudent {
	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("ProfileBeans.xml");

		Profile p = (Profile) context.getBean("myProfile");
		System.out.println("Age: " + p.getStudent().getAge());
		System.out.println("Name: " + p.getStudent().getName());

	}

}
