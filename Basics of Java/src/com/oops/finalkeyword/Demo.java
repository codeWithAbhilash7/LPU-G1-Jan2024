package com.oops.finalkeyword;

public class Demo {
	private final int FINAL;
	public final static double STATICFINAL = 5547.56;

	// final int intValue = 10; // initialize at the time of declaration

	// initialize using initializer block
	{
		FINAL = 12;
	}

	// initialize using constructor
	Demo() {
		// intValue = 12;
	}

	public int getIntValue() {
		return FINAL;
	}

	// final methods can not be overridden by child/derived classes
	public final void finalMethod() {
		System.out.println("Final method from Demo class");
	}

}
