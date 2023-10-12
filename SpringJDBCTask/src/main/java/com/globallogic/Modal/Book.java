package com.globallogic.Modal;

import com.globallogic.Exceptions.InvalidBookException;

public class Book 
{
@Override
	public String toString() {
		return "Book [bookId=" + bookId + ", title=" + title + ", author=" + author + ", category=" + category
				+ ", price=" + price + "]";
	}

private String bookId;
private String title;
private String author;
private String category;
private float price;

public Book(String bookId, String title, String author, String category, float price) {
	super();
	this.bookId = bookId;
	this.title = title;
	this.author = author;
	this.category = category;
	this.price = price;
	validation();
}

public String getBookId() {
	return bookId;
}

public void setBookId(String bookId) {
	this.bookId = bookId;
}

public String getTitle() {
	return title;
}

public void setTitle(String title) {
	this.title = title;
}

public String getAuthor() {
	return author;
}

public void setAuthor(String author) {
	this.author = author;
}

public String getCategory() {
	return category;
}

public void setCategory(String category) {
	this.category = category;
}

public float getPrice() {
	return price;
}

public void setPrice(float price) {
	this.price = price;
}

public void validation()
{
	if(!this.category.equals("science")&&!this.category.equals("fiction")&&!this.category.equals("technology")&&!this.category.equals("others"))
	{
		throw new InvalidBookException("Category must be Science,Fiction,Technoloy or others");
	}
	if(this.price<0)
	{
		throw new InvalidBookException("Price cannot be Negative");	
	}
	if(!this.bookId.startsWith("B")||this.bookId.length()<4)
	{
		throw new InvalidBookException("bookId must start with 'B' and length should be minimum 4");	
	}
}
	
}
