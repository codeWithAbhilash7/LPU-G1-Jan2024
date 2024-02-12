package com.oops.classandobjects.day1;

import java.util.Arrays;

public class Student {
	// properties / data members
	int rollNumber;
	String name;
	int[] marks;
	double avg;

	// constructor
	Student() {
		rollNumber = 0;
		name = "";
		marks = new int[2];
		calculateAverage();
	}

	Student(String name, int[] marks) {
		this.rollNumber = -1;
		this.name = name;
		this.marks = marks;
		calculateAverage();
	}

	Student(int rollNumber, String name, int[] marks) {
		this.rollNumber = rollNumber;
		this.name = name;
		this.marks = marks;
		calculateAverage();
	}

	// Behavior / member functions

	public String toString() {
		return "Student [rollNumber=" + rollNumber + ", name=" + name + ", marks=" + Arrays.toString(marks) + ", avg="
				+ avg + "]";
	}

	double calculateAverage() {
		double average = ((marks[0] + marks[1]) / 2.0);
		avg = average;
		return average;
	}
}
