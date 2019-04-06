package com.javaclass17_2;

import java.util.Scanner;

public class NestedLoopsTask5 {

	public static void main(String[] args) {
	/*Write a guessing game where the user has to guess a secret number between 1 and 20. After every guess input, the program tells the user whether their number was too large or too small. The program will keep asking the user to enter the number until he finds the correct number. When the correct answer is found the system should display "Congratulations!!. You got it!".
	 *  
	 */

		int secretNumber;
		secretNumber = 18;
		int guess;

		do {
			Scanner sc = new Scanner(System.in);
			System.out.println("Guess a Secret Number (1 - 20)");
			guess = sc.nextInt();

			if (guess == secretNumber) {
				System.out.println("Your guess is correct. Congratulations!");
			} else if (guess < secretNumber) {
				System.out.println("Your guess is smaller than secret number");
			} else if (guess > secretNumber) {
				System.out.println("Your guess is greater than secret number");

			}
		} while (guess != secretNumber);
	}
}
		
		
	


