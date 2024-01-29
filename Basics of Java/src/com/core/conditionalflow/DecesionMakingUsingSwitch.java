package com.core.conditionalflow;

public class DecesionMakingUsingSwitch {

	public static void main(String[] args) {
		char grade = 'C';

		// byte, short, int, char, String, enum
		switch (grade) {
		case 'A':
			System.out.println("You got grade A...");
			break; // optional

		case 'B':
			System.out.println("You got grade B...");
			break;

		case 'C':
			System.out.println("You got grade C...");
			break;

		default:
			System.out.println("Default case :: You got grade D...");
		}

		if (grade == 'A') {
			System.out.println("You got grade A...");
		} else if (grade == 'B') {
			System.out.println("You got grade B...");
		} else if (grade == 'C') {
			System.out.println("You got grade C...");
		} else {
			System.out.println("Default case :: You got grade D...");
		}
	}

}
