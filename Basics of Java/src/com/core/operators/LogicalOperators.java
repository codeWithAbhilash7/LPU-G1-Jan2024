package com.core.operators;

public class LogicalOperators {

	public static void main(String[] args) {
		int number1 = 10;
		int number2 = 20;

		// AND && -- if both the conditions are true, then result is true
		boolean result = number1 > 5 && number2 > 25;

		// OR || -- if any one condition is true, then result is true
		result = number1 > 15 || number2 > 15;

		// NOT !  
		result = true;
		result = !result;
		System.out.println(result);

	}

}
