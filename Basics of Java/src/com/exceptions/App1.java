package com.exceptions;

public class App1 {

	static void divide(int no1, int no2) {
		int result = 0;
		try {
			result = no1 / no2;
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println(result);
	}

	public static void main(String[] args) {
		for (int i = 0; i < 5; i++) {
			divide(10, i);
		}

		System.out.println("Finished....");
	}

}
