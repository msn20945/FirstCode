package com.Class6;

import java.util.Scanner;

public class Snippet {
	public static void main(String[] args) {
	        
	        Scanner scan;
	        int score;
	        String eligibility;
	        boolean Loan=true;
	        
	        scan = new Scanner (System.in);
	        System.out.println("Do you need a loan?");
	        score=scan.nextInt();
	        Loan=scan.nextBoolean();
	        eligibility=scan.nextLine();
	        
	        if (Loan) {
	         System.out.println("What is your credit score?");
	        
	        if (score<600) {
	        eligibility="Not Eligible";}
	        
	        else if(score>600 && score<=700){
	        
	          eligibility="Maybe Eligible";
	        
	        }else if (score>701 && score<=800) {
	            
	          eligibility="Eligible";}
	            
	        else if (score>800) {
	            eligibility="Definitely  Eligible";}
	            
	      }else {
	            eligibility="Unkown";}
	        
	            System.out.println("The eligibility is" + eligibility);
	            
	        }
	        
	    
	            
	            
	        }


