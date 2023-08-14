package com.java.ems;
/**
 * 
 * @author skatt
 *
 */

public class Employee {
	//Class is a Blueprint or Template
	// Class will have attributes(Fields/Variables) and Behaviour (Methods/Functionality)
	//Attributes/Variables/Fields
	//Instance Variables (Non-static variables)
	private int empID;
	private String empName;
	private String empDesignation;
	private int empPhone;
	private float empSal;
	final double pi = 3.14;
	
	
	public int getEmpID() {
		return empID;
	}

	public void setEmpID(int empID) {
		this.empID = empID;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public String getEmpDesignation() {
		return empDesignation;
	}

	public void setEmpDesignation(String empDesignation) {
		this.empDesignation = empDesignation;
	}

	public int getEmpPhone() {
		return empPhone;
	}

	public void setEmpPhone(int empPhone) {
		this.empPhone = empPhone;
	}

	public float getEmpSal() {
		return empSal;
	}

	public void setEmpSal(float empSal) {
		this.empSal = empSal;
	}

	public static String getOrgName() {
		return orgName;
	}

	public static void setOrgName(String orgName) {
		Employee.orgName = orgName;
	}

	public void calculateBonus() {
		float bonus = this.empSal * 2.0f;
	}


	static String orgName = "Verizon";
	
	
	
	//Default or No-argument constructor
	public Employee() {
		System.out.println("Employee Default Constructor");
	}
		
	// Argument Constructor
	public Employee(int empID, String empName, String empDesignation, int empPhone, float empSal) {
		super();
		System.out.println("Employee Argument Constructor");
		this.empID = empID;
		this.empName = empName;
		this.empDesignation = empDesignation;
		this.empPhone = empPhone;
		this.empSal = empSal;
	}




	public void displayEmployeeInfo() {
		int hours = 8;
		System.out.println("Employee Information: " );
		System.out.println("Emp ID: " + this.empID);
		System.out.println("Emp Name: " + this.empName);
		System.out.println("Emp Designation: " + this.empDesignation);
		System.out.println("Emp Phone: " + this.empPhone);
		System.out.println("Emp Salary: " + this.empSal);
		System.out.println("Emp Organization: " + this.orgName);
		System.out.println("-----------------------------");
	}
	
//	public static void main(String[] args) {
//		Employee emp1 = new Employee();
//		emp1.empID = 1;
//		emp1.empName = "Srinivas";
//		emp1.empDesignation= "Manager";
//		emp1.empPhone=2321323;
//		emp1.empSal = 12500;
//		
//		emp1.displayEmployeeInfo();
//		
//		emp1.displayEmployeeInfo();
//	}
	
//	public float TotalTeamSal(float Sal) {
//		return Sal;
//	}
//	public float TotalTeamSal(float Sal1,float Sal2) {
//		return Sal1 + Sal2;
//	}
//	public float TotalTeamSal(float Sal1,float Sal2, float Sal3) {
//		return Sal1 + Sal2 + Sal3;
//	}

	public static float TotalTeamSal(float i, float...js ){
		System.out.println("First Method");
	    float sum = i;
	    for(float x : js){
	        sum+=x;
	    }
	    return sum;
	}

}

