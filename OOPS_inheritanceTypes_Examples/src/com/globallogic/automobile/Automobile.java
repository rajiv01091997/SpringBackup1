package com.globallogic.automobile;

public class Automobile {
    private String color;
    private String registrationNumber;
    private int kiloMetersTravelled;
	public Automobile(String color, String registrationNumber, int kiloMetersTravelled) {
		super();
		this.color = color;
		this.registrationNumber = registrationNumber;
		this.kiloMetersTravelled = kiloMetersTravelled;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getRegistrationNumber() {
		return registrationNumber;
	}
	public void setRegistrationNumber(String registrationNumber) {
		this.registrationNumber = registrationNumber;
	}
	public int getKiloMetersTravelled() {
		return kiloMetersTravelled;
	}
	public void setKiloMetersTravelled(int kiloMetersTravelled) {
		this.kiloMetersTravelled = kiloMetersTravelled;
	}
    
    public void state()
    {
    	if(kiloMetersTravelled<=20000)
    		System.out.println("new");
    	else if(kiloMetersTravelled>20000 && kiloMetersTravelled<=50000)
    		System.out.println(" in good condition");
    	else
    		System.out.println("old");
    }
    public void print()
    {
    	System.out.println("color:"+this.color+"\n"+"Registration number:"+this.registrationNumber+"\n"+"Kilometers travelled:"+this.kiloMetersTravelled);
    }
                                                       
}  
 