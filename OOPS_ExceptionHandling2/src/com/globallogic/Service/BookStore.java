package com.globallogic.Service;

import java.util.ArrayList;
import java.util.Iterator;

import com.globallogic.Modal.Book;

public class BookStore {
ArrayList<Book> book=new ArrayList<>();

public void addBook(Book b)
{
	book.add(b);
}
public void searchByTitle(String title)
{
	for(Book a:book)
	{
		if(a.getTitle().equals(title))
		{
			System.out.println(a);
			return;
		}
	}
	System.out.println("Title not found");
	
}
public void searchByAuthor(String author)
{
	
	for(Book a:book)
	{
		if(a.getAuthor().equals(author))
		{
			System.out.println(a);
			return;
			
		}
	}
	System.out.println("Author not found");
	
}
public void displayAll()
{
	System.out.println(book.toString());
}

}
