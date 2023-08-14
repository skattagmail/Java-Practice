package com.java.abstraction;

public abstract class FederalBank {
	String address;
	
	
	//abstract method 
	public abstract void provideHomeLoans();
	
	public abstract void providePhoneBanking();
	
	
	//Concrete Method OR Non-abstract method
	public void checkCustomerEligibility() {
		System.out.println("Customer should valid Residential status");
	}
	

}
