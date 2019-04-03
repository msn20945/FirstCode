package com.Class14;

public class Interview {
  public static void main(String [] args) {
	  
	  int x=20;
      int y=8;
      System.out.println("Before swapping x = " +x+" And y = "+y);
       x = x + y;
       y = x - y;
       x = x - y;
  System.out.println("After swapping x = " +x+" And y = "+y);

  int x1 = 12;
  int y1 = 8;
  System.out.println("Before swapping x = " + x1 + " And y = " + y1);
  x1 = x1 + y1;
  y1 = x1 - y1;
  x1 = x1 - y1;
  System.out.println("After swapping x = " + x1 + " And y = " + y1);

  String a = "Hello";
  String b = "World";

  System.out.println("Strings before swap: a = " + a + " and b = " + b);
  a = a + b;

  b = a.substring(0, a.length() - b.length());

  a = a.substring(b.length());

  System.out.println("Strings after swap: a = " + a + " and b = " + b);
}
  
  }


	  
 