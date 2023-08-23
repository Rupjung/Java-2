package com.basicjava.fourthclass;

import java.util.Scanner;

public class getInputFromUser {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		/*System.out.println("Enter a number : ");
		int num1 = scanner.nextInt();
		
		System.out.println("Entered number is : "+num1);*/
		
		
		System.out.println("Enter your first name : ");
		String firstName= scanner.nextLine();
		
		System.out.println("Enter your middle name : ");
		String middleName = scanner.nextLine();
		
		System.out.println("Enter your last name : ");
		String lastName = scanner.nextLine();
		
		System.out.println("Enter your roll number : ");
		int rollNo = scanner.nextInt();
		
		System.out.println("Enter your age");
		int age = scanner.nextInt();
		
		System.out.println("Enter your address : ");
		scanner.nextLine();
		String address = scanner.nextLine();
		
		System.out.println("Enter your gender : ");
		char gender = scanner.nextLine().charAt(0);
		
		System.out.println("Your details:");
		System.out.println("First name : "+firstName);
		System.out.println("Middle name : "+middleName);
		System.out.println("Last name : "+lastName);
		System.out.println("Roll number : "+rollNo);
		System.out.println("Age : "+age);
		System.out.println("Address : "+address);
		System.out.println("Gender : "+gender);
		
		scanner.close();
		
		
	}
}
