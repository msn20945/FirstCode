package com.javaclass9;

import java.util.Scanner;

public class nestedloopsTask2 {

	public static void main(String[] args) {
		/**
		 * Ask user to enter the item they want to buy and the price for the item. Then
		 * ask user to pay for it. Every time user enters money accumulate the amount
		 * and tell user how much is left to pay off the amount. Whenever user done with
		 * payments tell them "Thank you for shopping!"
		 * 
		 */

		String item;
		int price, pay;
		int remain = 0;
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter what you want to buy");
		item = scan.nextLine();
		System.out.println("Please enter the item price");
		price = scan.nextInt();

		for (int a = 0; a < 20; a++) {
			System.out.println("Please enter how much you will pay");
			pay = scan.nextInt();
			remain = price - pay;
			if (remain > 0) {
				System.out.println("You need to pay " + remain + " more");
				price = remain;
			} else if (remain <= 0) {
				System.out.println("Thank you for shopping");
				break;
			}
		}

	}

}
