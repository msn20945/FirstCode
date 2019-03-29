package com.Class3;

public class relationaloperators {

	public static void main(String[] args) {
		int a = 198;
		int b = 501;
		boolean result = a > b;
		boolean result1 = a == b;
		System.out.println(result);
		System.out.println(result1);
		// compare 2 number and if a is larger than b >>> print

		if (a!=b) { // It will only print when the statement is true
			System.out.println("Hello ");
		}

	else {
			System.out.println("Bye");
		}

		//declare price and if price is higher than expected price>>> I will not buy the shoes
		
		double shoesPrice=32.99;
		double allowedPrice=31.99;
		
		if (shoesPrice<=allowedPrice) {
		System.out.println("I am buying those shoes");
		}else {
			System.out.println("I am NOT buying those shoes");
			System.out.println("I am conitnues code");
			System.out.println("I am conitnues code");
			System.out.println("I am conitnues code");
		}
	}
}	
		
		

	


