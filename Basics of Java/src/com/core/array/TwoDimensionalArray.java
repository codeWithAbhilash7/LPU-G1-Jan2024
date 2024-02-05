package com.core.array;

import java.util.Arrays;

public class TwoDimensionalArray {

	public static void main(String[] args) {
		// int numbers[][] = { { 1, 2, 3, 4, 5, 6, 7 }, { 4, 5, 6, 7 }, { 8, 9, 5, 4, 6,
		// 3 } };
		int numbers[][] = new int[3][3];

		int element = 1;
		for (int i = 0; i < numbers.length; i++) {
			for (int j = 0; j < numbers[i].length; j++) {
				numbers[i][j] = element++;
			}
		}

		// System.out.println(numbers[1][2]);

//		for (int i = 0; i < numbers.length; i++) {
//			for (int j = 0; j < numbers[i].length; j++) {
//				System.out.print(numbers[i][j] + " ");
//			}
//			System.out.println();
//		}

		for (int i = 0; i < numbers.length; i++) {
			System.out.println(Arrays.toString(numbers[i]));
		}

	}

}
