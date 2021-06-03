package jdbcFinalHomeWorkProject;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class AccountMainClass {

	public static void main(String[] args) throws SQLException {
		// Step 1 declare the below variables  
			//Q2, inserting three objects into account table 
		Connection myConn = null;
		PreparedStatement myStat = null; 
		Statement myStmt = null;
		ResultSet myRs = null;
		String url = "jdbc:mysql://localhost:3306/bank_system";
		String un = "root";
		String pw = "Gobzi21";
		try {
			//Step 2 get connection
			myConn = DriverManager.getConnection(url, un, pw);
			myStmt = myConn.createStatement();
			
			//create statement 
			
			// creating three objects
			Account john = new Account(2001, "John", "Doe", 2500.00);
			Account tesfay = new Account(2002, "Tesfay", "Kiros", 1250);
			Account hadgu = new Account(2004, "Hadgu", "Kindeya", 5000.30);
			
			String insertSql = "insert into account(account_no,first_name,last_name,balance) value (?,?,?,?)";

			myStat = myConn.prepareStatement(insertSql);
			System.out.println();
			
			System.out.println(john);
			myStat.setInt(1, john.getAccountNo());
			myStat.setString(2, john.getFirstName());
			myStat.setString(3, john.getLastName());
			myStat.setDouble(4, john.getBalance());
			myStat.execute();
			
			System.out.println();
			
			System.out.println(tesfay);
			myStat.setInt(1, tesfay.getAccountNo());
			myStat.setString(2, tesfay.getFirstName());
			myStat.setString(3, tesfay.getLastName());
			myStat.setDouble(4, tesfay.getBalance());
			myStat.execute();
			
			System.out.println();
			
			System.out.println(hadgu);
			myStat.setInt(1, hadgu.getAccountNo());
			myStat.setString(2, hadgu.getFirstName());
			myStat.setString(3, hadgu.getLastName());
			myStat.setDouble(4, hadgu.getBalance());
			myStat.execute();
		
			//instead of using myStat.executeUpdate(InsertSql); for all objects, we use myStat.execute(); for eac objects 
			
			System.out.println("Data has been inserted in to account table successfully");
			
			//Q3, creating a new method here for all three objects		
			
			john.deposit(1000);
			tesfay.deposit(1000);
			hadgu.deposit(1000);
			john.withdraw(500);
			hadgu.transfer(750);
			
			
	//Transaction table
	Transaction transactionjohn = new Transaction(101, "deposit", 1000, john.getAccountNo());
	String mySql1 = "Insert into transaction (transaction_id, transaction_type, amount, account_no) VALUES (?,?,?,?)";
	myStat = myConn.prepareStatement(mySql1);
							
		System.out.println(transactionjohn);
		myStat.setInt(1, transactionjohn.getTransaction_id());
		myStat.setString(2, transactionjohn.getTransaction_type());
		myStat.setDouble(3, transactionjohn.getAmount());
		myStat.setInt(4, transactionjohn.getAccount_no());
		myStat.execute();
		
						System.out.println();
						System.out.println("Data successfully inserted into transaction table ");
						

			} catch (Exception exc) {
		    exc.printStackTrace();
		}

		
			}
}
