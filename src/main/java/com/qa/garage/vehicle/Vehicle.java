package com.qa.garage.vehicle;

public abstract class Vehicle {

	public static int count = 0;

	private int numWheels;

	private String colour;

	final private int id;

	public Vehicle(int numWheels, String colour) {
		super();
		this.id = count;
		count++;
		this.numWheels = numWheels;
		this.colour = colour;
	}

	public abstract int calcBill();

	public int getId() {
		return this.id;
	}

	public int getNumWheels() {
		return this.numWheels;
	}

	public void setNumWheels(int numWheels) {
		this.numWheels = numWheels;
	}

	public String getColour() {
		return this.colour;
	}

	public void setColour(String colour) {
		this.colour = colour;
	}

	@Override
	public String toString() {
		return "Vehicle [ID " + this.id + ", numWheels=" + this.numWheels + ", colour=" + this.colour + "]";
	}

}
