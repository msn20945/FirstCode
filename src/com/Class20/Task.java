package com.Class20;

public class Task {

	public static void main(String[] args) {
 
		Task obj = new Task();
		
		System.out.println(obj.createEmail("muhammad",  "Nasir" , "@gmail.com"));
			
	}
	
	String createEmail(String name, String lastName, String emailType ) {
		String type ="@gmail.com";
		String emailAdress=name+lastName+type;
		return emailAdress;
}

	

	
		
		
		
		
	
}
      
	