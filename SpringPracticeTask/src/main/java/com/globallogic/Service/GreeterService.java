package com.globallogic.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

import com.globallogic.dao.Greeting;
import com.globallogic.dao.MorningGreeting;

@Component("greeterService")
public class GreeterService {
	
	//@Qualifier("goodDayGreeting")
    @Autowired
	Greeting greeting;
	
//	@Qualifier("morningGreeting")
//	@Autowired
//	Greeting greeting1;
	
	public void printGreeting()
	{
		
		System.out.println(greeting.greet());
		
	}
}
