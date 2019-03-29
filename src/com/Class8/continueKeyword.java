package com.Class8;

public class continueKeyword {

	public static void main(String[] args) {
		for (int i = 0; i < 6; i++) {
			if (i == 5) {
				continue;
			}
			System.out.println(i);

			for (int i1 = 0; i1 <= 10; i1++) {

				if (i1 == 2 || i1 == 3) {
					continue;
				}
				System.out.println(i1);

				System.out.println("I am outside of foor loop");
				/* I want to print number from 1 to 20 but skip those that divisible by3 */

				for (int a = 1; a <= 20; a++) {

					if (a % 3 == 0) {
						continue;
					}

					System.out.println(a);
				}

			}

		}

	}
}