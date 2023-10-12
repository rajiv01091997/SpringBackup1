package com.globallogic.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.globallogic.dao.EmployeeDao;
@Component
public class EmployeeService {

	@Autowired
	EmployeeDao employeeDao;
	
	public void printDetails()
	{
		employeeDao.showEmployeeDetails();
	}
}
