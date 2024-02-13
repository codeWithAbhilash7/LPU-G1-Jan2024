package com.core.strings;

public class StringClass {

	public static void main(String[] args) {

		// stringPool();
		// immuatable();

		//stringMethods();
	}

	private static void stringMethods() {
		String str1 = "Welcome Welcome";

		System.out.println("Length = " + str1.length());
		System.out.println("char at 5 = " + str1.charAt(5));
		System.out.println("compareTo = " + str1.compareTo("welcome"));
		System.out.println("compareToIgnoreCase = " + str1.compareToIgnoreCase("welcome"));
		System.out.println("concat = " + str1.concat(" to Strings"));
		System.out.println("contains = " + str1.contains("x"));
		System.out.println("index of = " + str1.indexOf("W"));
		System.out.println("lastIndexOf = " + str1.lastIndexOf("W"));

		System.out.println(str1);
		System.out.println("trim = " + str1.trim());

		System.out.println("substr = " + str1.substring(5, 9));
	}

	private static void immuatable() {
		// immutable - we can not change its value
		String str1 = "Hello";
		String str2 = "Hello";

		str1 = "Hi!";

		str1 = "Hello";
		str2 = "Hello";
		str1 = "hi";
		str2 = "bye";
		str2 += " See you again";
	}

	private static void stringPool() {
		// using literal
		String str1 = "Hello";
		String str2 = "Hello";

		// using new keyword
		String str3 = new String("Hello");
		String str4 = new String("Hello");

//		if(str1 == str2) {	// reference
//			System.out.println("str1 and str2 are equal");
//		} else {
//			System.out.println("str1 and str2 are NOT equal");
//		}

//		if(str1 == str3) {
//			System.out.println("str1 and str3 are equal");
//		} else {
//			System.out.println("str1 and str3 are NOT equal");
//		}

//		if(str3 == str4) {
//			System.out.println("str3 and str4 are equal");
//		} else {
//			System.out.println("str3 and str4 are NOT equal");
//		}

		if (str3.equals(str4)) {
			System.out.println("str3 and str4 are equal");
		} else {
			System.out.println("str3 and str4 are NOT equal");
		}
	}

}
