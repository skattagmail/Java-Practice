package com.java.strings;

public class StringExample2 {
	public static void main(String[] args) {
		String firstName = "Srinivas";
		String lastName = "Katta";
		String middleName = "R";
		
		String fullName = firstName.concat(middleName).concat(lastName);
		
		String fullName2 = String.join(" ", firstName,middleName,lastName);
		System.out.println("My Full Name is: " + fullName);
		System.out.println("My Full Name is: " + fullName2);

		
		String fullName1 = firstName + lastName;
		
		System.out.println("My Full Name is: " + fullName1);
		
		String str = "Welcome to Java Training on Core Java";
		
		String substr = str.substring(11);
		System.out.println(substr);
		
		String str1 = "  Srinivas  Katta";
		System.out.println(str1);
		System.out.println(str1.trim());
		
		String Technology = "Java,PHP,Python,Coldfusin,.net";
		String[] str4 = Technology.split(",");
		System.out.println(str4[0]);
		System.out.println(str4[1]);

		System.out.println(str4[2]);

		System.out.println(str4[3]);

		System.out.println(str4[4]);

	}
}
