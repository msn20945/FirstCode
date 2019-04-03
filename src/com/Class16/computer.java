package com.Class16;

public class computer {

boolean mouse,keyboard;

String os;

int screen, ram;

String brand;
	
	public static void main(String [] args) {
		
	computer comp1=new computer();
		
	comp1.mouse=true;
	comp1.keyboard=true;
	comp1.screen=2;
	comp1.ram=8;
	comp1.os="Windows";
	comp1.brand="HPOmen";

	comp1.watchMovie();
	comp1.doJavacoding();
	comp1.playMusic();

	
	computer comp2 = new computer();
    comp2.mouse = false;
    comp2.keyboard = false;
    comp2.screen = 4;
    comp2.ram = 6;
    comp2.os = "Mac OS";
	comp2.brand="Apple";
	
	comp2.watchMovie();
	comp2.doJavacoding();
	comp2.playMusic();

		
	}

	void watchMovie() {
		System.out.println("We can watch movie on a computer " +brand);
	}
	
	void doJavacoding(){
		System.out.println("We can do Java coding on our computer "+brand);
	}
	
	void playMusic() {
		System.out.println("We can play music on our computer "+brand);
	}
	
	
}
