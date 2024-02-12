package com.oops.classandobjects.day2;

public class App {

	public static void main(String[] args) {
		System.out.println("Count = " + Employee.getCount());

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
