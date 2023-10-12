package com.globallogic.client;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.globallogic.Service.InterestCalculator;

public class BankClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext();

context.scan("com.globallogic");
context.refresh();

InterestCalculator calculator=(InterestCalculator) context.getBean("interestCalculator");
calculator.display();

	}

}
