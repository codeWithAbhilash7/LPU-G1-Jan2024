package com.core;

public class DataTypes {

	public static void main(String[] args) {
		
		// primitive data types
		// integral --> 12, 54, 34, 76345, -65345, 23457
		// byte --> 1 byte --> 8 bits --> 2^8 --> 256 / 2 --> -128 to 127
		byte byteValue = 65;
		System.out.println("Byte value is :: " + byteValue);
		
		// short --> 2 bytes --> 16 bits --> 2^16 --> 65536 / 2 --> -32,768 to 32,767
		short shortValue = 23423;
		System.out.println("Short value is :: " + shortValue);
		
		// int --> 4 bytes --> -2,147,483,648 to 2,147,483,647
		int intValue = 756734;
		System.out.println("Int value is :: " + intValue);
		
		// long --> 8 bytes --> -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807
		long longValue = 346345634;
		System.out.println("Long value is :: " + longValue);

		// floating point --> 34.65, -35.65, 0.0, 32452345.6543456
		// double --> 8 bytes
		double doubleValue = 234.5423452345;
		System.out.println("\nDouble value is :: " + doubleValue);
		
		// float --> 4 bytes
		float floatValue = 234.5423452345f;
		System.out.println("Float value is :: " + floatValue);

		// characters --> 'r', 'a', 'l', 'y', 'w', 'a'
		// char
		char charValue = 'R';
		System.out.println("\nChar value is :: " + charValue);

		// boolean --> true / false
		boolean boolValue = true;
		System.out.println("Boolean value is :: " + boolValue);

		
		// non primitive
		// String --> class
		// "Vishal", "Flat no 411, Mumbai, India"
		String name = "Vishal";
		System.out.println("\nName is " + name);
		
		String address = "Mumbai, India- 400001.";
		System.out.println("Address = " + address);
	}

}
