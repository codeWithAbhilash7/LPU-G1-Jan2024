package com.core.conditionalflow;

public class DecesionMakingUsingIf {

	public static void main(String[] args) {
//		System.out.println("Hello!!!");

		// if-else
//		int age = 15;
//
//		if (age >= 18) {
//			System.out.println("Your are eligible...");
//		} else {
//			System.out.println("Your are NOT eligible...");
//		}

//		int marks = 15;

		// if-else ladder
//		if (marks >= 75) {
//			System.out.println("Grade A");
//		} else if (marks >= 65) {
//			System.out.println("Grade B");
//		} else if (marks >= 55) {
//			System.out.println("Grade C");
//		} else if (marks >= 45) {
//			System.out.println("Grade D");
//		} else {
//			System.out.println("Grade E");
//		}

		// nested if-else
//		int age = 20;
//		char gender = 'M';
//
//		if (gender == 'F') {
//			if (age >= 18) {
//				System.out.println("Your are eligible...");
//			} else {
//				System.out.println("Your are NOT eligible...");
//			}
//		} else if (gender == 'M') {
//			if (age >= 21) {
//				System.out.println("Your are eligible...");
//			} else {
//				System.out.println("Your are NOT eligible...");
//			}
//		}

		// ternary operator
		int number1 = 30;
		int number2 = 20;
		int number3 = 20;

		int max = number1 > number2 ? (number1 > number3 ? number1 : number3) : 
			(number2 > number3 ? number2 : number3);

//		int diff = 0;
//		
//		if(number1 > number2) {
//			diff = number1 - number2;
//		} else {
//			diff = number2 - number1;
//		}

		int diff = number1 > number2 ? number1 - number2 : number2 - number1;

		System.out.println(diff);

//		System.out.println("Good bye!!!");
	}

}
