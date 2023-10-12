package com.globallogic.vehicleType;

import com.globallogic.automobile.Automobile;

public class Bike extends Automobile{
	
	private String scootyOrMobike;
	
	
	public Bike(String color, String registrationNumber, int kiloMetersTravelled) {
		super(color, registrationNumber, kiloMetersTravelled);
		// TODO Auto-generated constructor stub
	}


	public String getScootyOrMobike() {
		return scootyOrMobike;
	}


	public void setScootyOrMobike(String scootyOrMobike) {
		this.scootyOrMobike = scootyOrMobike;
	}

	
	
	
	

}
