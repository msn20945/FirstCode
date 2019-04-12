package com.Class21;

public class Car {


		// TODO Auto-generated method stub

	public String color;
	public static int totalCars;
	
		
		public static void main(String[] args) {	
	
		Car Car1=new Car();
		Car1.color="white";
		totalCars++;
		
	Car Car2= new Car();
	Car2.color="black";
	totalCars++;
	
	
		System.out.println("Total car we made is "+ Car2.totalCars);	
			
	}

}
