package com.threading.synchronisation;

public class DebitCard extends Thread {
	private BankAccount account;
	private double amount;

	public DebitCard(String name, BankAccount account, double amount) {
		super();
		this.account = account;
		this.amount = amount;
	}

	@Override
	public void run() {
		account.withdraw(amount);
	}

}
