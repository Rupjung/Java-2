package com.basicjava.secondclass;

public class InstanceVariableDemoAccessedFromAnotherClass {
	public static void main(String[] args) {
		InstanceVariableDemo obj = new InstanceVariableDemo();
		
		//default, public, protected, public variable can be accessed from outside of the class
		System.out.println("Email: "+obj.email);
		System.out.println("Email: "+obj.gender);
		System.out.println("Email: "+obj.phoneNo);
	}
}
