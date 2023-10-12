package com.globallogic.client;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.globallogic.Confguration.AppConfig;
import com.globallogic.Service.Employee;

public class ClientDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ApplicationContext context=new AnnotationConfigApplicationContext(AppConfig.class);


Employee employee=(Employee) context.getBean("e1");
employee.display();

	}

}
