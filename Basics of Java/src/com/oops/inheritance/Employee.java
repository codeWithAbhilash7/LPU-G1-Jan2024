package com.oops.inheritance;

public class Employee extends Person {
	private int empId;
	private double salary;

	private static int nextId;

	static {
		nextId = 100;
	}

	// constructors
	public Employee(String name) {
		this(name, 0.0);
	}

	public Employee(String name, double salary) {
		this(name, salary, "Undefined");
	}

	public Employee(String name, String address) {
		this(name, 0.0, address);
	}

	public Employee(String name, double salary, String address) {
		super(name, address);
		this.salary = salary;
		this.empId = ++nextId;
	}

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", name=" + getName() + ", salary=" + salary + ", address=" + getAddress()
				+ "]";
	}


	public double calculateSalary() {
		return this.salary - 200;
	}

	public int getEmpId() {
		return empId;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public static int getEmployeeCount() {
		return nextId - 100;
	}

}
