package com.core.nestedclasses.innerclass;

public class App {

	public static void main(String[] args) {
		Outer o = new Outer();
		System.out.println(o);
//		Outer.Inner i = new Outer.Inner();
//		System.out.println(i);
		
		Outer.i.getInnerData();
		
		System.out.println(o.getI());
	}

}
