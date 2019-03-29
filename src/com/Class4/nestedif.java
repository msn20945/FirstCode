package com.Class4;

public class nestedif {

	public static void main(String[] args) {
		/*
		 * write a program to check work eligibility
		 * if user is younger than <16 >>>> not allowed to work
		 * otherwise >>> allow to work. if user is younger than 64>>>> go to work
		 * otherwise>>>> enjoy your life
		 */
		
		int age=18;
		int eligibleAge=16;
		int retirementAge=64;
		if(age<eligibleAge) {
		System.out.println("You are too young, no work for you");
		}else {
		System.out.println("You are eligible to work");
	
		if(age<retirementAge) {
		System.out.println("Go work hard");
		}else {
		System.out.println("Please enjoy your life.You do need to work");
		
		}
		}
	}

}







