package com.core.methods;

public class MethodOverloading {

	// methods having same name
	// signature : the sequence of parameters or the number of parameters or data
	// types must be different
	// all methods must be in the same class
	// return type doesn't matter
	// name mangling -> the method will get a different name
	// the name of the method and its parameters/arguments
	// return type is not considered

	public static int add() {
		System.out.println("Method 1");
		return 0;
	}

	public static void add(int no1, int no2) {
		System.out.println("Method 2");
	}

	public static void add(int no1, int no2, int no3) {
		System.out.println("Method 3");
	}

	public static void add(double no1, double no2) {
		System.out.println("Method 4");
	}

	public static void add(int no1, double no2) {
		System.out.println("Method 5");
	}

	public static void add(double no1, int no2) {
		System.out.println("Method 6");
	}

	public static void main(String[] args) {
		add(10, 20, 30);
		add(10, 20);
		add(10.6, 20.7);
		add(10.6, 20);
		add(10, 20.89);
	}

}
