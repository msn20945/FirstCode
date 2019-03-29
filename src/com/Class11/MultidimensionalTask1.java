package com.Class11;

public class MultidimensionalTask1 {

	public static void main(String[] args) {
		//// Create a 2D array where you still store the following values: Mr,Mrs,Ms, Miss and Smith

		String[][] groups = { { "Mr", "Mrs", "Ms", "Miss" }, { "Smith", "Jordan", "Jackson", "Obama" }, };
        System.out.println(groups[0][1] + " " + groups[1][0]);
        System.out.println(groups[0][1] + " " + groups[1][3]);
        System.out.println(groups[0][2] + " " + groups[1][2]);
        System.out.println(groups[0][3] + " " + groups[1][1]);
    }
}
		

