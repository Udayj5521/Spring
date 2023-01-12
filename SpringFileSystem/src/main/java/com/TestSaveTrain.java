package com;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class TestSaveTrain {
	public static void main(String[] args) {

//		Train t = new Train();
//		t.setTrainId(101);
//		t.setSeatNo("A1");
//		t.setCost(70.00);
//
//		System.out.println(t.getTrainId());
//		System.out.println(t.getSeatNo());
//		System.out.println(t.getCost());

		ApplicationContext context = new FileSystemXmlApplicationContext("C:/Users/udayj/Music/Beans.xml");

		Train t = (Train) context.getBean("myTrain");

		System.out.println("TrainId: " + t.getTrainId());
		System.out.println("Cost: " + t.getCost());
		System.out.println("SeatNo: " + t.getSeatNo());

	}

}
