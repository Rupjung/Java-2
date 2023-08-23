package com.basicjava.thirdclass;

import com.basicjava.secondclass.InstanceVariableDemo;

public class AccessingVariables {
	public static void main(String[] args) {
		InstanceVariableDemo obj = new InstanceVariableDemo();
		
		//public variables can be access from outside the class
				System.out.println("Email: "+obj.email);
	}
}
