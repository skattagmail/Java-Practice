package com.java.loops;

public class ForLoopExample {
	
	public static void main(String[] args) {
		String[] fruits = new String[5];
		fruits[0] = "Mango";
		fruits[1] = "Sapota";
		fruits[2] = "Guava";
		fruits[3] = "Water melon";
		fruits[4] = "Musk Melon";
		
	
		
		//Basic For Loop		
		for(int i=0;i < fruits.length ; i++) {		// i++ = i = i + 1
			System.out.println(fruits[i] + " is an Fruit");
		}
		
		System.out.println("------------------------------------");
		//Advanced for Loop
		for(String s: fruits) {
			System.out.println(s);
		}
		
		
	}

}
