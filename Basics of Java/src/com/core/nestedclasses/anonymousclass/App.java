package com.core.nestedclasses.anonymousclass;

import com.oops.lambdas.Greet;

public class App {

	public static void main(String[] args) {

		// anonymous classes
		Greet g = new Greet() {

			@Override
			public void greet(String name) {
				System.out.println("Hello, " + name);

			}
		};

		g.greet("Jay");

	}

}
