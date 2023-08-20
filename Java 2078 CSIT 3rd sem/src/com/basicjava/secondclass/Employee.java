package com.basicjava.secondclass;

public class Employee {
	public void displayInfo(String firstName,String middleName,String lastName, int age, double salary)
	{
		System.out.println("Employee information:");
		System.out.println("First Name : "+firstName);
		System.out.println("Second Name : "+middleName);
		System.out.println("Last Name : "+lastName);
		System.out.println("Age : "+age);
		System.out.println("Salary : "+salary);
	}
	public static void main(String[] args) {
		String firstName = "Rup";
		String middleName = "Jung";
		String lastName = "Malla";
		int Age=20;
		double salary=10000;
		
		Employee employeeinfo = new Employee();
		employeeinfo.displayInfo(firstName, middleName, lastName, Age, salary);
	}

}
