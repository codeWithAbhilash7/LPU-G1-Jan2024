package com.core.methods;

public class VoidMethods {

	/**
	 * void : returns nothing greetMorning : identifier/name of the method () :
	 * accepts no arguments
	 */
	public static void greetMorning() {
		System.out.println("Good morning!!!");
	}

	/**
	 * @param name : greets hello using this name
	 */
	public static void greetHello(String name) {
		System.out.println("Hello, " + name);
		greetMorning();
	}

	public static void main(String[] args) {
		// greetMorning();
		greetHello("Akshay");
	}

}
