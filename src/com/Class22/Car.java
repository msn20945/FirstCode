package com.Class22;

public class Car {

public static String make="Toyota";

String color;
String model;
int doors;
boolean engine;
Car(){ //Constructor
	System.out.println("I am a Constructor");
    System.out.println("Hello from constructor");
}


public static void main(String []args) {
	Car obj=new Car();
	System.out.println(obj.color);
	System.out.println(obj.doors);
	System.out.println(obj.engine);
   // hello();
}
   public static void hello() {
	  //before using local variable we have to initialize it
	   
	   String name;
	 // System.out.println(name); compiler will give you an error
	   
	   System.out.println("I am a Static hello method");
   }
	}


