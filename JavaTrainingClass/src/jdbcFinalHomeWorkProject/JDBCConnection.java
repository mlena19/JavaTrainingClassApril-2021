package jdbcFinalHomeWorkProject;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


public class JDBCConnection {

	public static Connection getDbConnection() {
		Connection myConn = null;
		String url = "jdbc:mysql://localhost:3306/bank_system";
		String username = "root";
		String password = "Gobzi21";
		
			try {
				myConn = DriverManager.getConnection(url, username, password);
			} catch (SQLException e) {
					e.printStackTrace();
			}
			return myConn;
			
			
	}
	
	}
