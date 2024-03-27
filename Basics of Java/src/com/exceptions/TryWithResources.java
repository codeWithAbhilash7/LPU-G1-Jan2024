package com.exceptions;

import java.util.Scanner;

public class TryWithResources {

	public static void main(String[] args) {

		try (Scanner sc = new Scanner(System.in)) { // try-with-resources
			System.err.print("Try Block - ");
			System.out.println("You can use resorces (scanner class object) here. It will get closed automatically.");
		} catch (Exception e) {
			System.err.print("Catch Block - ");
			System.out.println("Resorces (scanner class object) can not be used here.");
		} finally {
			System.err.print("finally Block - ");
			System.out.println("Resorces (scanner class object) can not be used here.");
		}

	}

}
