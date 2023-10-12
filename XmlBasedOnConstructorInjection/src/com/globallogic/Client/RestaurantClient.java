package com.globallogic.Client;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import com.globallogic.service.Restaurant;
//this is like the runner class or container
//here codes are boiler plate 
public class RestaurantClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Resource resource=new ClassPathResource("objects.xml");
		
		//IOC
		BeanFactory factory=new XmlBeanFactory(resource);
		
		Restaurant restaurant=(Restaurant) factory.getBean("res");
		restaurant.showRestaurantDetails();
		
		
		
	}

}
