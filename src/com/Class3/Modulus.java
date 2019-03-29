package com.Class3;

public class Modulus {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 10;
		int b = 3;
		int div = a / b;
		System.out.println(div);// 3 or 3.3

		// modulus operator

		int mod = a % b;
		System.out.println(mod);

		int q = 101;
		int w = 10;

		System.out.println(q % w);

		int e = -5 + 4 * 6;
		// Parentheses;Exponents;Multiplication/Division,Addition/Subtraction
		System.out.println(e);
		int x = (22 + 9) % 7;
		System.out.println(x);

		int y = 20 + -3 * 5 / 8;
		System.out.println(y);

		int z = 5 + 15 / 3 * 2 - 8 % 3;
		System.out.println(z);
     
	}

}
