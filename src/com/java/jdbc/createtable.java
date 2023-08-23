package com.java.jdbc;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class createtable {


	public static void main(String[] args) {
		
		GetConnection gc = new GetConnection();
		
		Connection conn = gc.getConnection();
		Statement stmt = null;
		
		try{
			//STEP 2: Register JDBC driver
	//		Class.forName(JDBC_DRIVER);
			
				
			System.out.println("Creating table in given database...");
			stmt = conn.createStatement();
			
			String sql = "CREATE TABLE student " +
			"(id INTEGER not NULL, " +
			" first VARCHAR(255), " +
			" last VARCHAR(255), " +
			" age INTEGER, " +
			" PRIMARY KEY ( id ))";
			
			stmt.executeUpdate(sql);
			
			System.out.println("Created table in given database...");
			System.out.println("Inserting records into the table...");
			
//			stmt =conn.createStatement();
			
			sql ="INSERT INTO student VALUES (100, 'Kriss', 'Kurian', 18)";
			stmt.executeUpdate(sql);
			
			sql = "INSERT INTO student VALUES (101, 'Enrique', 'John', 25)";
			stmt.executeUpdate(sql);
			
			sql= "INSERT INTO student VALUES(102, 'Taylor', 'Swift', 30)";
			stmt.executeUpdate(sql);
			
			sql= "INSERT INTO student VALUES(103, 'Linkin', 'Park', 28)";
			stmt.executeUpdate(sql);
			
			System.out.println("Inserted records into the table...");
		}catch(SQLException se){
			//Handle errors for JDBC
			se.printStackTrace();
		}catch(Exception e){
			//Handle errors for Class.forName
			e.printStackTrace();
		}finally{
		//finally block used to close resources
			try{
				if(stmt!=null)
					stmt.close();
			}catch(SQLException se2){
				
			}// nothing can be done
			
			try{
				if(conn!=null)
					conn.close();
			}catch(SQLException se){
				se.printStackTrace();
			}//end finally try
		}//end try
		System.out.println("Goodbye!");
	}//end main
}
