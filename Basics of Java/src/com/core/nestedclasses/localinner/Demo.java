package com.core.nestedclasses.localinner;

public class Demo {
	private int data = 10;

	// a class inside a method is local inner class
	public void display() {

		class LocalInnerClass {
			void print() {
				System.out.println("Good morning..");
			}
		}

//		LocalInnerClass ob = new LocalInnerClass();
//		ob.print();

		// anonymous objects
		new LocalInnerClass().print();

	}

	@Override
	public String toString() {
		return "Demo [data=" + data + "]";
	}

}
