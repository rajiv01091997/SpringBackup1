package com.globallogic.App;
import java.util.ArrayList;

import com.globallogic.Modal.*;
import com.globallogic.Service.EmployeeService;
public class Apllication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ArrayList<Employee> employee=new ArrayList<>();
Employee employee1=new Employee(1,"rajiv","dev",24,65000);
Employee employee2=new Employee(3,"john","tester",22,89000);
Employee employee3=new Employee(4,"shiv","dev",26,72000);
Employee employee4=new Employee(2,"andrew","hr",29,70000);
Employee employee5=new Employee(5,"snow","tester",35,67000);
employee.add(employee1);
employee.add(employee2);
employee.add(employee3);
employee.add(employee4);
employee.add(employee5);

EmployeeService empService=new EmployeeService();
empService.displayBasedOnDept(employee,"tester");
System.out.println(empService.countBasedOnDept(employee,"tester"));
System.out.println("============INCREMENTED SALARY==============");
empService.salaryIncrementBy10(employee);
System.out.println("============INCREMENTED ONLY DEVELOPERS SALARY==============");
empService.salaryIncrementDeveloperBy15(employee);
	}

}
