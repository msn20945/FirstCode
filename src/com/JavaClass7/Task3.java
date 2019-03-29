package com.JavaClass7;

public class Task3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean WorkDay = true;
		int day = 1;
		while (WorkDay) {
			System.out.println("I need a day off");
			day++;

			if (day == 6) {
				WorkDay = false;

			}

		}
		System.out.println("I dont need a day off");
	}

}
