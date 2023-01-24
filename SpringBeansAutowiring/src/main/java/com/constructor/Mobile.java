package com.constructor;

class Sim{
	private String provider;

	public Sim(String provider) {
		this.provider = provider;
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
	
	public Mobile(String brand, Sim sim) {
		this.brand = brand;
		this.sim = sim;
	}
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

