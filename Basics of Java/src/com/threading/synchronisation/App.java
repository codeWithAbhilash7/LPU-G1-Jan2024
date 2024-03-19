package com.threading.synchronisation;

public class App {

	public static void main(String[] args) {
		BankAccount account = new BankAccount(100000);

		DebitCard c1 = new DebitCard("ABC", account, 2000);
		DebitCard c2 = new DebitCard("PQR", account, 7000);
		DebitCard c3 = new DebitCard("XYZ", account, 5000);
		
		c1.start();
		c2.start();
		c3.start();
	}

}
