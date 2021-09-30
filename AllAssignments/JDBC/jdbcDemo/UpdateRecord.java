package com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class UpdateRecord {

	public static void main(String args[]) {
		Connection connection=null;
		final String username="root";
		final String password="ansh";
		final String jdbcurl="jdbc:mysql://localhost:3306/jdbcdemo";
		try {
			Class.forName("com.mysql.jdbc.Driver");
			connection=DriverManager.getConnection(jdbcurl,username,password);
			//System.out.println("Connected...");
			Statement statement=connection.createStatement();
			String sql="UPDATE CUSTOMER SET ADDRESS='Buxar' where id=1";
			statement.executeUpdate(sql);
			System.out.println("Record is updated");
			
		}
		catch(Exception e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
		}
	}
}
