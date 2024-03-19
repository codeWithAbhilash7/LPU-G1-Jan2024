package com.threading.synchronisation;

public class BankAccount {
	private double balance;

	public BankAccount(double initialBalance) {
		this.balance = initialBalance;
	}

	public double getBalance() {
		return balance;
	}

	public synchronized void deposit(double amount) {
		this.balance += amount;
	}

	public synchronized void withdraw(double amount) {
		if (balance >= amount) {
			try {
				Thread.sleep(500);
				this.balance -= amount;
				System.out.println("Withdrew Rs. " + amount + ".\t Balace=" + balance);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}

		} else {
			System.out.println("Error : Insufficient funds!!!");
		}
	}

}
