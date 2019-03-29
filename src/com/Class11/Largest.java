package com.Class11;

public class Largest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       //Create an array of integers and find the largest number
	
	  int[] num= {10,20,30,40,100,200};
	  
	  int large=0;
	  
	  for(int i=0; i<num.length; i++) {
		  if(num[i]>large) {
			  large=num[i];
		  }
	  }
	System.out.println(large);
	}

		
		
		
		}


 