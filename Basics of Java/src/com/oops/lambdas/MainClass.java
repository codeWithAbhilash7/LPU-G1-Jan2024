package com.oops.lambdas;

// option 1 
class GreetHello implements Greet {
	@Override
	public void greet(String name) {
		System.out.println("Hello, " + name);

	}
}

public class MainClass {

	public static void main(String[] args) {
//		GreetHello hello = new GreetHello();
//		hello.greet("Rakesh");

		// option 2 - anonymous class
		// anonymous classes
//		Greet g = new Greet() {
//
//			@Override
//			public void greet(String name) {
//				System.out.println("Hello, " + name);
//			}
//		};
//
//		g.greet("Jay");

		Greet g = (name) -> System.out.println("Hello, " + name);

	}

}
