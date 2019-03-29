

package com.javaclass9;

import java.util.Scanner;
public class nestedloopsTask1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/* Write a program that reads a set of intergers, provided by a user and then prints the sum of even and odd intergers.
 * 
 */
		int start, end;
		int sumeven = 0;
		int sumodd = 0;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter range");
		start = sc.nextInt();
		end = sc.nextInt();
		
		for (int i = start; i<=end; i++) {
			if (i %2 ==0) {
				sumeven+=i;
			}else {
				sumodd+=i;
			}
			
		}
		System.out.println("The sum of even integers from "+ start + " to " +end + " is "+sumeven);
		System.out.println("The sum of odd integers from "+ start+ " to " +end + " is "+sumodd);
	}
}