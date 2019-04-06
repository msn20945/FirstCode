package com.javaclass17_2;

public class nestedloops2 {

	public static void main(String[] args) {
		// 24 hours, 60 minutes

		nestedloops2 loops2=new nestedloops2();
		loops2.printNumber2();
		
		
	}
		

				
		void printNumber2()	{
			
			
			for (int h = 0; h < 24; h++) {

				for (int m = 0; m < 60; m++) {

					if (m < 10) {
						System.out.println(h + ":0" + m);
					} else {
						System.out.println(h + ":" + m);
					}
				
				
			}
			
		}
	}
}