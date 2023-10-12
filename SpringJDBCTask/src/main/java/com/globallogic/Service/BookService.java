package com.globallogic.Service;

import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import com.globallogic.Modal.Book;
import com.globallogic.dao.RowMapperImpl;

public class BookService {
	JdbcTemplate jdbcTemplate;
	Book book;
	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}
	public void setBook(Book book) {
		this.book = book;
	}

	public void insertBook()
	{
		int k=jdbcTemplate.update("insert into Books values(?,?,?,?,?)",book.getBookId(),book.getTitle(),book.getAuthor(),book.getCategory(),book.getPrice());
		System.out.println("inserted "+k+" record succesfully");
	}
	public void fetchBasedOnID(String id)
	{  RowMapperImpl rowMapper=new RowMapperImpl();
		String query="select * from Books where bookId=?";
	   Book bk=jdbcTemplate.queryForObject(query,rowMapper,id);
	   System.out.println(bk);
	}
	public void displayAll()
	{
		RowMapperImpl rowMapper=new RowMapperImpl();
		String query="select * from Books";
		List<Book> list=jdbcTemplate.query(query, rowMapper);
		for(Book bk:list)
		{
			System.out.println(bk);
		}
	}
	
}