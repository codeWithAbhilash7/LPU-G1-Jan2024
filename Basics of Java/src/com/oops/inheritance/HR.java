package com.oops.inheritance;

public class HR extends Employee {
	private double incentive;

	HR(String name) {
		this(name, "Undefined", 0.0, 0.0);
	}

	HR(String name, String address) {
		this(name, address, 0.0, 0.0);
	}

	HR(String name, double salary) {
		this(name, "Undefined", salary, 0.0);
	}

	HR(String name, double salary, double incentive) {
		this(name, "Undefined", salary, incentive);
	}

	HR(String name, String address, double salary, double incentive) {
		super(name, salary, address);
		this.setIncentive(incentive);
	}

	@Override
	public String toString() {
		return "HR [empId=" + super.getEmpId() + ", name=" + super.getName() + ", salary=" + this.calculateSalary()
				+ ", incentive=" + incentive + ", address=" + super.getAddress() + "]";
	}

	@Override
	public double calculateSalary() {
		return super.calculateSalary() + this.incentive;
	}

	public double getIncentive() {
		return incentive;
	}

	public void setIncentive(double incentive) {
		this.incentive = incentive;
	}
}
