package com.example.configServer;

public class Seat {
	private double price;
	private boolean taken;
	public Seat(double price, boolean taken) {
		super();
		this.price = price;
		this.taken = taken;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public boolean isTaken() {
		return taken;
	}
	public void setTaken(boolean taken) {
		this.taken = taken;
	}
	
}
