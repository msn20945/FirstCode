package com.Class14;

public class InterviewQuestion5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String reverse3="";
		String Original = "Today is Java Class";
		
		//System.out.println(original.length());
		for (int i=Original.length(); i>0; i--) {
			reverse3=reverse3+Original.substring(i-1, i);
		}
		System.out.println("Reversed String is: "+reverse3);

		String str="Im so happy today";
        String[]array=str.split("\\s+");
        System.out.println(array.length);

        String[] words=str.split(" ");
        String revString="";
        
        for ( int i=0; i<words.length;i++) {
            String word=words[i];
            String revWord="";
        
        for (int j=word.length()-1; j>=0; j--) {
            revWord=revWord+word.charAt(j);
        }
        revString=revString+revWord+" ";}
        System.out.println(revString);
        
            }
        }


		
