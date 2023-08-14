package com.java.interfaces;

public class BOA implements FedBank, USGovt{

	public void provideHomeLoans() {
		System.out.println("Rate of Interest is 3.5%");
		System.out.println("the Annual Income should be > 80K");
	}
	public void providePhoneBanking() {
		System.out.println("Phone Banking Provided");
	}
	public void provideEduLoans() {
		System.out.println("Rate of Interest is 3.5%");
		System.out.println("the Annual Income should be > 80K");
	}
}
