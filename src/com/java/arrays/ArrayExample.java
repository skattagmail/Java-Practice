package com.java.arrays;

import java.util.Date; //Built-in Package
import com.java.ems.Employee; //User Defined Package

public class ArrayExample {
	
	public static void main(String[] args) {
		
		Employee emp1 = new Employee();
		
		Date today = new Date();
		
		System.out.println(today);
		
		int empID;
		int[] empIDs = new int[5];
		empIDs[0] = 100;
		empIDs[1] = 101;
		empIDs[2] = 102;
		empIDs[3] = 103;
		empIDs[4] = 104;

		System.out.println(empIDs[0]);
		System.out.println(empIDs[1]);
		System.out.println(empIDs[2]);
		System.out.println(empIDs[3]);
		System.out.println(empIDs[4]);
		
		empIDs = new int[6];
		
		System.out.println(empIDs[0]);
		System.out.println(empIDs[1]);
		System.out.println(empIDs[2]);
		System.out.println(empIDs[3]);
		System.out.println(empIDs[4]);
		
		int[][] mdArray = new int[4][3];
		
		
	}

}
