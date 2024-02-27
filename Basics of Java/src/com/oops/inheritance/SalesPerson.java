package com.oops.inheritance;

public class SalesPerson extends Employee {
	private double incentivePerSale;
	private int noOfSales;

	SalesPerson(String name) {
		this(name, "Undefined", 0.0, 0.0);
	}

	SalesPerson(String name, String address) {
		this(name, address, 0.0, 0.0);
	}

	SalesPerson(String name, double salary, double incentivePerSale) {
		this(name, "Undefined", salary, incentivePerSale);
	}

	SalesPerson(String name, String address, double salary, double incentivePerSale) {
		super(name, salary, address);
		this.incentivePerSale = incentivePerSale;
	}

	@Override
	public String toString() {
		return "SalesPerson [empId=" + super.getEmpId() + ", name=" + super.getName() + ", salary="
				+ this.calculateSalary() + ", incentivePerSale=" + incentivePerSale + ", noOfSales=" + noOfSales
				+ ", address=" + super.getAddress() + "]";
	}

	// method overriding
	@Override
	public double calculateSalary() {
		return super.calculateSalary() + (this.incentivePerSale * this.noOfSales);
	}

	@Override
	public boolean equals(Object obj) {
		return super.getName().equals(((Employee) obj).getName());
	}

	public double getIncentivePerSale() {
		return incentivePerSale;
	}

	public void setIncentivePerSale(double incentivePerSale) {
		this.incentivePerSale = incentivePerSale;
	}

	public int getNoOfSales() {
		return noOfSales;
	}

	public void setNoOfSales(int noOfSales) {
		this.noOfSales = noOfSales;
	}

}
