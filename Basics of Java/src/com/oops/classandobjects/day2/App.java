package com.oops.classandobjects.day2;

import static com.oops.classandobjects.day2.Employee.*;

public class App {

	/**
	 * public	: this method can be accessible outside the class and package
	 * static	: to call this method using class name and without creating object of this class
	 * void		: returns nothing
	 * main		: name (identifier) of the method
	 * String[]	: array of String
	 * args		: name (identifier) of the arguments
	 */
	public static void main(String[] args) {

		System.out.println("Count = " + getCount());

		Employee emp1 = new Employee(1, "Vijay", 968746.48);
//		System.out.println("Count = " + Employee.count);

		Employee emp2 = new Employee(2, "Ajay");
//		System.out.println("Count = " + Employee.count);

		Employee emp3 = new Employee(3, "Jay");
//		System.out.println("Count = " + Employee.count);

		System.out.println("Count = " + Employee.getCount());

		System.out.println(emp1);
		System.out.println(emp2);
		System.out.println(emp3);

	}

}
