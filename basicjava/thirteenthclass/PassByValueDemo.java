package com.basicjava.thirteenthclass;

public class PassByValueDemo {
	public void getData(int num1, int num2) {
		num1=num1+5;
		num2=num2+10;
	}
	
	public static void main(String[] args) {
		int num1=20;
		int num2=30;
		
		
		
		System.out.println("Before Num1: "+num1);
		System.out.println("Before Num2: "+num2);
		
		PassByValueDemo demo = new PassByValueDemo();
		demo.getData(num1, num2);
		
		System.out.println("After Num1: "+num1);
		System.out.println("After Num2: "+num2);
		
	}
}
