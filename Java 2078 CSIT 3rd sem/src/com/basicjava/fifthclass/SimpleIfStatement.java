package com.basicjava.fifthclass;
import java.util.Scanner;

public class SimpleIfStatement {
	public static void main(String[] args) {
		//simple
		//if(condition){
		//}
		
		int num1=100;
		if (num1>200) {
			System.out.println("Inside the if block...");
		}
		System.out.println("Outside the if block...");
		
		System.out.println("Enter a number: ");
		Scanner scanner = new Scanner(System.in);
		int num2= scanner.nextInt();
		
		if (num2%2==0) {
			System.out.println(num2+" is even.");
		}
		
		scanner.nextLine();
		System.out.println("Enter your name: ");
		String name = scanner.next();
		
		if (name.equals("Khambadosh")) {
			System.out.println("Name matched.");
		}
		
		
		
		
	}

}
