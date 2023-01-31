package com.required;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSaveEmployee {
	public static void main(String[] args) {
		
		
		ApplicationContext context = new ClassPathXmlApplicationContext("StudentBeans.xml");
		
		Employee e = (Employee) context.getBean("myEmployee");
		
		System.out.println("Name: "+e.getName());
		System.out.println("Age: "+e.getAge());
		
	}

}
