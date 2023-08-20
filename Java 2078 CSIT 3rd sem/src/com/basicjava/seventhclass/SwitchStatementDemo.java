package com.basicjava.seventhclass;

public class SwitchStatementDemo {
	public static void main(String[] args) {
		int data=10;
		
		switch (data) {
		case 1: 
			System.out.println("Inside the case 1");
			break;
		case 9:
			System.out.println("Inside the case 9");
			break;
		case 10:
			System.out.println("Inside the case 10");
			break;
		/*case 10: Compile time error
			System.out.println("Inside the case 10");
			break;*/
		default:
			System.out.println("Not valid input");
		}
	}

}
