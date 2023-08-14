package com.java.controlflow;

public class IfExample {
	
	public static void main(String[] args) {
		int percentage = 20;
		String grade="";
		
//		if(percentage >=90) {
//			grade = "A+";
//			System.out.println("the student Grade is : " + grade);
//		} else if(percentage < 90 && percentage >= 70) {
//			grade = "A";
//			System.out.println("the student Grade is : " + grade);
//		} else if(percentage < 70 && percentage >= 50) {
//			grade = "B";
//			System.out.println("the student Grade is : " + grade);
//		} else {
//			System.out.println("The student did not met the Pass criteria");
//		}
	
		if(percentage >=50) {
			if(percentage >=90) {
				grade = "A+";
				System.out.println("the student Grade is : " + grade);
			} else if(percentage < 90 && percentage >= 70) {
				grade = "A";
				System.out.println("the student Grade is : " + grade);
			} else if(percentage < 70 && percentage >= 50) {
				grade = "B";
				System.out.println("the student Grade is : " + grade);
			}
		} else {
			System.out.println("The student did not met the Pass criteria");
		}
		
	}

}
