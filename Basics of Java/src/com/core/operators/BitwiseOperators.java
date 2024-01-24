package com.core.operators;

public class BitwiseOperators {

	public static void main(String[] args) {
		int number1 = 54; // 110110
		int number2 = 34; // 100010
		// AND // 100010 --> 34
		// OR // 110110 --> 54

		number1 = 5647;
		number2 = 6573;

		int result = number1 & number2;
		result = number1 | number2;

		System.out.println(result);

	}

}
