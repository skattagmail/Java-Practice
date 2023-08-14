package com.java.ems;

public class Recruiter extends Employee implements Runnable{
	
	// Method Overriding
	

	public void calculateBonus1() {
		float bonus = this.getEmpSal() * 2.5f;
	}
	
	public static void main(String[] args) {
		Recruiter rec = new Recruiter();
//		rec.pi = 5.15;
	}

}
