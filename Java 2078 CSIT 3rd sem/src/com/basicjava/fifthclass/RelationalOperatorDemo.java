package com.basicjava.fifthclass;

import java.util.Scanner;

public class RelationalOperatorDemo {
	public boolean equals(int num1,int num2) {
		return num1==num2;
	}
	public boolean notEquals(int num1, int num2) {
		return num1!=num2;
	}
	public boolean greater(int num1, int num2) {
		return num1>num2;
	}
	public boolean lesser(int num1,int num2) {
		return num1<num2;
	}
	public boolean greaterEquals(int num1, int num2) {
		return num1>=num2;
	}
	public boolean lesserEquals(int num1, int num2) {
		return num1<=num2;
	}
	public static void main(String[] args) {
		int num1, num2;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter first number:");
		num1=scanner.nextInt();
		
		System.out.println("Enter second number:");
		num2=scanner.nextInt();
		
		RelationalOperatorDemo obj = new RelationalOperatorDemo();
		
		System.out.println(num1+" == "+num2+" : "+obj.equals(num1,num2));
		
		System.out.println(num1+" != "+num2+" : "+obj.notEquals(num1,num2));
		
		System.out.println(num1+" > "+num2+" : "+obj.greater(num1,num2));
		
		System.out.println(num1+" < "+num2+" : "+obj.lesser(num1,num2));
		
		System.out.println(num1+" >= "+num2+" : "+obj.greaterEquals(num1,num2));
		
		System.out.println(num1+" <= "+num2+" : "+obj.lesserEquals(num1,num2));
		
		scanner.close();
		
	}
}
