package com.oops.aggregation;

public class Person {
	private String name;
	private Address address; // aggregation/containment/composition --> HAS-A relation

	public Person(String name, Address address) {
		super();
		this.name = name;
		this.address = address;
	}

	public Person(String name, String city, String state, int pincode) {
		super();
		this.name = name;
		this.address = new Address(city, state, pincode);
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", address=" + address + "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}
}
