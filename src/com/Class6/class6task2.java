package com.Class6;

import java.util.Scanner;

public class class6task2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan;
		String country;
		String Language;
		scan = new Scanner(System.in);
		System.out.println("Please enter where you are from");
		country = scan.nextLine();

		switch (country) {
		case "USA":
			Language = "English";
			break;
		case "Afghanistan":
			Language = "Arabic";
			break;
		case "Russia":
			Language = "Russian";
			break;
		case "Itlay":
			Language = "Itlanian";
			break;
		case "Turkey":
			Language = "Turkish";
			break;
		case "Morocco":
			Language = "Arabic";
			break;
		case "Kazakhstan":
			Language = "Russian";
			break;
		case "Pakistan":
			Language = "Urudu";
			break;
		default:
			Language = "Unknown";

		}
		System.out.println("Your favorite is " + Language);

	}

}


