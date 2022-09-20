package Laboratory;

public class SavingsAccount {
	private double balance;
	public static double interestRate = 0;

	public SavingsAccount() {
		this.balance = 0;
	}

	public static void setInterestRate(double newRate) {
		interestRate = newRate;
	}

	public static double getInterestRate() {
		return interestRate;
	}

	public double getBalance() {
		return this.balance;
	}

	public void deposit(double amount) {
		this.balance = this.balance + amount;
	}

	public double withdraw(double amount) {
		if (this.balance >= amount) {
			this.balance = this.balance - amount;
		} else {
			amount = 0;
		}
		return amount;
	}

	public void addInterest() {
		double interest = this.balance * interestRate;
		this.balance = this.balance + interest;
	}

	public static void showBalance(SavingsAccount account) {
		System.out.println("Your balance is " + account.getBalance());
	}
}