package com.JavaClass7;

public class CompoundOperators {

	public static void main(String[] args) {
	 
	int a=10;
	a=a=10;
	System.out.println(a);//20
	
	
	int b=100;
	b=b+100;
	System.out.println(b);//200

	int c=100;
	c+=100;//c=c+100;
	System.out.println(c);
	
	c+=35;//c=c+35;
	System.out.println(c);

	c+=50; //c=c+50;
	System.out.println(c);//285
	
	int d=30;
	d-=10;//d=d-10;
	System.out.println(d);
	d+=50;//d=d+50;
	System.out.println(d);
	d/=5;
	System.out.println(d);
	
	d%=4;
	System.out.println(d);
	
	}
	

}
