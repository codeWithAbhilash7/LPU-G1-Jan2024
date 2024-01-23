package com.core.methods;

public class MethodsWithReturnType {

	/**
	 * 
	 * @param number1 : first number for addition
	 * @param number2 : second number for addition
	 * @return : returns the sum of given 2 numbers
	 */
	public static int add(int number1, int number2) {
		int result = number1 + number2;
		return result;
	}

	public static void main(String[] args) {
		int number1 = 45;
		int number2 = 34;
		int sum = add(45, 34);
		System.out.println("The addition of " + number1 + " and " + number2 + " is " + sum);
	}

}
