package com.class5;

import java.util.Scanner;
class Main {
 public static void main(String[] args) {
   Scanner scan;
   boolean weekend=true;
   String subject="";
  
  
   scan=new Scanner(System.in);
   System.out.println("Is is weekend");
   weekend=scan.nextBoolean();
   if(weekend){
     subject="Java";
 }else{
   subject="Manual testing";
   
 }
 System.out.println("Today you will be learning "+subject);
}
}