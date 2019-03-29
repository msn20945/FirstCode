package com.Class6;

import java.util.Scanner;

public class taskreview {

	public static void main(String[] args) {
		Scanner scan;
		boolean snow, rain, sunny;
		int temp;
		String activity;

		scan = new Scanner(System.in);
		System.out.println("Input the temperature");
		temp = scan.nextInt();

		if (temp >= 40 && temp <= 80) {
			System.out.println("Is it raining?");
			rain = scan.nextBoolean();
			if (rain) {
				activity = "Watch a movie";
			} else {
				activity = "Go hiking";

			}
		} else if (temp >= 25 && temp < 40) {
			System.out.println("Is it Snowing");
			snow = scan.nextBoolean();

			if (snow) {
				activity = "Snowboarding";
			} else {
				activity = "More coding";

			}
		} else if (temp >= 80) {
			System.out.println("Is is Sunny");
			sunny = scan.nextBoolean();

			if (sunny) {
				activity = "Go to beach";
			} else {
				activity = "more coding";

			}
		} else {
			System.out.println("Please enter different temperature");
			activity = "Unknow";

		}
		System.out.println("Todays activity is "+ activity);
	}
}
