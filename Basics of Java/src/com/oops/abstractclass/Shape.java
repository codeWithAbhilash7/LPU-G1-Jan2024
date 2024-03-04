package com.oops.abstractclass;

// class having at least one abstract method is abstract class
public abstract class Shape {

	public Shape() {

	}

	public Shape(int area) {

	}

	// method having no definition is an abstract method
	public abstract double area();

	// concrete - methods having some definition
	public void printMsg() {
		System.out.println("Pring this from Shape (abstract) class");
	}

}
