package com.Class14;

import java.util.Scanner;

public class IQ6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("PLease enter any word to check if it is palidrome!");
		String word = scan.nextLine();

		String reverse = "";

		for (int i = word.length() - 1; i >= 0; i--) {
			reverse += word.charAt(i);
		}

		if (word.equalsIgnoreCase(reverse)) {
			System.out.println("The word is palidrome");

		} else {
			System.out.println("The word is not a palidrome");
		}

	}

}
