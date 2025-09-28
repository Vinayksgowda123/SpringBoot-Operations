package com.example.practice;

import java.sql.Connection;
import java.sql.DriverManager;


public class DBconnection {

	public static Connection getconnection() throws Exception
	{
	Class.forName("com.mysql.cj.jdbc.Driver");
	
	Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/springbootjdbc","root","vinay");
	
	return con;
	}
}
