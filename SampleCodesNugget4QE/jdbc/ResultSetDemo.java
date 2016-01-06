package jdbc;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class ResultSetDemo {
	public static void main(String[] args) {
		try {
			//load driver
			Class.forName("com.mysql.jdbc.Driver");
			
			//establish the connection
			Connection con = DriverManager.getConnection
				("jdbc:mysql://localhost/emp", "root", "root");
			System.out.println("Connected");
			
			String sql = "select * from userdata";
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery(sql);
			
			while(rs.next()){
				System.out.println("Username: " + rs.getString(1));
				System.out.println("Password: " + rs.getString("password"));
				System.out.println("fname: " + rs.getString(3));
				System.out.println("lname: " + rs.getString(4));
				System.out.println("----------------------------------");
			}
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
