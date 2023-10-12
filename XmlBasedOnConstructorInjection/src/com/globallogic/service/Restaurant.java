package com.globallogic.service;

public class Restaurant {
String restaurantName;
Tea tea;



public Restaurant(String restaurantName, Tea tea) {
	super();
	this.restaurantName = restaurantName;
	this.tea = tea;
}



public void showRestaurantDetails()
{
	System.out.println("restaurant name:"+restaurantName);
	tea.teaPrice();
}
}
