package com.oops.abstractclass;

public class MainClass {

	public static void main(String[] args) {
		// Shape s = new Shape(10);
		Shape s = new Circle(10);
		System.out.println("Area=" + s.area());
	}

}
