package com.javaclass17_2;

import java.util.Scanner;

public class returnvalue {

	public static void main(String[] args) {
		returnvalue obj = new returnvalue();
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter First number");
		int a = sc.nextInt();
		System.out.println("Please enter Second number");
		int b = sc.nextInt();
		System.out.println(obj.sum(a, b));
//		obj.sum(12, 13);
//		obj.sum(100, 100);

	}

	 int sum(int x, int y) {
		System.out.println(x + y);
		
		return x+y;
	}

	void sum() {
		int a = 10, b = 12;
		System.out.println(a + b);
	}
}