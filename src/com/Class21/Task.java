package com.Class21;

public class Task {

	private static final String Employee = null;
	String eID;
	  int salary;
		public static String CEO = "Sumair";
		public static void main(String[] args) {

			Employee eID1 = new Employee();
			eID1.eID = "John Smith";
			eID1.salary = 60000;
		
			Employee eID2 = new Employee();
			 eID2.eID = "Jack Smith";
			 eID2.salary = 75000;
			 
			 
			 System.out.println("Employee ID is "+eID1.eID+" his salary is "+eID1.salary+" and his CEO is "+Employee.CEO);
		}
}