package com.Class14;

import java.util.Scanner;

public class IQ7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int number;
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter a number to check if it is a prime number");
		number = input.nextInt();
		boolean prime = true;
		for (int i = 2; i < number; i++) {
			if (number % i != 0) {
			
			} else {
				prime = false;
				break;
			}

		}

		System.out.println(prime);

	}

}
