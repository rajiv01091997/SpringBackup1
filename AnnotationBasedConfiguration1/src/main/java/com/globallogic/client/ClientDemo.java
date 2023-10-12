package com.globallogic.client;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.globallogic.Service.EmployeeService;

public class ClientDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext();
context.scan("com.globallogic");
context.refresh();

EmployeeService empService=(EmployeeService) context.getBean("employeeService");
empService.printDetails();

	}

}
