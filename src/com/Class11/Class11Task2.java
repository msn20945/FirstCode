package com.Class11;

public class Class11Task2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       // Create an array of countries. While retrieving all values from an array point capital for each country use 2 different loops.
		
String[] country= {"Colombia", "USA", "Spain"};
        
        for(int i=0; i<=country.length-1; i++) {
            System.out.println(country[i]+"'s");
            
            if(country[i].equals("Colombia")) {
                System.out.println("Capital is Bogota");
                
            }else if (country[i].equals("USA")) {
                System.out.println("Captial is Washington D.C");
                
            }else if (country[i].equals("Spain"))
                System.out.println("Captial is Madrid");
            
            
        }
        System.out.println("--------------------------- 2nd ------------------------------");
        
        for(int i=0; i<=country.length-1; i++) {
            System.out.println(country[i]+"'s");
            
            switch (country[i]) {
            
            
            case "Colombia":
                System.out.println("Capital is Bogota");
                break;
            case "USA":
                System.out.println("Captial is Washington D.C");
                break;
            case "Spain":
                System.out.println("Capital is Madrid");
                break;
            default:
                System.out.println("Error");
                break;
        }
        
    }
}
}



