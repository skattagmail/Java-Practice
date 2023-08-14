package com.java.loops;

public class WhileLoopExample {
	
	public static void main(String[] args) {
		
		int i = 0;
		System.out.println("Break......");
		while(i <= 10) {
			System.out.println(i);
			if (i %2 == 0)
					break;			
			i++;
		}

		System.out.println("Continue..........");
	
		while(i <= 10) {
			i++;
			if (i == 4)
					continue;
			if (i %2 == 0)
				System.out.println(i + " is an even number");
			else
				System.out.println(i + " is an Odd number");	

		}
		
		System.out.println("End of the Program");
//		do {
//			System.out.println(i);
//			if (i %2 == 0)
//					break;			
//			i++;			
//		}while(i <= 10);
		
	}

}
