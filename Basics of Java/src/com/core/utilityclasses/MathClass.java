package com.core.utilityclasses;

public class MathClass {

	public static void main(String[] args) {
		System.out.println("PI = " + Math.PI);

		System.out.println("sqrt(25) = " + Math.sqrt(25));
		System.out.println("pow(7, 3) = " + Math.pow(7, 7));

		System.out.println("ceil(5.68) = " + Math.ceil(5.68));
		System.out.println("floor(5.68) = " + Math.floor(5.68));

		System.out.println("\nround(5.68) = " + Math.round(5.68));
		System.out.println("round(5.15) = " + Math.round(5.15));

		// random
		System.out.println("\nrandom = " + Math.random()); // 0 - 1
		int min = 0;
		int max = 100;
		System.out.println("random = " + Math.random() * (max - min + 1) + min); // random value between 0 - 100

		System.out.println("\nmax(15, 20) = " + Math.max(15, 20));
		System.out.println("min(15, 20) = " + Math.min(15, 20));

	}

}
