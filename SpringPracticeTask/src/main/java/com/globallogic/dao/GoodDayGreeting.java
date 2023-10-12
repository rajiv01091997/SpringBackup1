package com.globallogic.dao;

import javax.naming.Name;

import org.springframework.stereotype.Component;

//@Component("goodDayGreeting")
public class GoodDayGreeting implements Greeting {

	private String greeting="evening";

	

	public String getGreeting() {
		return greeting;
	}

	public void setGreeting(String greeting) {
		this.greeting = greeting;
	}

	@Override
	public String greet() {
		// TODO Auto-generated method stub
		return greeting;
	}
	
}
