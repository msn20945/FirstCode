package com.class5;

import java.util.Scanner;

public class CondtionsAll {

	public static void main(String[] args) {
		/*
		 * Ask user to enter price and boolean value for sale Based on the sale we will
		 * check the price; if price<20 >>> apply discount 20% and give final price if
		 * price>20 less 100>>> apply discount 30% and give final price if price is >100
		 * less 500>>> apply discount 50% give final price
		 * 
		 */
		Scanner scan;
		boolean sale;
		int discount;
		int price;
		double finalPrice = 0;
		scan = new Scanner(System.in);
		System.out.println("Please enter if there is a sale");
		sale = scan.nextBoolean();
		System.out.println("Please enter price of the item");
		price = scan.nextInt();
		if (sale) {
			System.out.println("Let's check all discounts");
			if (price < 20) {
				discount = 20;
				finalPrice = price - (price * 0.2);
			} else if (price >= 20 && price < 100) {
				discount = 30;
			} else if (price >= 100 && price < 500) {
				discount = 50;
				finalPrice = price - (price * 0.5);
			} else {
				discount = 75;
				finalPrice = price - (price * 0.75);
				   
			}
			System.out.println("The final price is" +finalPrice);
			
		} else {
			System.out.println("Not interested");
			
		
		}
	}

}
