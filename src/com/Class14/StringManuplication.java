package com.Class14;

public class StringManuplication {

	public static void main(String[] args) {

		// 1 replace()
	String str="I am good tester";
	String newstr=str.replace("a", "e");
	
	String newStr1=str.replace("good","great");
	System.out.println(newStr1);
	 // what we are looking for to replace, new value
    String newStr2=str.replace("tester", "programmer");
    System.out.println(newStr2);
    
    String newStr3=str.replace("Tester", "programmer");
    System.out.println(newStr3);
    
    str=str.replace("!", "?");
    System.out.println(str);
	
  //2 replaceAll() - will replace all that matches specified pattern[regex];
	
  		String str1="12Hello 3234 World 465%^%";
  		String replacedNoNumbers=str1.replaceAll("[0-9]", "");
  		System.out.println(replacedNoNumbers);
  		
  		String newString=replacedNoNumbers.replaceAll("[^A-Z a-z]", "");
  		System.out.println(newString);
  		
//  		String replacedNoCharacter=replacedNoNumbers.replaceAll("[A-Za-z]", "");
//  		System.out.println(replacedNoCharacter);
  		
  		String str2="1Hello123";
  		System.out.println(str2.replaceAll("[^0-9]", ""));
	
	
	}

}
