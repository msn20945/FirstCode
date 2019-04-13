package com.Class22;

public class StaticVsNonStatic {
public static String name="John";
public static String lastName="Snow";

public static void main(String[] args) {
		// TODO Auto-generated method stub

	StaticVsNonStatic obj =new StaticVsNonStatic();
	obj.getInfo();
	System.out.println(obj.name);
	
	getInfo1(); // Within same class we can call it by using method/variable name
	System.out.println(lastName);
	}
  // non static method- can access both instance and static variables
  public void getInfo() {
	  System.out.println("My name is "+name+" and my last name is "+lastName);
 //getInfo1(); we can access static methods within non static
  }

  // static method can have an access only to static variables
  public static void getInfo1() {
  //System.out.println("My name is "+name+" and my last name is "+lastName);
  //Will get an error
	 
  }
}

