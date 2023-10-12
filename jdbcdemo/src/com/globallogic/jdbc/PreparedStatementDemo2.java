package com.globallogic.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

public class PreparedStatementDemo2 {

	
		public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
			int id=sc.nextInt();
			// TODO Auto-generated method stub
	           try {
		            //step1:load the driver for respective database(mysql/oracle etc)
		           
	        	   Class.forName("com.mysql.cj.jdbc.Driver");
	        	   System.out.println("Class found");
	        	   //Step2:Establish the connection:
	        	   
	        	   Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/Employee","root","Jaibholeki1@");
	        	   System.out.println("connected");
	        	   
	        	   // Step3:prepare sql statement
	        	   PreparedStatement ps=connection.prepareStatement("select * from Details where id=?");
	        	  ps.setInt(1, id);
	        	  //PreparedStatement ps=connection.prepareStatement("select * from Details where id=10");
	        	 ResultSet rs= ps.executeQuery();
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
