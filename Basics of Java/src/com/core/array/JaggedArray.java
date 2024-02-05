package com.core.array;

import java.util.Arrays;

public class JaggedArray {

	public static void main(String[] args) {
		int numbers[][] = new int[3][];

		numbers[0] = new int[5];
		numbers[1] = new int[8];
		numbers[2] = new int[2];

		int element = 1;
		for (int i = 0; i < numbers.length; i++) {
			for (int j = 0; j < numbers[i].length; j++) {
				numbers[i][j] = element++;
			}
		}

		for (int i = 0; i < numbers.length; i++) {
			System.out.println(Arrays.toString(numbers[i]));
		}
	}

}
