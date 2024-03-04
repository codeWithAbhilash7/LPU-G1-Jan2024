package com.oops.abstractclass;

public class Circle extends Shape {
	private double radius;

	public Circle(double radius) {
		this.radius = radius;
	}

	@Override
	public double area() {
		// return 3.14 * radius * radius;
		return Math.PI * Math.pow(radius, 2);
	}
}
