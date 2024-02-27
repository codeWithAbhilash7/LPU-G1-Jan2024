package com.oops.aggregation;

public class MainClass {
	public static void main(String[] args) {
		Person p1 = new Person("Rohit", new Address("Pune", "MH", 411001));

		System.out.println(p1);
		// System.out.println(p1.getAddress().getCity());

		Person p2 = new Person("Sanjay", "Mumbai", "MH", 400001);
		System.out.println(p2);

		p2.getAddress().setPincode(500145);
		p2.getAddress().setCity("Bengaluru");
		p2.getAddress().setState("KA");

		System.out.println(p2);
	}
}
