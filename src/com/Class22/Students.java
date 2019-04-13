package com.Class22;

public class Students {

	public String studentName;
	public int Chem;
	public int Bio;
	public int Math;

	public Students(int Chemistry, int Biology, int Math) {
		Chem = Chemistry;
		Bio = Biology;
		Math = Math;
	}

	public void avg() {
		int Average = (Chem + Bio + Math) / 3;
		System.out.println(Average);
	}

	public static void main(String[] args) {
		Students student1 = new Students(85, 68, 70);
		System.out.println(student1.studentName = "John");
		student1.avg();
		System.out.println();

		Students student2 = new Students(90, 87, 75);
		System.out.println(student2.studentName = "Mike");
		student2.avg();

		System.out.println();
		Students student3 = new Students(95, 98, 80);
		System.out.println(student3.studentName = "Alex");
		student3.avg();

		System.out.println();
		Students student4 = new Students(100, 96, 85);
		System.out.println(student4.studentName = "Peter");
		student4.avg();

		System.out.println();
		Students student5 = new Students(98, 95, 96);
		System.out.println(student5.studentName = "Matt");
		student5.avg();

	}

}


