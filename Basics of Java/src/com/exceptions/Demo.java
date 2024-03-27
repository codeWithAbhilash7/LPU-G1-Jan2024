package com.exceptions;

import java.io.FileNotFoundException;
import java.sql.SQLException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Demo {

	static void arithmatic(int no1, int no2) {
		int result = 0;
		try {
			result = no1 / no2;
		} catch (ArithmeticException e) {
			e.printStackTrace();
		}
		System.out.println(result);
	}

	static void print(int no) {
		System.out.println(no++);
		print(no);
	}

	public static void main(String[] args) {
//		print(1);

//		for (int i = 0; i < 5; i++) {
//			// ArithmeticException
//			arithmatic(10, i);
//		}

		// NullPointerException
		// nullPointer();

		// ArrayIndexOutOfBoundsException
		// arrayIndexOutOfBounds();

		// InputMismatchException
		// inputMismatch();

		// NumberFormatException
		// numberFormat();

		catchBlock();

		System.out.println("Finished....");
	}

	private static void catchBlock() {
		int arr[] = { 1, 2, 6, 4, 5 };
		int result = 0;

		for (int i = 0; i < arr.length - 1; i++) {
			try {
				result += arr[i] / arr[i + 1];
			} catch (ArrayIndexOutOfBoundsException | ArithmeticException e) {
				System.out.println("ArrayIndexOutOfBoundsException");
				// e.printStackTrace();
//			} catch (ArithmeticException e) {
//				System.out.println("ArithmeticException");
//				// e.printStackTrace();
			} catch (RuntimeException e) {
				System.out.println(e);
			} catch (Exception e) {
				System.out.println("Exception ");
				// e.printStackTrace();
			}
		}
		System.out.println("result = " + result);

	}

	private static void numberFormat() {
		// NumberFormatException
		String str = "S454";
		try {
			int value = Integer.parseInt(str);
		} catch (NumberFormatException e) {
			e.printStackTrace();
		}
	}

	private static void inputMismatch() {
		// InputMismatchException
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a value :: ");
		try {
			sc.nextInt();
		} catch (InputMismatchException e) {
			e.printStackTrace();
		}
	}

	private static void arrayIndexOutOfBounds() {
		// ArrayIndexOutOfBoundsException
		try {
			int arr[] = new int[5];
			arr[6] = 54;
		} catch (ArrayIndexOutOfBoundsException e) {
			e.printStackTrace();
		}
	}

	private static void nullPointer() {
		// NullPointerException
		String str = null;
		try {
			str.length();
		} catch (NullPointerException e) {
			e.printStackTrace();
		}
	}

}
