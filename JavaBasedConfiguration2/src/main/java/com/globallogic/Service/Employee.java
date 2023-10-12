package com.globallogic.Service;

public class Employee {
	Address address;
	

	public void setAddress(Address address) {
		this.address = address;
	}


	public void display()
	{
		System.out.println("this is employee");
		address.showAddress();
	}
	
}
