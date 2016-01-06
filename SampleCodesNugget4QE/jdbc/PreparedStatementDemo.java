package jdbc;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;


public class PreparedStatementDemo {
	public static void main(String[] args) {
		try {
			//load driver
			Class.forName("com.mysql.jdbc.Driver");
			
			//establish the connection
			Connection con = DriverManager.getConnection
				("jdbc:mysql://localhost/emp", "root", "root");
			System.out.println("Connected");
			
			String sql = "insert into userdata values(?,?,?,?)";
			PreparedStatement pstmt = con.prepareStatement(sql);
			pstmt.setString(1, "aaa");
			pstmt.setString(2, "aaa");
			pstmt.setString(3, "aaa");
			pstmt.setString(4, "aaa");
			int i = pstmt.executeUpdate();
			if(i > 0){
				System.out.println("Record inserted");
			}else
				System.out.println("Record not insrted");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
