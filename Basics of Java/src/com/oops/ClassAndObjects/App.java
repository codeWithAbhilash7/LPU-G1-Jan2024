package com.oops.ClassAndObjects;

public class App {

	public static void main(String[] args) {
		// object = instance of a class
		// object of Student class
//		Student s1 = new Student();
//
//		s1.rollNumber = 10;
//		s1.name = "Sachin";
//		s1.marks = new int[2];
//		s1.marks[0] = 65;
//		s1.marks[1] = 66;
//		s1.calculateAverage();
//		s1.print();
//
//		// object of Student class
//		// Student s2 = new Student();
//		s1 = new Student();
//		s1.rollNumber = 11;
//		s1.name = "Shardul";
//		s1.marks = new int[2];
//		s1.marks[0] = 56;
//		s1.marks[1] = 78;
//		s1.calculateAverage();
//		s1.print();

		Student s1 = new Student();
		s1.rollNumber = 11;
		s1.name = "Shardul";
		s1.marks[0] = 56;
		s1.marks[1] = 78;
		s1.calculateAverage();
		System.out.println(s1);

		int marks[] = { 68, 98 };
		Student s2 = new Student(12, "Akash", marks);
		System.out.println(s2);
		
		marks[0] = 89;
		marks[1] = 47;
		Student s3 = new Student("Sanjay", marks);
		System.out.println(s3);
	}

}
