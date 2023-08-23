package com.java.jdbc;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Callable {

	
	public static void main(String[] args) {
		Connection conn = null;
		Statement stmt = null;
		try{
			System.out.println("Connecting to database...");
			conn = GetConnection.getConnection();
			
			CallableStatement callableStatement =
					conn.prepareCall("{call display_max_age(?)}");

				callableStatement.registerOutParameter(1, java.sql.Types.INTEGER);

				ResultSet result = callableStatement.executeQuery();
				int  out2 = callableStatement.getInt   (1);
				
				System.out.println("The Highest Age: " + out2);

			
		} catch (Exception e) {
			
		}
	}
}
