package com.globallogic.jdbc;
import java.sql.*;
//import java.sql.DriverManager;
//import java.sql.Connection;
public class JDBCconnection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
           try {
	            //step1:load the driver for respective database(mysql/oracle etc)
	           
        	   Class.forName("com.mysql.cj.jdbc.Driver");
        	   System.out.println("Class found");
        	   //Step2:Estabish the connection:
        	   
        	   Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/Employee","root","Jaibholeki1@");
        	   System.out.println("connected");
        	   
        	   // Step3:prepare sql statement
        	   Statement statement=connection.createStatement();
        	   //execute()method returns boolean and used for insertion etc.
        //statement.execute("insert into Details values(1233,'Sughriv',200,9999999,'hr')");
        	   //if want to retrieve we need to use executeQuery() method which returns in the form of ResultSet
        	  ResultSet rs= statement.executeQuery("select * from Details");
        	  //after fetching in ResultSet variable we can print in the following way since resulset is a type of cursor which 
        	  //is before the first row initially and next() function return true or false based on presence of next row
        	  while(rs.next())
        	  {
        		  System.out.println(rs.getInt(1)+"  "+rs.getString(2)+"  "+rs.getInt(3)+"  "+rs.getInt(4)+"  "+rs.getString(5));
        	  }
        	  
             connection.close();
        	   
               }
           catch(Exception e)
           {
        	   e.printStackTrace();
           }
	}

}
