package com.globallogic.utility;

import com.globallogic.Exceptions.InvalidBookException;
import com.globallogic.Modal.Book;
import com.globallogic.Service.BookStore;

public class BookUtil {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	BookStore bookstore=new BookStore();
	try {
    Book book1=new Book("B123","The 4-hour Work week","Timothy Ferris","others",400);
	Book book2=new Book("B201","Road not taken","Robert frost","fiction",388);
    Book book3=new Book("B301","Java-complete reference","Herbert Schildt","science",700);
    bookstore.addBook(book1);
    bookstore.addBook(book2);
    bookstore.addBook(book3);
	}
	catch(InvalidBookException e)
	{   System.out.println("!!!!!!!!!!!!!!EXCEPTION DETAILS....Please fix as per below details");
		System.out.println(e.getMsg());
	}
    
    
    System.out.println("================Searching By Title===============");
    bookstore.searchByTitle("Road not taken");
    System.out.println("================Searching By Author===============");
    bookstore.searchByAuthor("Herbert Schildt");
    System.out.println("================Displaying All===============");
    bookstore.displayAll();
    
    
	}

}
