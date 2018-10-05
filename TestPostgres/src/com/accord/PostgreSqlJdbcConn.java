package com.accord;

import java.sql.Connection;
import java.sql.DriverManager;

public class PostgreSqlJdbcConn {
	@SuppressWarnings("unused")	
	public static void main(String[] args) {	      
 			Connection c = null;	      
 			try {	         
 				Class.forName("org.postgresql.Driver");	         
 				c = DriverManager.getConnection("jdbc:postgresql://192.168.149.10:5432/postgres","postgres", "postgres");	      
 			} catch (Exception e) {	         
 				e.printStackTrace();	         
 				System.err.println(e.getClass().getName()+": "+e.getMessage());	         
 				System.exit(0);	      
 		}	      
 			System.out.println("Opened database successfully");	   
 	}
}
