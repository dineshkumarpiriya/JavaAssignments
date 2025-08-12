package com.blcelc;

//ELC
public class Employee {
	public static void main(String[] args) {
		EmployeeDetails emp=new EmployeeDetails();
		emp.initialize("Dinesh kumar",127,25000,22);
		System.out.println(emp.display());
	String eligibility=emp.age>18?"eligible to vote":"not eligible to vote";
	System.out.println(eligibility);
	String crossed35=emp.age>35?"crossed 35":"not crossed 35";
	System.out.println(crossed35);
		
	}

}
