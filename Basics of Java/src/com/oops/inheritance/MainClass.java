package com.oops.inheritance;

public class MainClass {

	public static void main(String[] args) {
//		Employee e1 = new Employee("Nikita", 54788.54);
//		e1.setAddress("Mumbai");
//		System.out.println("Salary=" + e1.calculateSalary());
		
		Employee e1 = new Programmer("Nikita", 54788.54);
		e1.setAddress("Bengaluru");
		System.out.println("Salary=" + e1.calculateSalary());	
		

		System.out.println("Total Employee Count = " + Programmer.getEmployeeCount());
	}

}
