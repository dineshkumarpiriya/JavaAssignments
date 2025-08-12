package com.blcelc;

//BLC
public class EmployeeDetails {
	String name;
	int id;
	int salary;
	int age;
	public void initialize(String name,int id,int salary,int age) {
		
		 this.name=name;
		 this.id=id;
		 this.salary=salary;
		 this.age=age;
		
	}
	public int calcSalary() {
		return salary*12;
	}
	
	
	public String display() {
		return "name :"+ name+
				"\nage :"+age+
				"\nsalary :"+salary+
				"\nage :"+age+
				"\nannual salary :"+calcSalary();
	}
}
