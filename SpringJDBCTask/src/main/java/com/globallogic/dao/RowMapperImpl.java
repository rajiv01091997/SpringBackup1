package com.globallogic.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import com.globallogic.Modal.Book;

public class RowMapperImpl implements org.springframework.jdbc.core.RowMapper<Book> {

	@Override
	public Book mapRow(ResultSet rs, int rowNum) throws SQLException {
		// TODO Auto-generated method stub
		Book book=new Book(rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getFloat(5));
		return book;
	}

}
