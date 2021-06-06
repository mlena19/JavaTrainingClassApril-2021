package jdbcFinalHomeWorkProject;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


public class JDBCConnection {

	public static Connection getDbConnection() {
		Connection myConn = null;
		PreparedStatement myStat = null; 
		ResultSet myRs = null;
		String url = "jdbc:mysql://localhost:3306/bank_system";
		String un = "root";
		String pw = "Gobzi21";
		
			try {
				myConn = DriverManager.getConnection(url, un, pw);
			} catch (SQLException e) {
					e.printStackTrace();
			}
			return myConn;
			
			
	}
	
	}
