package com.Class17;

public class Task2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   
   String a ="Mom";
   Task2 obj=new Task2();
   obj.palidrome(a);
	
	
	}

	
void palidrome(String a) {
	String reverse ="";
	for(int i=a.length()-1; i>=0; i--) {
		reverse+= a.charAt(i);
		
	}
	if(reverse.equalsIgnoreCase(a)) {
		System.out.println("It is a palidrome");
	
	}else {
		System.out.println("It is not a palidrome");
	}
}

}
	
	

