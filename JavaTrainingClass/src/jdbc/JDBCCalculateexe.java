package jdbc;

	import java.sql.Connection;
	import java.sql.DriverManager;
	import java.sql.ResultSet;
	import java.sql.SQLException;
	import java.sql.Statement;
	public class JDBCCalculateexe {

	public static void main(String[] args) throws SQLException {
				Connection connection = null;
				Statement myStmt = null;
				ResultSet myRs = null;
				try {
					String username = "root";
					String password = "Gobzi21";
				    // 1. Get a connection to database
					connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/bank", username, password);
				    System.out.println("Database connection successful!\n");
				    // 2. Create a statement
				    myStmt = connection.createStatement();
				    // 3. Execute SQL query
				    myRs = myStmt.executeQuery("SELECT SUM(balance) FROM bank.account ");
				    
				    // 4. Process the result set
				    int sum = 1;
				    while (myRs.next()) {
				    	double balance = myRs.getDouble(sum);
				    	   System.out.println(balance);
				    	
					//System.out.println(myRs.getString("first_name") + myRs.getDouble("balance"));
				    }
				} catch (Exception exc) {
				    exc.printStackTrace();
				} finally {
				    if (myRs != null) {
					myRs.close();
				    }
				    if (myStmt != null) {
					myStmt.close();
				    }
				    if (connection != null) {
				    	connection.close();
				    }
				}
				

			}
	}


