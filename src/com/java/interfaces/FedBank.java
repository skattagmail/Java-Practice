package com.java.interfaces;

public interface FedBank {
	
	String address="";
	
	
	//abstract method 
	void provideHomeLoans();
	
	void providePhoneBanking();
	
	
	
	default void bankTimings() {
		System.out.println("Please publish Working schedule of your Bank");
	}
}
