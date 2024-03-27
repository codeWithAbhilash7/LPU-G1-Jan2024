package com.exceptions;

public class FinallyKeyword {

	public static int divide(int no1, int no2) {
		int result = 0;
		try {
			result = no1 / no2;
			System.out.println("try block = " + result);
			// return result;
		} catch (Exception e) {
			System.out.println("Catch block");
			// return result;
		} finally { // finally block will be executed always
			System.out.println("finally block");
		}
		return result;
	}

	public static void tryWithFinally() {
		try {
			System.out.println("try block = ");
			int result = 10 / 0;
			System.out.println("try block = " + result);
		}
		finally {
			System.out.println("finally block");
		}
		
		
	}

	public static void main(String[] args) {
		// System.out.println(divide(15, 0));

		try {
			tryWithFinally();
		} catch (Exception e) {
			System.out.println("catch block of main()");
		}
	}

}
