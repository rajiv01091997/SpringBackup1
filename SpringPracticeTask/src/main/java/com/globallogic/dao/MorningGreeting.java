package com.globallogic.dao;

import org.springframework.stereotype.Component;

@Component("morningGreeting")
public class MorningGreeting implements Greeting {
	
	private String greeting="hello";

	@Override
	public String greet() {
		
		return greeting;
	}

	

	public String getGreeting() {
		return greeting;
	}

	public void setGreeting(String greeting) {
		this.greeting = greeting;
	}
	
	

}
