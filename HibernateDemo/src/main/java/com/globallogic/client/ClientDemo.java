package com.globallogic.client;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.globallogic.entity.Product;


public class ClientDemo {

	public static void main(String[] args){
		// TODO Auto-generated method
		Configuration configuration=new Configuration();
		configuration.configure("hibernate.cfg.xml");
		
		SessionFactory sessionFactory=configuration.buildSessionFactory();
		Session session= sessionFactory.openSession();
		
		Transaction transaction=session.beginTransaction();
		
		Product product=new Product();
		product.setProductId(2);
		product.setName("Mobile");
		product.setCategory("electronics");
		product.setPrice(27000);
		
		session.save(product);
		System.out.println("inserted");
		transaction.commit();
		
		session.close();
		sessionFactory.close();
		
		
		
	}

}
