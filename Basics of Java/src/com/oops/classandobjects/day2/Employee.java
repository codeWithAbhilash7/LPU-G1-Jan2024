package com.oops.classandobjects.day2;

public class Employee {
	private int id;
	private String name;
	private double salary;

	private static int count = 0;

//	public Employee() {
//		this.id = 0;
//		this.name = "undefined";
//		this.salary = 0.0;
//	}

	public Employee(int id, String name) {
//		this.id = id;
//		this.name = name;
//		this.salary = 0.0;
		this(id, name, 0.0); // constructor chaining
	}

	public Employee(int id, String name, double salary) {
		this.id = id;
		this.name = name;
		this.salary = salary;
		count++;
	}

	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}

	// setters / mutator
	public void setName(String name) {
		this.name = name;
	}

	public void setSalary(double salary) {
		if (this.salary < 0) {
			// BL
			System.err.println("Error :: Salary cannot be less than zero.");
			return;
		}
		this.salary = salary;
	}

	// getter / accessor
	public int getId() {
		return this.id;
	}

	public String getName() {
		return name;
	}

	public double getSalary() {
		return salary;
	}

	public static int getCount() {
		return count;
	}

}
