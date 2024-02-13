package com.core.strings;

public class StringBuilderClass {

	public static void main(String[] args) {
		
		// string buffer is mutable
		// not synchronized
		StringBuilder sb = new StringBuilder("welcome");
		System.out.println("length = " + sb.length());
		System.out.println("capacity = " + sb.capacity());

		System.out.println("Append = " + sb.append(" to StringBuffer."));
		System.out.println("char at 5 = " + sb.charAt(5));
		System.out.println("index of = " + sb.indexOf("o"));
		System.out.println("reverse = " + sb.reverse());

	}

}
