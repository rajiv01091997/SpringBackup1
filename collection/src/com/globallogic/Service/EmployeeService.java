package com.globallogic.Service;

import com.globallogic.modal.Employee;
import java.util.*;
public class EmployeeService 
{
	public static void main(String[] args) {
Employee employee1=new Employee(123,"Niraj",22,"Network",90000);
Employee employee2=new Employee(124,"Rajiv",29,"frontend",76000);
Employee employee3=new Employee(125,"Amit",18,"Data",85000);
Employee employee4=new Employee(126,"Nihit",21,"Security",75000);
Employee employee5=new Employee(127,"Brijesh",19,"Backend",95000);

ArrayList<Employee> emp=new ArrayList<Employee>();
emp.add(employee1);
emp.add(employee2);
emp.add(employee3);
emp.add(employee4);
emp.add(employee4);

//System.out.println(emp);
System.out.println(emp.get(1));
	}

}
