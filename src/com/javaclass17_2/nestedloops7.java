package com.javaclass17_2;

public class nestedloops7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  for(int i=0; i<5; i++) {
  for(int y=0; y<=6;y++ ) {
	 if(i==0|| i==4|| y==0||y==6) {
		 System.out.print("*");
	 }else {
		 System.out.print(" ");
	 }
   }
  System.out.println();
  }
  	}
}	