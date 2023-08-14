package com.java.strings;

public class StringExample {
	
	public static void main(String[] args) {
		String str = "Welcome";
		System.out.println("str Value: " + str);
		
		str = "Welcome to Java";
		System.out.println("str Value: " + str);
		
		str = "Welcome to Java Srinivas";
		System.out.println("str Value: " + str);
		
		String str1 = "Welcome";
		
		String str2 = "Welcome";
		
		
		String str3 = new String("Welcome");
		
		System.out.println("EQUALS METHOD: " + str2.equals(str1));
		System.out.println("== METHOD: " + (str2 == str1));
	}

}
