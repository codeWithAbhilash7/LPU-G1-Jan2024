package com.core;

import java.util.Scanner;

public class ReadInputsFromConsole {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		// byte --> nextByte()
//		System.out.print("\nEnter a byte value :: ");
//		int byteValue = scanner.nextByte();
//		System.out.println("Entered byte value is " + byteValue);
//
//		// short --> nextShort()
//		System.out.print("\nEnter a short value :: ");
//		int shortValue = scanner.nextShort();
//		System.out.println("Entered short value is " + shortValue);
//
//		// int --> nextInt()
//		System.out.print("\nEnter an int value :: ");
//		int intValue = scanner.nextInt();
//		System.out.println("Entered int value is " + intValue);
//
//		// long --> nextLong()
//		System.out.print("\nEnter a long value :: ");
//		long longValue = scanner.nextLong();
//		System.out.println("Entered long value is " + longValue);
//
//		// double --> nextDouble()
//		System.out.print("\nEnter a double value :: ");
//		double doubleValue = scanner.nextDouble();
//		System.out.println("Entered double value is " + doubleValue);
//		
//		// float --> nextFloat()
//		System.out.print("\nEnter a float value :: ");
//		float floatValue = scanner.nextFloat();
//		System.out.println("Entered float value is " + floatValue);
//		
//		// boolean --> nextBoolean()
//		System.out.print("\nEnter a boolean value :: ");
//		boolean booleanValue = scanner.nextBoolean();
//		System.out.println("Entered boolean value is " + booleanValue);

		// String
		System.out.print("Enter your name :: ");
		// String name = scanner.next(); // delimiter : whitespace and/or enter/new line
		// char
		String name = scanner.nextLine(); // delimiter : enter/new line char
		System.out.println("Hello, " + name);

		// char
		System.out.print("Enter a character :: ");
		char ch = scanner.next().charAt(0);
		System.out.println("Entered char is " + ch);

		scanner.close();
	}

}
