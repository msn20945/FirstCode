package com.Class11;

public class Recap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Lets's create an array of names and retrieve all values from it
		// 1. Create an array with new keyword

		String[] names = new String[7];

		names[0] = "Asel";
		names[1] = "Alexander";
		names[2] = "Arif";
		names[3] = "Weqas";
		names[4] = "Bilal";
		names[5] = "Shiva";
		names[6] = "Muhammad";
		for (int i = 0; i < names.length; i++) {
			System.out.println(names[i]);
		}

		// 2. create an array using array literal
		// 0 1 2 3 4 5
		String[] studentNames = { "Shaban", "Bilal", "Mehmet", "Zaki", "Samir", "Frank" };
		for (int i = 0; i <= studentNames.length - 1; i++) {
			System.out.println(studentNames[i]);
		}

		// retrieve values using: advanced for loop, for each loop, enhanced for loop

		for (String student : studentNames) {
			System.out.println(student);
		}

	}

}
