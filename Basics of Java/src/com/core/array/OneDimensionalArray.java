package com.core.array;

public class OneDimensionalArray {

	public static void main(String[] args) {
		int[] marks = { 65, 87, 69, 47, 68 };

		// int[] marks = new int[5];
		// marks[0] = 65;
		// marks[1] = 78;
		// marks[2] = 57;
		// marks[3] = 35;
		// marks[4] = 49;

//		System.out.println("Element at 0 index is = " + marks[0]);
//		System.out.println("Element at 1 index is = " + marks[1]);
//		System.out.println("Element at 2 index is = " + marks[2]);
//		System.out.println("Element at 3 index is = " + marks[3]);
//		System.out.println("Element at 4 index is = " + marks[4]);

//		for (int i = 0; i < marks.length; i++) {
//			System.out.println("Element at " + i + " index is = " + marks[i]);
//		}
		
//		int index = 0;
//		while(index < marks.length) {
//			System.out.println(marks[index++]); 
//		}

		// for each loop
		for (int m : marks) {
			System.out.print(m + " ");
		}
	}

}
