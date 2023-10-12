package com.globallogic.service;

public class Restaurant {

Tea tea;


public void setTea(Tea tea) {
	this.tea = tea;
}


public void showRestaurantDetails(String restaurantName)
{
	System.out.println("restaurant name:"+restaurantName);
	tea.teaPrice();
}
}
//Autowire byName uses setter to inject so you need to have setters for the variable you want to get injected like here tea.