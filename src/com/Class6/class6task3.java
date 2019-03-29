package com.Class6;

import java.util.Scanner;

public class class6task3 {

	public static void main(String[] args) {
		Scanner scan;
		double num1, num2, result;
		char oper;
		scan = new Scanner(System.in);
		System.out.println("please enter first number");
		num1 = scan.nextDouble();
		System.out.println("please enter second number");
		num2 = scan.nextDouble();
		System.out.println("please enter operator you are using");

		oper = scan.next().charAt(0);

		switch (oper) {
		case '+':
			result = num1 + num2;
			break;
		case '-':
			result = num1 - num2;
			break;
		case '*':
			result = num1 * num2;
			break;
		case '/':
			result = num1 / num2;
			break;
		default:
			System.out.println("Unknown");
			result = 0;

		}
		System.out.println("The result is " + result);
	}

}
