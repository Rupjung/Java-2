package com.basicjava.secondclass;

public class InstanceVariableDemo {
	private String name;
	private double salary;
	private int age;
	protected char gender;
	public String email;
	String phoneNo;
	
	public static void main(String[] args){
		InstanceVariableDemo instanceVariableDemo = new InstanceVariableDemo();
		
		System.out.println("Default value for instance variable set by Java");
		System.out.println("Salary: "+instanceVariableDemo.salary);
		System.out.println("Age: "+instanceVariableDemo.age);
		System.out.println("Gender: "+instanceVariableDemo.gender);
		System.out.println("Email: "+instanceVariableDemo.email);
		System.out.println("Phone number: "+instanceVariableDemo.phoneNo);
	}
}
