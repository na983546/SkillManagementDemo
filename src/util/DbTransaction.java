package util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class DbTransaction {
	
	static String url ="jdbc:mysql://localhost:3306/SkillManagement";
	
	public static Connection getConnection(){
		Connection con =null;
			try {
				Class.forName("com.mysql.jdbc.Driver");
				con=DriverManager.getConnection(url,"naveen","naveen");
			}
			catch (ClassNotFoundException e) {
				e.printStackTrace();
			}
			catch(SQLException e){
				e.printStackTrace();
			}
			return con;
		}
	
	public static void closeConnection(Connection con){
		if(con != null)
		{
			try{
				con.close();
			}
			catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}

}
