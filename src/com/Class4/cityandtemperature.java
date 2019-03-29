package com.Class4;

import java.util.Scanner;

public class cityandtemperature {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String cityName;
		int temp;

		Scanner myScanner = new Scanner(System.in);
		System.out.println("Please enter your city");
		cityName = myScanner.nextLine();
		System.out.println("Please enter temperature in Fahrenheit");
		temp = myScanner.nextInt();
		// formula (F-32) x5/9;
		int convertedTemp = (temp - 32) * 5 / 9;
		System.out.println(convertedTemp);
		System.out.println("the temperature in the city "+cityName+" is "+convertedTemp);
	}

}
