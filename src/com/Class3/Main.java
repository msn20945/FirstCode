package com.Class3;
import java.util.Scanner;
class Main{
public static void main(String [] args){
  
Scanner sc=new Scanner(System.in);
int[] num=new int[5];
for(int i=0; i<num.length;i++){
   num[i]=sc.nextInt();
}
for(int b=0;b<num.length;b++){
  System.out.println(num[b]*10);
}


	
		
	}	
	
}