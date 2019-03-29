package com.Class6;

import java.util.Scanner;

public class StringSwitch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan;
		String country;
		String favoritefood;

		scan = new Scanner(System.in);
		System.out.println("Please enter which country you are from");
		country = scan.nextLine();

		switch (country) {
		case "USA":
			favoritefood = "Burger";scan
			break;
		case "Afghanistan":
			favoritefood = "Palau";
			break;
		case "Russia":
			favoritefood = "Pelmeni";
			break;
		case "Itlay":
			favoritefood = "Pasta";
			break;
		case "Turkey":
			favoritefood = "Baklava";
			break;
		case "Morocco":
			favoritefood = "Couscous";
			break;
		case "Kazakhstan":
			favoritefood = "Beshparmak";
			break;
		case "Pakistan":
			favoritefood = "Biryani";
			break;
		default:
			favoritefood = "Unknown";

		}
		System.out.println("Your favorite is " + favoritefood);

	}

}
