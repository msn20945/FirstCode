package com.Class12;
class Main{

	public static void main(String[] args){
	
		int[][] a = {
			{-5,-2,-3,7},
			{1,-5,-2,2},
			{1,-2,3,-4}
		};

	        int z = 0;
            for (int j = 0; j < a.length; j++) {
                for (int i = 0; i < a[j].length; i++) {
                    if ((a[j][i] < 0) && (a[j][i] % 2!=0)) {
                        z = z+1;
                    }
                }
            }
         System.out.println(z);
        }
    

    }
	