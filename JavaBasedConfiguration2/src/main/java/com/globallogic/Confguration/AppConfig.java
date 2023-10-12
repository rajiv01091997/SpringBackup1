package com.globallogic.Confguration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.globallogic.Service.Address;
import com.globallogic.Service.Employee;

@Configuration
public class AppConfig {
      @Bean(name="e1")
	public Employee getEmployee()
	{ 
		Employee emp=new Employee();
		emp.setAddress(getAddress());
		return emp;
	}
      @Bean(name="a1")
     public Address getAddress()
     {
    	 
    	 
		//return new Address();
    	 
    	 Address address=new Address();
    	 
    	 return address;
     }
}
