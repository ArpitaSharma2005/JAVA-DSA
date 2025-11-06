package oops;

public class Account {
	double balance;
	public void deposit(double amount) {
		balance += amount;
	}
	public double withdraw(double amount) {
		int minimum_balance = 5000;
		if(balance >= (amount+minimum_balance)) {
			balance -= amount;
			return amount;
		}
		else {
			System.out.println("Insufficient Balance");
			return 0.0;
		}
	}
	public double getbalance() {
		return balance;
	}
	
	public static void main(String[] args) {
		Account acc = new Account();
		acc.deposit(8000);
		System.out.println("After Depositing the balance is: "+acc.getbalance());
		acc.withdraw(2000);
		System.out.println("After Depositing the balance is: "+acc.getbalance());
		
	}
}
