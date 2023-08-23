package com.basicjava.secondclass;

public class LocalVariablesDemo {
	public void displayCollegeInfo(String collegeName, int phoneNo) {
		
		String hodName = "Ram Pandey";
		System.out.println("Hod Name : "+hodName);
		System.out.println("College Name : "+collegeName);
		System.out.println("Phone No : "+phoneNo);
	}
	public static void main(String[] args) {
		
		 String collegeName = "Texas International College";
		 int phoneNo = 123456;
		
		 //Object or instance in java
		LocalVariablesDemo localVariablesDemo = new LocalVariablesDemo();
		
		//calling method having arguments
		localVariablesDemo.displayCollegeInfo(collegeName, phoneNo);
	}
	
	
}
