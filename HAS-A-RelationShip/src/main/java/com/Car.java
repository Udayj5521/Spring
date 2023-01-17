package com;

class Enginee{
	String model;
	String cc;
	
	public Enginee(String model, String cc) {
		super();
		this.model = model;
		this.cc = cc;
	}
}

public class Car {
	String brand;
	Enginee e;
	
	public void display(String brand, Enginee e){
		System.out.println("Brand: "+brand);
		System.out.println("Model: "+e.model+" CC: "+e.cc);
	}
	
	public static void main(String[] args) {
		Car c = new Car();
		Enginee e = new Enginee("2023", "200");
		c.display("BMW", e);
		
	}
	

}
