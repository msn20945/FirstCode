package com.class5;

import java.util.Scanner;

public class excerciseclass5 {
	public static void main(String[] args) {

		int height = 12;

		Scanner sc= new Scanner(System.in);
		System.out.println( "enter height");
		height=sc.nextInt();

		if (height <= 5) {
			System.out.println("You are a short person");
		} else if (height > 5 && height <= 6) {
			System.out.println("You are a medium height person");
		} else {
			System.out.println("You are a tall height person");

		}

	}

}
