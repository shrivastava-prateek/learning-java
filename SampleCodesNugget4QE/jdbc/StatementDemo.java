package jdbc;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;


public class StatementDemo {
	public static void main(String[] args) {
		try {
			//load driver
			Class.forName("com.mysql.jdbc.Driver");
			
			//establish the connection
			Connection con = DriverManager.getConnection
				("jdbc:mysql://localhost/emp", "root", "root");
			System.out.println("Connected");
			
			String sql = "insert into userdata values('xyz','xyz','xyz','xyz')";
			
			Statement stmt = con.createStatement();
			int i = stmt.executeUpdate(sql);
			if(i > 0){
				System.out.println("Record is inserted");
			}
			else{
				System.out.println("Record not inserted");
			}
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
