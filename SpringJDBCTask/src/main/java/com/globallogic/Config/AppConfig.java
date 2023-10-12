package com.globallogic.Config;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import com.globallogic.Modal.Book;
import com.globallogic.Service.BookService;


@Configuration
public class AppConfig {

	
	  @Bean
	   public DataSource dataSource() 
	  {
	    DriverManagerDataSource dataSource = new DriverManagerDataSource();
	    //MySQL database we are using
	    dataSource.setDriverClassName("com.mysql.cj.jdbc.Driver");
	    dataSource.setUrl("jdbc:mysql://localhost:3306/Employee");//change url
	    dataSource.setUsername("root");//change userid
	    dataSource.setPassword("Jaibholeki1@");//change pwd
	    
	    return dataSource;
	    
	  }  
	  
	  @Bean
	  public JdbcTemplate jdbcTemplate() {
	    JdbcTemplate jdbcTemplate = new JdbcTemplate();
	    jdbcTemplate.setDataSource(dataSource());
	    return jdbcTemplate;
	  }
	   

	  @Bean(name="e1")
	  public BookService bookService()
	  {
		  BookService bk=new BookService();
		  bk.setJdbcTemplate(jdbcTemplate());
		  return bk;
	  }
	  
	  
	  
}