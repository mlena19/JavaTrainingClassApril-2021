package jdbcFinalHomeWorkProject;

public class Account {
	private int accountNo;
	private String firstName;
	private String lastName;
	private double balance;
	
	public Account(int accountNo, String firstName, String lastName, double balance) {
		super();
		this.accountNo = accountNo;
		this.firstName = firstName;
		this.lastName = lastName;
		this.balance = balance;
	}

	public int getAccountNo() {
		return accountNo;
	}

	public void setAccountNo(int accountNo) {
		this.accountNo = accountNo;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}
	//Q2 add three methods called debt and credit 
		public void withdraw(double withdrawAmount) {
			//Check if we have enough $, so we use if condition
			balance = balance - withdrawAmount;
			if (balance < withdrawAmount) {
				System.out.println ("Insuffiecient Balance");
			}else { 
				balance = balance - withdrawAmount;
				System.out.println("The withdrawAmount = " + withdrawAmount + " of all three's new balance = " + balance);
			}
		}
		public void deposit(double addAmount) {
			balance = balance + addAmount;
			System.out.println(" Total new balance " + addAmount);
		}
		public void transfer(double trAmount) {
			balance = balance + trAmount;
			System.out.println(" final balance after transfer " + trAmount);
		}
		
	@Override
	public String toString() {
		return "Account [accountNo=" + accountNo + ", firstName=" + firstName + ", lastName=" + lastName + ", balance="
				+ balance + "]";
	}
	
	

}
