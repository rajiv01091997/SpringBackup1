package com.globallogic.client;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.globallogic.Config.AppConfig;
import com.globallogic.Exceptions.InvalidBookException;
import com.globallogic.Modal.Book;
import com.globallogic.Service.BookService;



public class BookClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

ApplicationContext context=new AnnotationConfigApplicationContext(AppConfig.class);


BookService bookservice=(BookService) context.getBean("e1");
try {
Book book=new Book("B402","Believe","Suresh raina","others",600);
bookservice.setBook(book);
bookservice.insertBook();
}
catch(InvalidBookException e)
{
System.out.println(e.getMsg());
}
System.out.println("================================================================");
bookservice.fetchBasedOnID("B301");
System.out.println("================================================================");
bookservice.displayAll();
	}

}
