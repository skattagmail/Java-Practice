package com.java.inheritance;

public class Tablet extends Mobile, Computer{
	
	public static void main(String[] args) {
		Tablet tb = new Tablet();
		tb.makeVoiceCalls();
	}

}
