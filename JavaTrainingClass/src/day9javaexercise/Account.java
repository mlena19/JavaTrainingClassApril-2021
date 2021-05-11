package day9javaexercise;

public class Account {
	/*
	 * Q1 Create a class called Account that includes four pieces of information as
	 * instance variables First Name (String) Last Name (String) Account Number
	 * (long) Balance (double)
	 */
//step 1 to create attribute 
	private String firstName;
	private String lastName;
	private long accountNumber;
	private double balance;
	
	public static long accountIncrement = 10001;

	/*
	 * Q1.1 your class should have a constructor that initializes the four instance
	 * variables.
	 * 
	 */
	//Step 2 constructor 
	public Account(String firstName, String lastName, long accountNumber, double balance) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.accountNumber = accountNumber;
		accountIncrement = accountIncrement + 1;
		this.balance = balance;
	}

	// Q1.1.2 Provide a set and a get method for each instance variable. we can use the getter/setter from source

	public String getFirstName() {
		return firstName;
	}
	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public long getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(long accountNumber) {
		this.accountNumber = accountNumber;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	//Q2 add two methods called debt and credit 
	public void debit(double withdrawAmount) {
		//Check if we have enough $, so we use if condition
		balance = balance - withdrawAmount;
		if (balance < withdrawAmount) {
			System.out.println ("Insuffiecient Balance");
		}else { 
			balance = balance - withdrawAmount;
			System.out.println("The withdrawAmount = " + withdrawAmount + " Hagos's new balance = " + balance);
		}
	}
	public void credit(double addAmount) {
		balance = balance + addAmount;
		System.out.println(" final balance " + addAmount);
}
// we use toString so any Object can be printed from the main method
	@Override
	public String toString() {
		return "Account [firstName=" + firstName + ", lastName=" + lastName + ", accountNumber=" + accountNumber
				+ ", balance=" + balance + "]";
	}
}