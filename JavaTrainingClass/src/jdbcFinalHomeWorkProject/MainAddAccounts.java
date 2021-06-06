package jdbcFinalHomeWorkProject;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class MainAddAccounts {

	public static void main(String args[]) {
		//question 2, create add account method
	//addAccounts();
		//question 3 deposit 1000 for all accounts using new method 
    //depostforAll();
       //Question 3.-with draw 500 from jhon, and use withdraw method
    //withdraw(2001,500d);
    
    //transaction();
     //Q4-Transfer $750 from Hadgu to  Tesfay
   	Transfer(501, 2004, 2001, 750, "Trip to Hawaii");
   	
	}
	private static void transaction() {
		
			//create transaction object manually 
			Transaction john = new Transaction(100, "deposit", 1000, 2001);
			Transaction tesfay = new Transaction(101, "deposit", 1000, 2002);
			Transaction hadgu = new Transaction(102, "deposit", 1000, 2004);
			Transaction johnw = new Transaction(103, "withdraw", 500, 2001);
			
			/* Dynamic create object could not work so use manual
			 * Transaction nigstiye = new Transaction(101, "deposit", 1000,
			 * john.getAccount_no()); Transaction transactiontesfay = new Transaction(101,
			 * "deposit", 1000, tesfay.getAccount_no()); Transaction transactionhadgu = new
			 * Transaction(101, "deposit", 1000, hadgu.getAccount_no()); Transa
			 */
			
//prepare to use array list
			List<Transaction> transactions=new ArrayList<>();
			transactions.add(john);
			transactions.add(tesfay);
			transactions.add(hadgu);
			transactions.add(johnw);
			
		    Transaction(transactions);
		    }
		private static void withdraw() {
			Transaction john = new Transaction(100, "withdraw", 500, 2001);
		}
	private static void Transaction(List<Transaction> transactions) {
			// TODO Auto-generated method stub
		String UpdateSql = "Insert into transaction (transaction_id, transaction_type, amount, account_no) VALUES (?,?,?,?)";
		Connection connection=JDBCConnection.getDbConnection();
		PreparedStatement myStat;
		try {
			myStat = connection.prepareStatement(UpdateSql);
			
			//using for each vs for loop
		
		for(Transaction Transaction:transactions) {
			System.out.println("added transaction for " + Transaction.getAccount_no());
			
			myStat.setInt(1, Transaction.getTransaction_id());
			myStat.setString(2, Transaction.getTransaction_type());
			myStat.setDouble(3, Transaction.getAmount());
			myStat.setInt(4, Transaction.getAccount_no());
			myStat.execute();
		}
		
		System.out.println("Transaction table has been updated");
		}
		catch (SQLException e) {
			e.printStackTrace();
		}

	}



	private static void Transfer(int transfer_id, int from_account, int to_account, double amount, String reason) {
		
	    	Transfer toTesfay = new Transfer(transfer_id,from_account, to_account, amount, reason);
	    	String updateSql2 =	"Insert into  bank_system.transfer (transfer_id, from_account, to_account,amount,reason) VALUES (?,?,?,?,?)";
	    	Connection connection=JDBCConnection.getDbConnection();
			PreparedStatement myStat;
			try {
				myStat = connection.prepareStatement(updateSql2);
				myStat.setInt(1, toTesfay.getTransfer_id());
				myStat.setInt(2, toTesfay.getFrom_account());
				myStat.setDouble(3, toTesfay.getTo_account());
				myStat.setDouble(4, toTesfay.getAmount());
				myStat.setString(5, toTesfay.getReason());
				myStat.execute();		
				
				System.out.println("Transfer amount:"+ updateSql2 + "for " + "John");
			}
			catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
    	
	    	//
	private static void withdraw(int account_no, double withdrawAmount) {

		String updateSql1 =	"UPDATE  bank_system.account SET balance=balance-? where account_no=?";
    	Connection connection=JDBCConnection.getDbConnection();
		PreparedStatement myStat;
		try {
			myStat = connection.prepareStatement(updateSql1);
			myStat.setDouble(1, withdrawAmount);
			myStat.setInt(2, account_no);		
			myStat.execute();
			System.out.println("withdraw amount:"+withdrawAmount + "for " + account_no);
		}
		catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	private static void depostforAll() {
    	String updateSql1 =	"UPDATE  bank_system.account SET balance=balance+1000";
    	Connection connection=JDBCConnection.getDbConnection();
		PreparedStatement myStat;
		try {
			myStat = connection.prepareStatement(updateSql1);
			myStat.execute();
		}
		catch (SQLException e) {
			e.printStackTrace();
		}
		
	}

    //account create and we will call method above line 13 (addaccount)
	private static void addAccounts() {
    	Account john = new Account(2001, "John", "Doe", 2500.00);
		Account tesfay = new Account(2002, "Tesfay", "Kiros", 1250);
		Account hadgu = new Account(2004, "Hadgu", "Kindeya", 5000.30);
	
	List<Account> accounts=new ArrayList<>();
    accounts.add(john);
    accounts.add(tesfay);
    accounts.add(hadgu);
	
    addAccount(accounts);
    }
//Setp 2 is to insert into sql after created object and 
    private static void addAccount(List<Account> accounts) {
		String insertSql1 = "insert into account(account_no,first_name,last_name,balance) value (?,?,?,?)";
		Connection connection=JDBCConnection.getDbConnection();
		PreparedStatement myStat;
		try {
			myStat = connection.prepareStatement(insertSql1);
		
		for(Account account:accounts) {
			System.out.println("added account for " + account.getFirstName());
			
			myStat.setInt(1, account.getAccountNo());
			myStat.setString(2, account.getFirstName());
			myStat.setString(3, account.getLastName());
			myStat.setDouble(4, account.getBalance());
			myStat.execute();
		}
		}
		catch (SQLException e) {
		e.printStackTrace();
		}
		
		}
	}

