package com.globallogic.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class EmployeeDao {

	
	public void showEmployeeDetails()
	{
		System.out.println("Fetching Details from Database");
		System.out.println("The value is 100");
	}
	
}
