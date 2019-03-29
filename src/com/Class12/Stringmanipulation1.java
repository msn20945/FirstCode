package com.Class1--2;

public class Stringmanipulation1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str="Good morning, students!";
		boolean contains=str.contains("students");
		System.out.println(contains);
		
		String present="Welcome, Mehmet5465464";
		String neededValue="Welcome,";
		
		boolean flag=present.contains(neededValue);
		System.out.println(flag);
		
		boolean flag1=present.toUpperCase().contains(neededValue);
		System.out.println(flag1);
		
		String str1="syntax";
		boolean starts=str1.startsWith("s");
		System.out.println(starts);
		
		System.out.println(str1.endsWith("y"));
		 
        String str2="Hello";
        boolean isEmpty=str2.isEmpty();
        System.out.println(isEmpty);
	
	String str3="Hello";
	String str4="Ali!";
	
	System.out.println(str3+str4);
	
	//trim()--> will remove spaces at the beginning and at the end of your String
    System.out.println("_______--________");
    String expected="You may qualify for a multi-policy discount!";
    String actual=" You may qualify for a multi-policy discount!";
    
    actual=actual.trim();
    System.out.println(expected.equals(actual));
	
		
	}
	

}
