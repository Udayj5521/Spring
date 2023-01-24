package com;

class Sim{
	private String provider;
	
	public Sim() {
		System.out.println("Sim Constructor");
	}

	public String getProvider() {
		return provider;
	}

	public void setProvider(String provider) {
		this.provider = provider;
	}
}

public class Mobile {
	private String brand;
	private Sim sim;
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public Sim getSim() {
		return sim;
	}
	public void setSim(Sim sim) {
		this.sim = sim;
	}
	
}

