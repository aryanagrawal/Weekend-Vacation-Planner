package com.maven.test;

import java.sql.*;
import java.io.*;
import java.util.*;
import java.time.*;


/*
 * The function of this class JDBC is to interact with
 * the database and make potential changes to it.
 * 
 * All the changes made to the database will be done through
 * this interface.
 * 
 */
public class JDBC implements Serializable{
	// JDBC driver name and database URL
		static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
		static final String DB_URL = "jdbc:mysql://localhost:3306/Searches";

		// Database credentials
		static final String USER = "root";
		static final String PASS = "370bc@AA#cgm";
		
		static Connection conn = null;
		
//		public static void main(String[] args){
		public JDBC(){
			try {
				Class.forName(JDBC_DRIVER);
				conn = DriverManager.getConnection(DB_URL, USER, PASS);
			} catch (Exception e) {
				e.printStackTrace();
			}
			
//			System.out.println("Yeah I'm running bitch!");
		}
		
		public boolean addFlights(Object[] details){
			try{
				Statement stmt = conn.createStatement();
				String query = "INSERT INTO Flights values (v1, v2, v3, v4, v5, v6, v7, v8, v9)";
				stmt.executeUpdate(query);
			} catch (Exception e){
				return false;
			}
			
			return true;
		}
		

}
