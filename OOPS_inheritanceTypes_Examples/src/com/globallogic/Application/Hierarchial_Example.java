package com.globallogic.Application;

import com.globallogic.vehicleType.Bike;
import com.globallogic.vehicleType.Car;
import com.globallogic.vehicleType.Truck;

public class Hierarchial_Example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Bike bike=new Bike("White","WB15X2001",20000);
      Car car=new Car("Green","DL10Y2002",50000);
      Truck truck=new Truck("Blue","UP60Z2003",70000);
      bike.setScootyOrMobike("Mobike");
      car.setCarType("SUV");
      truck.setNoOfWheels(14);
      System.out.println("________________________________________________________________________");
      bike.print();
      System.out.println("Two wheeler type:"+bike.getScootyOrMobike());
      System.out.print("Bike is ");
      bike.state();
      System.out.println("________________________________________________________________________");
      car.print();
      System.out.println("Car type:"+car.getCarType());
      System.out.print("car is");
      car.state();
      System.out.println("________________________________________________________________________");
      truck.print();
      System.out.println("No of wheels:"+truck.getNoOfWheels());
      System.out.print("Truck is ");
      truck.state();
      System.out.println("________________________________________________________________________");
      
      
      
	}

}
