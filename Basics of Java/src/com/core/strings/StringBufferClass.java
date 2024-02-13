package com.core.strings;

public class StringBufferClass {

	public static void main(String[] args) {

		// string buffer is mutable
		// synchronized
		StringBuffer buffer = new StringBuffer("welcome");
		System.out.println("length = " + buffer.length());
		System.out.println("capacity = " + buffer.capacity());
		
		System.out.println("Append = " + buffer.append(" to StringBuffer."));
		System.out.println("char at 5 = " + buffer.charAt(5));
		System.out.println("index of = " + buffer.indexOf("o"));
		System.out.println("reverse = " + buffer.reverse());
	}

}
