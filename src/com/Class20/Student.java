package com.Class20;

public class Student {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Student obj = new Student();

		System.out.println("Student's grade is " + obj.getGrade(90));

	}

	char getGrade(int score) {
		char grade = 0;

		if (score > 90) {
			grade = 'A';
		} else if (score > 80) {
			grade = 'B';
		} else if (score > 70) {
			grade = 'C';
		} else if (score > 50) {
			grade = 'D';
		} else {
			grade = 'F';
		}
		return grade;
	}
}
