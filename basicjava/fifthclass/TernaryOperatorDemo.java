package com.basicjava.fifthclass;

public class TernaryOperatorDemo {
	public static void main(String[] args) {
		int num1=10;
		int num2=4;
		
		//condition : true statement : false statement
		String message=(num1>num2)? num1+" is greater than "+num2 : num1+" is greater than "+num2;
		System.out.println(message);
	}
}
