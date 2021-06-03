package jdbc;

	import java.sql.Connection;
	import java.sql.DriverManager;
	import java.sql.ResultSet;
	import java.sql.SQLException;
import java.sql.Statement;
	public class JDBCUpdateExercise {

		
	@SuppressWarnings("null")
	public static void main(String[] args) throws SQLException {
				Connection myConn = null;
				Statement stmt = null;
				int myRs = 0;

				try {
					// get a connection to database
					myConn = DriverManager.getConnection("jdbc:mysql://localhost:3306/bank", "root", "Gobzi21");
					System.out.println("Database connection successful!\n");

					// prepare statment using Update stat
					stmt = myConn.createStatement();
					String query = "Update bank.account set balance = balance * 2 where account_no in (18,19,20,21,22)";
					int result = stmt.executeUpdate(query);
					System.out.println("Rows have been updated "+ result);
					
				} catch (Exception exc) {
					exc.printStackTrace();
				} finally {
				}
				if (myConn != null) {
					myConn.close();
				}
				if (stmt != null) {
					stmt.close();
				}
				//if (myRs != null) {
				//myRs.close();
			}
	}

