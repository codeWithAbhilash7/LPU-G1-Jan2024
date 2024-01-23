package com.core.methods;

public class StackAndHeapMemory {

	public static void doubleIt(int[] arr) {
		print(arr);
		for (int i = 0; i < arr.length; i++) {
			arr[i] *= 2;
		}
		print(arr);
	}
	
	public static void print(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(" " + arr[i]);
		}
		System.out.println();
	}

	public static void changeIt(int number) {
		System.out.println("Line no :: 6 \t number = " + number); // 10
		number = 50;
		System.out.println("Line no :: 8 \t number = " + number); // 50
	}

	public static void main(String[] args) {
		int no = 10;
		System.out.println("Line no :: 13 \t number = " + no); // 10
		changeIt(no);
		System.out.println("Line no :: 15 \t number = " + no); // 10

		int[] arr = { 1, 2, 3, 4 };
		print(arr);
		doubleIt(arr);
		print(arr);
	}

}
