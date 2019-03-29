package com.Class8;

public class class8TASk1 {
	public static void main(String[] args) {

		for (int a = 1; a <= 100; a++) {
			System.out.println(a);

			for (int x = 100; x >= 1; x--) {
				System.out.print(x);

				for (int i = 1; i <= 20; i++) {
					if (i % 2 != 0) {
						System.out.println(i + "");

						for (int c = 20; c >= 50; c++) {
							if (c % 2 == 0)
								System.out.println(c + "");

							for (int d = 20; c >= 50; d++) {
								if (d % 2 != 0) {
									System.out.println(d + "");
								}
							}

						}
					}

				}

			}

		}

	}

}
