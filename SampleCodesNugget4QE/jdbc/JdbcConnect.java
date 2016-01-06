package jdbc;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

//type 4 driver

public class JdbcConnect {
	public static void main(String[] args) {
		try {
			//load driver
			Class.forName("com.mysql.jdbc.Driver");
			//establish the connection
			Connection con = DriverManager.getConnection
				("jdbc:mysql://localhost/emp", "root", "root");
			System.out.println("Connected");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
