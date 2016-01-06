
import java.sql.*;
public class ConManager {
		Connection con =null;

		public Connection connectionStart(String url,String user,String pass)throws SQLException {
				/*Driver dr =DriverManager.getDriver(url);
				 System.out.println("Got Driver");*/
				con=DriverManager.getConnection(url,user,pass);
				/*	con = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/mysql?autoReconnect=false", user, pass);*/
				return con;
			}

		public void connectionClose() throws SQLException {
				if(con != null) {
						con.close();
					}
			}
	}
