package com.oops.lambdas;

@FunctionalInterface
interface Addition {
	int add(int no1, int no2);
}

public class Demo {

	public static void main(String[] args) {
//		Addition add = (a, b) -> {
//			return a + b;
//		};
		
		Addition add = (a, b) -> a + b;

		System.out.println(add.add(15, 30));
	}

}
