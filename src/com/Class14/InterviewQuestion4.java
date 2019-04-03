package com.Class14;

public class InterviewQuestion4 {

	public static void main(String[] args) {
    
		String name = "Tayyab is nice";
        boolean contains = true;
        String[] array = name.split("is");
        System.out.println("The length is " + array.length);

        if (name.contains("is")) {
            System.out.println(contains);
        } else {
            System.out.println("false");
        }

    }
	      

}

