package com.globallogic.Confguration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.globallogic.Service.Employee;

@Configuration
public class AppConfig {
      @Bean(name="e1")
	public Employee getEmployee()
	{
		return new Employee();
	}
}
