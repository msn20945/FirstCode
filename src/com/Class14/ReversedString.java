package com.Class14;

public class ReversedString {
public static void main(String[] args) {

	// 3 using substring()
			String reverse3="";
			String Original = "Today is Java Class";
			
			//System.out.println(original.length());
			for (int i=Original.length(); i>0; i--) {
				reverse3=reverse3+Original.substring(i-1, i);
			}
			System.out.println("Reversed String is: "+reverse3);





}
}