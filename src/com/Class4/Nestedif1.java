package com.Class4;

public class Nestedif1 {

	public static void main(String[] args) {
		/*
		* declare variable for gpa and having a diploma
		* if user has a diploma-> congratulations --> if gpa is higher 3.5--> hire person
		*                                             else do not hire.
		*/
		  
		 double gpa=3.6;
		  double expectedGpa=3.7;
		   boolean hasDiploma=true;
		        
		   if (hasDiploma) {
		   System.out.println(�Congratulations�);
		   if (gpa>expectedGpa) {
            System.out.println(�You are hired�);
		     }else {
		     system.out.println(�Unfortunately we cannot hire you�);
		                }
		      }else {
		     System.out.println(�Please get your degree�);{
		        }
