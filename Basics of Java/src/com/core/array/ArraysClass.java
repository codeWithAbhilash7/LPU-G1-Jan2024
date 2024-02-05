package com.core.array;

import java.util.Arrays;

public class ArraysClass {

	public static void main(String[] args) {
		int[] arr = { 87, 65, 98, 65, 78, 57 };
		int[] arr2 = { 87, 65, 98, 65, 78, 57 };
		System.out.println("Initial Array = " + Arrays.toString(arr));
		System.out.println("Compare = " + Arrays.compare(arr, arr2));

		System.out.println("Equals = " + Arrays.equals(arr, arr2));
		Arrays.sort(arr);
		System.out.println("Sorted Array = " + Arrays.toString(arr));
		System.out.println("Binary Search 78 = " + Arrays.binarySearch(arr, 78));
	}

}
