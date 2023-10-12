package com.globallogic.vehicleType;

import com.globallogic.automobile.Automobile;

public class Car extends Automobile {
 private String carType;//Sedan or SUV or compact etc

public Car(String color, String registrationNumber, int kiloMetersTravelled) {
	super(color, registrationNumber, kiloMetersTravelled);
	
}

public String getCarType() {
	return carType;
}

public void setCarType(String carType) {
	this.carType = carType;
}
 
 

}
