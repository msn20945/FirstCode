package com.Class6;
import java.util.Scanner; 
class Main {
 //write code below
 public static void main(String [] args) {
  Scanner scan;
  int rollnumber;
  string studentName;
  scan= new Scanner(System.in);
  System.out.println("enter the roll number of the Child");
  rollnumber=scan.nextInt();
  
  switch(rollnumber) {
   case 101:
     studentName="Ramesh";
     break;
   case 102:
     studentName="Mahesh";
     break;
     case103:
     studentName="Mukesh";
     default:
    studentName="Not found Student name: in Class";
 }
  System.out.println(studentName);
 }
}