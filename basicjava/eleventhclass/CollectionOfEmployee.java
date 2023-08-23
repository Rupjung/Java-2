package com.basicjava.eleventhclass;

public class CollectionOfEmployee {
	public static void main(String[] arg) {
	
	Employee[] employees = new Employee[2];
	
	Employee employee1 = new Employee();
	employee1.setEmployeeName("Ram Pandey");
	employee1.setAddress("Kathmandu");
	employee1.setEmail("rampandey123@gmail.com");
	employee1.setEmployeePhoneNo("9842288555");
	employee1.setEmployeeSalary(100000);
	employees[0]=employee1;
	
	Employee employee2 = new Employee();
	employee2.setEmployeeName("Rup jung");
	employee2.setAddress("Itahari");
	employee2.setEmail("rupjung123@gmail.com");
	employee2.setEmployeePhoneNo("9867993111");
	employee2.setEmployeeSalary(200000);
	employees[1]=employee1;
	
	Employee emp = new Employee();
	
	System.out.println("Employee Details:");
	for (int i=0;i<2;i++) {
		emp=employees[i];
		System.out.println("Name: "+emp.getEmployeeName());
		System.out.println("Address: "+emp.getAddress());
		System.out.println("Email: "+emp.getEmail());
		System.out.println("Phone No: "+emp.getEmployeePhoneNo());
		System.out.println("Salary : "+emp.getEmployeeSalary());
		System.out.println();
		
	}
	}
	
}
