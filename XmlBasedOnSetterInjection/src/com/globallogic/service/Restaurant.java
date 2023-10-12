package com.globallogic.service;

public class Restaurant {
String restaurantName;
Tea tea;

public void setRestaurantName(String restaurantName) {
	this.restaurantName = restaurantName;
}

public void setTea(Tea tea) {
	this.tea = tea;
}

public void showRestaurantDetails()
{
	System.out.println("restaurant name:"+restaurantName);
	tea.teaPrice();
}
}
