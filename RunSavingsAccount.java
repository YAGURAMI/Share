package Laboratory;

import java.util.*;

public class RunSavingsAccount {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		SavingsAccount savings = new SavingsAccount();
		System.out.print("Enter interest rate: ");
		SavingsAccount.interestRate = input.nextDouble(); // double interestRate = input.nextDouble();
		// SavingsAccount.interestRate = interestRate;
		System.out.print("Enter deposit amount: ");
		double amount = input.nextDouble();
		savings.deposit(amount);
		SavingsAccount.showBalance(savings);
		System.out.print("Press D for another deposit or W to withdraw: ");
		String choice = input.next();
		if (choice.equalsIgnoreCase("D")) {
			System.out.print("Enter deposit amount: ");
			amount = input.nextDouble();
			savings.deposit(amount);
		} else if (choice.equalsIgnoreCase("W")) {
			System.out.print("Enter withdraw amount: ");
			amount = input.nextDouble();
			savings.withdraw(amount);
		}
		savings.addInterest();
		SavingsAccount.showBalance(savings);
	}
}