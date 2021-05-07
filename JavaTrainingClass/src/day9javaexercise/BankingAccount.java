package day9javaexercise;

public class BankingAccount {

	public static void main(String[] args) {
		//Q3. Create an account for “Hagos Gebru” Account number 10001 with an initial balance of $5000. 
		//Withdraw $3000 and deposit $1000.
		//We create an Objects for Hagos Gebru

		Account hagosAccount = new Account("Hagos", "Gebru", 10001, 5000);
		// the above object is calling the Account constructor
		System.out.println(hagosAccount);
		hagosAccount.debit(3000);
		hagosAccount.credit(1000);
		System.out.println(hagosAccount);
		
		//Create an account for “James Bond” Account number 10002 with initial balance $3000 and withdraw $4000.

		Account jamesAccount = new Account("James", "Bond", 10002, 3000);
		jamesAccount.debit(4000);
	}

}
