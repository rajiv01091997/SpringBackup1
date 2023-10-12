package com.globallogic.vehicleType;

import com.globallogic.automobile.Automobile;

public class Truck extends Automobile{
	private int noOfWheels;//Truck can be 8 wheeler or 14 wheeler etc

	
	public Truck(String color, String registrationNumber, int kiloMetersTravelled) {
		super(color, registrationNumber, kiloMetersTravelled);
	}

	public int getNoOfWheels() {
		return noOfWheels;
	}

	public void setNoOfWheels(int noOfWheels) {
		this.noOfWheels = noOfWheels;
	}
	
}
