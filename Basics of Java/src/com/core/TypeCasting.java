package com.core;

public class TypeCasting {

	public static void main(String[] args) {
		// type casting

		// implicit / widening
		byte byteValue = 127;
		short shortValue = byteValue;
		System.out.println("Implicit :: Short value is " + shortValue);

		// explicit / narrowing
		shortValue = 1256;
		byteValue = (byte) shortValue;
		System.out.println("Explicit :: Byte value is " + byteValue);

		double doubleValue = 34.99;
		int intValue = (int) doubleValue;
		
		System.out.println("Explicit :: Int value is " + intValue);
		
		/*
		 * int i = 10;
		 * byte b = i;
		 */

	}

}
