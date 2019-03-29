package com.Class4;

public class nestedifpractice {

	public static void main(String[] args) {
		/*
		 * check is user has credit card check what is the balance is more than 1000>>>>
		 * payoff
		 */
		boolean creditcard = true;
		int balance = 1000;
		if (creditcard) {
			System.out.println("Let's check the balance");

			if (balance >= 1000) {
				System.out.println("pay off now");
			} else {
				System.out.println("you are safe");
			}
		} else {
			System.out.println("Do you want a credit card");

		}

	}

}
