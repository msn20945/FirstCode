package com.javaclass17_2;

public class nestedloops3 {

	public static void main(String[] args) {
		//99999
		
		nestedloops3 loops3=new nestedloops3();
		loops3.printNumber3();
		
	}
	


void printNumber3() {
	
	for(int a=0; a<=9; a++ ) {
		
		for(int b=0; b<=9; b++)  {
	    
		for(int c=0; c<=9; c++) {
		
		for(int d=0; d<=9; d++) {
		System.out.println(a+""+b+""+c+""+d);	
		}
		
		
		}
		}
		}

	}

}
	
	

