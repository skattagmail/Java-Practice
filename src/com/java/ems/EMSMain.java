package com.java.ems;

public class EMSMain {
	
	public static void main(String[] args) {
		System.out.println("ORGANIZATION: " + Employee.orgName);
		Employee emp1 = new Employee();
		emp1.setEmpID(1);
		emp1.setEmpName("Srinivas");
		emp1.setEmpDesignation("Manager");
		emp1.setEmpPhone(2321323);
		emp1.setEmpSal(12500);
		
		emp1.displayEmployeeInfo();
		System.out.println("Varargs");
		
System.out.println(Employee.TotalTeamSal(1250));
System.out.println(Employee.TotalTeamSal(1250,1400));
System.out.println( Employee.TotalTeamSal(1250,1400,1545));
		
		Employee emp2 = new Employee(2,"Madhu","Tech Lead", 4324234, 11500);

		
		emp2.displayEmployeeInfo();		
	}

}
