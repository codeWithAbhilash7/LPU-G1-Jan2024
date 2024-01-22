package com.wrapper;


public class WrapperClasses {

	public static void main(String[] args) {

		// byte --> Byte
		// short --> Short
		// int --> Integer
		// long --> Long
		// char --> Character
		// bool --> Boolean
		// float --> Float
		// double --> Double

		// converts primitive data type into object

		// till java 5

//		Integer intWrapper = new Integer(5468);
//		System.out.println("Wrapper int value is " + intWrapper.intValue());

//		// boxing - primitive to wrapper
//		Integer intWrapper = 3214; // auto boxing
//		int intPrimitive = 456467;
//		// intWrapper = intPrimitive;
//
//		// unboxing - wrapper to primitive
//		intPrimitive = intWrapper;
//		System.out.println("Wrapper int value is " + intWrapper);

		System.out.println("Byte minimum value is " + Byte.MIN_VALUE);
		System.out.println("Byte maximum value is " + Byte.MAX_VALUE);

		System.out.println("\nShort minimum value is " + Short.MIN_VALUE);
		System.out.println("Short maximum value is " + Short.MAX_VALUE);

		System.out.println("\nInteger minimum value is " + Integer.MIN_VALUE);
		System.out.println("Integer maximum value is " + Integer.MAX_VALUE);

		System.out.println("\nLong minimum value is " + Long.MIN_VALUE);
		System.out.println("Long maximum value is " + Long.MAX_VALUE);

	}

}
