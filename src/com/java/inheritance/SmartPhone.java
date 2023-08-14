package com.java.inheritance;

public class SmartPhone extends Mobile { //Single Inheritance
	
	String resolution;
	int cameras;
	
	public void sendPictures() {
		System.out.println("We can take pictures");
	}
	
	public void useWhatsApp() {
		System.out.println("We can make WhatsApp Calls");
	}
	
	
}
