package com.JavaClass7;

import java.util.Scanner;

public class ScannerAndLoop {

	public static void main(String[] args) {
		/*
		 * Prompt user to ask the name 3 times and print"You are doing great____"
		 * 
		 */
     
		Scanner scan;
		String name;
		int a=1;
		
		while(a<=3) {
			System.out.println("Please enter your name");
			scan=new Scanner(System.in);
			name=scan.nextLine();
			System.out.println("You are doing great "  +name);
			a++;
			
	
		}
		
		
		
	}

}
