package com.globallogic.dao;

import org.springframework.jdbc.core.JdbcTemplate;

public class EmployeeDao {
	 JdbcTemplate jdbcTemplate;

	public EmployeeDao(JdbcTemplate jdbcTemplate) {
		super();
		this.jdbcTemplate = jdbcTemplate;
	}
	
	public void insertData()
	{
		jdbcTemplate.execute("insert into Details values(16,'jaman',150000,29,'cric')");
		System.out.println("inserted");
	}

}
