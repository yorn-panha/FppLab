package lab13.Lab_13_2.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectManager {
	
	private static final String DB_URL 
		= "jdbc:mysql://localhost:3306/FPP_DB";
	private static final String USERNAME = "root";
	private static final String PASSWORD = "root";
	private static Connection conn = null;
	public Connection getConnection() throws SQLException {
		if(conn == null) {	
			conn = DriverManager.getConnection(DB_URL, USERNAME, PASSWORD);
			System.out.println("Got connection...");
		}
		return conn;
	}
	
	public void closeConnection(Connection con)  throws SQLException {
		if(con != null && !con.isClosed()) {
			con.close();
		}
	}
}
