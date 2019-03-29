package com.Class12;

import java.util.Scanner;

public class StringManipulationTask1 {

	public static void main(String[] args) {
		// Accept username, password and confirm password and check following
		// requirements:
		// Username and Password cannot be empty, if so→ message=”Username and Password
		// cannot be empty”.
		// Password should be minimum 8 characters, if less → message=”Password is too
		// short”.
		// Password cannot contain username if so, → message=”Password cannot contain
		// username”.
		// Password should match confirmed password, if not → message “Passwords do not
		// match”.
		// Only after all requirements met → message “Your username and password has
		// been created”

		Scanner scan;

		String username, password, confirmPassword;

		scan = new Scanner(System.in);
		System.out.println("Please enter username");
		username = scan.nextLine();
		System.out.println("Please enter password");
		password = scan.nextLine();
		System.out.println("Please confirm password");
		confirmPassword = scan.nextLine();
		if (!(username.isEmpty() && password.isEmpty())) {
			if (password.length() >= 8) {
				if (!(password.contains(username))) {
					if (password.equals(confirmPassword)) {
						System.out.println("Your username and password has been created");
					} else {
						System.out.println("Password do not match");
					}

				} else {
					System.out.println("Password cannot contain username");
				}

			} else {
				System.out.println("Password is too short");
			}

		} else {
			System.out.println("username and password cannot be empty");

		}

	}
}
