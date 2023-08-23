package com.basicjava.thirteenthclass;

public class ConstructorDemo {
	private String name;
	private String address;
	private int age;
	private double salary;
	
	//No-arg constructor
	public ConstructorDemo(){
		name="Rupjung";
		address="Itahari";
		age=20;
		salary=120000.0;
		this.displayData();
		}
	
	//parameterized constructor
	public ConstructorDemo(String name, int age, String address) {
		System.out.println("Inside the parameterized constructor");
	}
	
	
	public void displayData() {
		System.out.println("Name: "+name);
		System.out.println("Address: "+address);
		System.out.println("Age: "+age);
		System.out.println("Salary: "+salary);
	}
	public static void main(String[] args) {
		new ConstructorDemo();
		
		new ConstructorDemo("Ram Pandey",13,"Ktm");
	}
}
