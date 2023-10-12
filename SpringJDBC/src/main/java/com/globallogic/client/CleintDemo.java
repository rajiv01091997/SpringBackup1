package com.globallogic.client;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import com.globallogic.dao.EmployeeDao;

public class CleintDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Resource resource =new ClassPathResource("objects.xml");

BeanFactory factory=new XmlBeanFactory(resource);

EmployeeDao employee=(EmployeeDao) factory.getBean("empDao");
 employee.insertData();

	}

}
