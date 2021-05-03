package com.meritamerica.assignment1;

public class CheckingAccount {
	private double balance;
	private double interestRate = 0.0001;
	
	public CheckingAccount(double openingBalance) {
		balance = openingBalance;
	}
	
	public boolean withdraw(double amount) {
		if (amount > 0.0 && amount < balance) {
			balance -= amount;
			System.out.println("Checking balance = " + balance);
			return true;
		} else { 
			System.out.println("Not enough in balance.");
			return false;
		}
	}
	
	public boolean deposit (double amount) {
		if (amount>0) {
			balance += amount;
			System.out.println("Checking balance = " + balance);
			return true;
		} else 
			System.out.println("Please enter a valid amount.");
			return false;
	}
	
	public double getBalance() {
		return balance;
	}

	public double getInterestRate() {
		return interestRate;
	}
	

	public double futureValue(int years) {
		return Math.pow(1 + interestRate,  years) * balance;
	}

	@Override
	public String toString() {
		return "CheckingAccount [balance=" + balance + ", interestRate=" + interestRate 
				+ ", Future Value = " + futureValue(3) + "]";
	}
}