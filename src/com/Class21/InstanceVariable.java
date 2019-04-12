package com.Class21;

public class InstanceVariable {


		// TODO Auto-generated method stub

		String name="John";// instance variable can have access modifiers
		
			public static void main(String[] args) {
		
		String name="Anna";
		System.out.println(name);
		System.out.println("---Changing value of local variable---");
		name="Olga";
	  System.out.println(name);
	
		InstanceVariable obj=new InstanceVariable();
		System.out.println(obj.name);
		System.out.println("---Changing value of local variable---");
		obj.name="Jack";
		System.out.println(obj.name);
		InstanceVariable obj1=new InstanceVariable();
		System.out.println(obj1.name);
			
	}
    public void hello(String name) {
    	System.out.println("Hello" +name);
    }
}
