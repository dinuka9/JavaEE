package lk.dinuka.SpringMVC.domain.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBUtil {
	private static Connection con = null;
	final static String JDBC_DRIVER = "com.mysql.jdbc.Driver";
	final static String DB_URL = "jdbc:mysql://localhost/springmvc";
	final static String USERNAME = "root";
	final static String PASSWORD = "0711646136";
	
	public static Connection getConnection() throws ClassNotFoundException, SQLException {
		if (con == null) {
			Class.forName(JDBC_DRIVER);
			con = DriverManager.getConnection(DB_URL, USERNAME, PASSWORD);
		}
		return con;
	}
}
