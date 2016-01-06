package com.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {
	Connection conn;
	public Connection getConnection(){
		try {
			Class.forName("com.mysql.jdbc.Driver");
			//System.out.println("Registered");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String url="jdbc:mysql://localhost:3306/hotel";
		String user="root";
		String pass="root";
		try {
			conn=DriverManager.getConnection(url,user,pass);
			if(!conn.isClosed()){
				//System.out.println("Connection is successfull");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return conn;
		
	}
	
	public void closeConnection(){
		try {
			conn.close();
			//System.out.println("Connection is closed");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
