package com.Class17;

public class Greeting1 {

public static void main(String []args) {
	Greeting1 obj=new Greeting1();
    obj.askHowAreYou("Moe");
    obj.askHowAreYou("Danny");
}

void askHowAreYou(String name) {
	System.out.println("How are you "+name);
}

void askHowareYou1(String name) {
	System.out.println("How are you "+name);
}
}
