package com.Class22;

public class Child2 extends Parent  {

	
	
	String hairType="curly";
	
	public static void main(String[] args) {
		
		Child2 childObject=new Child2();
		System.out.println("Child 2 eye color "+childObject.eyeColor);
		System.out.println("Child 2 hair color "+childObject.hairColor);
		System.out.println("Child 2 has "+childObject.nose+" nose");
		childObject.sing();
		childObject.canSwim();
		
		Parent parentObject=new Parent();
		//parentObject.hairType --> not accessible in Parent Class
		//parentObject.playTennis()--> not accessible in Parent Class
		

	}

	public void canSwim() {
		System.out.println("Child 1 can Swim");
	}
}
	
