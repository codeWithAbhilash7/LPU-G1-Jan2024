package com.core.vargars;

import java.util.Arrays;

public class VariableArguments {

//	private static int add(int no1, int no2) {
//		return no1 + no2;
//	}
//
//	private static int add(int no1, int no2, int no3) {
//		// return no1 + no2 + no3;
//		return add(add(no1, no2), no3);
//	}

	// variable arguments --> varargs
	private static int add(String str, int... numbers) {
		int sum = 0;
		for (int i = 0; i < numbers.length; i++) {
			sum += numbers[i];
		}

		return sum;
	}

	public static void main(String[] args) {
		// Variable Arguments
		System.out.println(add("Hello", 10, 23));
		System.out.println(add("Hello", 10, 23, 68, 71, 1));
		System.out.println(add("Hello"));
	}

}
