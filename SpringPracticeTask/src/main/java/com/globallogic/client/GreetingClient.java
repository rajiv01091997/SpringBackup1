package com.globallogic.client;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.globallogic.Service.GreeterService;
import com.globallogic.dao.MorningGreeting;

public class GreetingClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AnnotationConfigApplicationContext context= new AnnotationConfigApplicationContext();
		context.scan("com.globallogic");
		context.refresh();
		
		GreeterService gs=(GreeterService) context.getBean("greeterService");
		
		gs.printGreeting();
		MorningGreeting mg=new MorningGreeting();
		mg.setGreeting("hihiih");
		System.out.println(mg.greet());
		

	}

}
