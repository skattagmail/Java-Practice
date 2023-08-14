package com.java.exceptions;

public class ExceptionExample {
	
	public static void main(String[] args) {
		int st1Marks = 500;
		int subjects = 0;
		double avMarks = 0;
		double[] strArr = new double[2];
		
//		try {
//			strArr[3] = st1Marks/subjects;
//			String s=null; 
//			System.out.println(s.length());
//			avMarks = st1Marks/subjects;	
//		} catch(NullPointerException nx) {
//			System.out.println("Accessing Null Object");
//		} catch(ArithmeticException ax) {
//			System.out.println("Divide Exception");
//		} catch(Exception ex) {
//			System.out.println("Exception Occured");
//			ex.printStackTrace();
//		}
		
		try {
			strArr[3] = st1Marks/subjects;
			System.out.println("Exception Handling");
		} catch(Exception ex) {
			System.out.println("Exception Occured");
			ex.printStackTrace();
		}
		
	
		System.out.println("Average Percentage: " + avMarks);
		
		if(st1Marks >= 500) {
			System.out.println("Student Passed in A Grade");
		} else
			System.out.println("Student Not in A Grade");
	}

}
