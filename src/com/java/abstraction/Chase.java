package com.java.abstraction;

public abstract class Chase extends FederalBank{
	public void provideHomeLoans() {
		System.out.println("Rate of Interest is 4.5%");
		System.out.println("the Annual Income should be > 60K");
	}
	
	public abstract void providePhoneBanking();

}
