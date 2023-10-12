package com.globallogic.service;

public class Restaurant {

Tea tea;


public Restaurant(Tea tea) {
	super();
	this.tea = tea;
}


public Restaurant() {
	super();
	// TODO Auto-generated constructor stub
	System.out.println("Welcome");
}


public void showRestaurantDetails(String restaurantName)
{
	System.out.println("restaurant name:"+restaurantName);
	tea.teaPrice();
}
}
//Constructor with highest argument will be called in case of Autowiring by constructor,if there are multiple constructors