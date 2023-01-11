package com;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class TestSaveStudent {
	public static void main(String[] args) {

		
//		XmlBeanFactory x = new XmlBeanFactory(new ClassPathResource("beans.xml"));
		
		Resource r = new ClassPathResource("beans.xml");
		BeanFactory x = new XmlBeanFactory(r);
		
		Student s = (Student) x.getBean("myStudent");
		
		System.out.println("Id: "+s.getId());
		System.out.println("Name: "+s.getName());
		System.out.println("Email: "+s.getEmail());
	}
}
