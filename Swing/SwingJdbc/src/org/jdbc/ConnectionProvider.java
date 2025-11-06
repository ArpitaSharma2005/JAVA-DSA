package org.jdbc;
import java.sql.*;

public class ConnectionProvider {
	static Connection con;
	public static Connection provideCon()
	{
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/fspsample","root","arcc1");
		}
		catch(Exception e1){
			e1.printStackTrace();
		}
		return con;
	}
}
