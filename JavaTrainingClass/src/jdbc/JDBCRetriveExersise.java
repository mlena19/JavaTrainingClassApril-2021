package jdbc;

	import java.sql.Connection;
	import java.sql.DriverManager;
	import java.sql.ResultSet;
	import java.sql.SQLException;
	import java.sql.Statement;
	public class JDBCRetriveExersise {

	public static void main(String[] args) throws SQLException {
				Connection connection = null;
				Statement myStmt = null;
				ResultSet myRs = null;
				try {
					//String username = "root";
					//String password = "Gobzi21";
				    // 1. Get a connection to database
					connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/bank", "root", "Gobzi21");
				    System.out.println("Database connection successful!\n");
				    // 2. Create a statement
				    myStmt = connection.createStatement();
				    // 3. Execute SQL query
				    myRs = myStmt.executeQuery("SELECT * FROM bank.account order by balance desc");
				    
				    // 4. Process the result set
				    while (myRs.next()) {
					System.out.println(myRs.getString("first_name") + myRs.getDouble("balance"));
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




