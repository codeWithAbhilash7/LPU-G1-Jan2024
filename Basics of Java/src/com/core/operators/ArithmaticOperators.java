package com.core.operators;

public class ArithmaticOperators {

	public static void main(String[] args) {
		// used to perform mathematical operations on numeric values
		int number1 = 25;
		int number2 = 6;

		int sum = number1 + number2;
		int difference = number1 - number2;
		int product = number1 * number2;
		float division = (float) number1 / number2;
		int mod = number1 % number2;

		System.out.println("Addition is " + sum);
		System.out.println("Difference is " + difference);
		System.out.println("Multiplication is " + product);
		System.out.println("Division is " + division);
		System.out.println("Modulus is " + mod);

		// increment
		int postIncrement = number1++;
		int preIncrement = ++number1;

		// decrement
		int postDecrement = number1--; // number1 = number1 - 1
		int preDecrement = --number1;

		// short hand operators
		number1 += 10; // number1 = number1 + 10;
		number1 -= 10; // number1 = number1 - 10;
		number1 *= 10; // number1 = number1 * 10;
		number1 /= 10; // number1 = number1 / 10;
		number1 %= 10; // number1 = number1 % 10;

	}

}
