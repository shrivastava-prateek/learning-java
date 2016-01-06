import java.sql.*;
public class Client {
		public static void main(String []args) {
				String address= "jdbc:mysql://127.0.0.1,3306/";
				String user="root";
				String pass="";
				Connection con1=null;

				DBtest cm=new DBtest();

				try {
						Class.forName("com.mysql.jdbc.Driver");
						System.out.println("Class found");
					}
				catch(ClassNotFoundException e) {System.out.println(e);}



				try {
						con1=cm.connectionStart(address,user,pass);
						System.out.println("Connection established");
					}
				catch(SQLException e) { System.out.println(e);}

				try {
						cm.connectionClose();
						System.out.println("Connection closed");
					}
				catch(SQLException e) {System.out.println(e);}
			}
	}
 