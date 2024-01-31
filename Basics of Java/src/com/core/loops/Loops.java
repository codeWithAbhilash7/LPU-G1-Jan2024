package com.core.loops;

//import java.util.Scanner;

public class Loops {

	public static void main(String[] args) {

//		int i = 1;
//		
//		while(i < 10) {
//			System.out.println(i);
//			++i;
//		}

//		for (int i = 1; i <= 10; ++i) {
//			System.out.println(i);
//		}
//
//		int i = 1;
//		for (; i <= 10 && i >= 1;) {
//			System.out.println(i);
//			i++;
//		}

		// 1, 10, 2, 9, 3, 8, 4, 7, 5, 6
//		for (int i = 1, j = 10; i <= 5 && j >= 5; ++i, --j) {
//			System.out.print(i + " ");
//			System.out.print(j + " ");
//		}

		// 1, 10, 2, 9, 3, 8, 4, 7, 5, 6
//		for (int i = 1; i <= 5; ++i) {
//			System.out.print(i + " " + (11 - i) + " ");
//		}

//		Scanner sc = new Scanner(System.in);
//		char choice = 'N';
//		do {
//			System.out.println("Hello.. do you want to continue??");
//			choice = sc.next().charAt(0);
//		} while (choice == 'Y' || choice == 'y');
//		sc.close();

		// System.exit(1);
		// 0 --> successful
		// 1 --> unsuccessful
		// -1 --> unsuccessful with an exception

		
		for (int i = 1; i <= 10; ++i) {
			if (i == 6) {
				// break;
				// continue;
				// System.exit(1);
			}
			System.out.print(i + " ");
		}
	}

}
