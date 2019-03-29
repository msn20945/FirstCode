package com.javaclass9;

public class nestedloops5 {

	public static void main(String[] args) {
		/* I want to print pattern
		 * 543321
		 * 543321
		 * 543321
		 * 543321
		 */
     
		for (int i=0; i<4; i++) {
		for(int a=5; a>0; a--)  {
			System.out.print(a);
		}
	        System.out.println();
		}
	}

}


