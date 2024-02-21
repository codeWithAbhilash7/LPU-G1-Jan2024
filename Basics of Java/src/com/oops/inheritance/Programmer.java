package com.oops.inheritance;

public class Programmer extends Employee {

	Programmer(String name) {
		this(name, "Undefined", 0.0);
	}

	Programmer(String name, String address) {
		this(name, address, 0.0);
	}
	
	Programmer(String name, double salary) {
		this(name, "Undefined", salary);
	}

	Programmer(String name, String address, double salary) {
		super(name, salary, address);
	}

	@Override
	public String toString() {
		return "Programmer [empId=" + getEmpId() + ", name=" + getName() + ", salary=" + getSalary() + ", address="
				+ getAddress() + "]";
	}

}
