package com.util;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.*;


//Override and implement all the methods of DBConnectionUtil Interface in this class 
public class DatabaseConnectionManager implements DBConnectionUtil
	{
		Connection con=null;

		@Override
		public Connection getConnection() throws ClassNotFoundException, SQLException
			{
				String URL="jdbc:mysql://127.0.0.1:3306/inventorydb";
				String user="root";
				String pass="";
			
						Class.forName("com.mysql.jdbc.Driver");
						con=DriverManager.getConnection(URL,user,pass);
				if(con!=null)
					{
						System.out.println("Connection is successful");
					}
				return con;
			}

		@Override
		public void closeConnection() throws SQLException
			{
				if(con!=null)
					{
						con.close();
						System.out.println("Connection is closed");
					}
			}


	}
