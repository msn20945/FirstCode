package com.Class14;

public class InterviewQuestion2 {

	public static void main(String[] args) {
		//2.Write a java program to find the second largest number in the array? Maximum and minimum number in the array?
		int largest = 0;
        int secLarge = 0;
        int smallest = 0;
        int[] array = { 65, 56, 48, 55, 12, 0, 100, 1789, 35 };
        for (int i = 0; i < array.length; i++) {
            if (largest < array[i]) {
                secLarge = largest;
                largest = array[i];
            }

        }
        for (int i = 0; i < array.length; i++) {
            if (smallest > array[i]) {
                smallest = array[i];
            }
        }
        System.out.println(secLarge);
        System.out.println(largest);
        System.out.println(smallest);
    }

}
