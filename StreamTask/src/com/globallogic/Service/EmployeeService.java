package com.globallogic.Service;

import java.util.ArrayList;
import java.util.stream.Collector;

import com.globallogic.Modal.Employee;

public class EmployeeService {

	
	public void displayBasedOnDept(ArrayList<Employee> emp,String dept)
	{
		emp.stream().filter(e->e.getDept().equals(dept)).forEach(System.out::println);
	}
	
	
	public long countBasedOnDept(ArrayList<Employee> emp,String dept)
	{
		long count=emp.stream().filter(e->e.getDept().equals(dept)).count();
		return count;
	}
	
	public void salaryIncrementBy10(ArrayList<Employee> emp)
	{
		emp.stream().map(e->e.getName()+" "+(e.getSalary()*0.1+e.getSalary())).forEach(System.out::println);
		//emp.stream().map(e->e.getName()+" "+(e.getSalary()*0.1+e.getSalary())).collect(Collector<T, A, R>)
	}
	public void salaryIncrementDeveloperBy15(ArrayList<Employee> emp)
	{
		emp.stream().filter(e->e.getDept().equals("dev")).map(e->e.getName()+" "+(e.getSalary()*0.15+e.getSalary())).forEach(System.out::println);
		//emp.stream().map(e->e.getName()+" "+(e.getSalary()*0.1+e.getSalary())).collect(Collector<T, A, R>)
	}
	
}
