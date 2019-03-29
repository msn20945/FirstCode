package com.Class4;

public class task4 {

	public static void main(String[] args) {
    double mortageRate=4.8;
    int mortagePrice=3000000;
    if(mortageRate>4.5) {
    System.out.println("I am not buying the house");
    }else {
    System.out.println("I will consider buying the house");
    if(mortagePrice > 200000) {
    System.out.println("I will take a loan");
    }else {
    System.out.println("I will pay cash");
    }
    
    }
    

	}

}
