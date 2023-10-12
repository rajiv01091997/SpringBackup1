package com.globallogic.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

//Dynamic insertion using prepared stament

class PreparedStatementDemo {

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
        	   PreparedStatement ps=connection.prepareStatement("insert into Details values(?,?,?,?,?)");
        	   /*
        	    * We can take each thing as input and put that varible into SetInt or SetString...methods to insert from user input
        	    * line(24-35) insertion example from scanner
        	    */
        	   ps.setInt(1,10);
        	   ps.setString(2, "Nikhil");
        	   ps.setInt(3, 50);
        	   ps.setInt(4, 16000);
        	   ps.setString(5, "builder");
        	   
        	   ps.execute();
        	 
               }
           catch(Exception e)
           {
        	   e.printStackTrace();
           }
	}

}
