package com.basicjava.ninthclass;

import java.util.Scanner;

public class SwappingAndReversing {
	public static void main(String[] args) {
		String string1, string2, tempString;;
		
		Scanner scanner = new Scanner(System.in);
		
		
		int num1,num2,num3,tempNum1=0,tempNum2;
		
	
		
		//Swapping two strings
		
		System.out.println("Enter two strings:");
		string1=scanner.nextLine();
		string2=scanner.nextLine();
		
		
		System.out.println("Before swapping, String1: "+string1);
		System.out.println("Before swapping, String2: "+string2);
		
		
		tempString=string1;
		string1=string2;
		string2=tempString;
		
		
		System.out.println("After swapping, String1: "+string1);
		System.out.println("After swapping, String2: "+string2);
		
		
		//Swapping two nums without using third variable
		
		System.out.println("Enter two numbers:");
		num1=scanner.nextInt();
		num2=scanner.nextInt();
		
		System.out.println("Before swapping, num1 : "+num1);
		System.out.println("Before swapping, num2 : "+num2);
		
		num1=num1+num2;
		num2=num1-num2;
		num1=num1-num2;
		
		
		System.out.println("After swapping, num1 : "+num1);
		System.out.println("After swapping, num2 : "+num2);
		
		//Reversing a number
		
		System.out.println("Enter a number");
		num3=scanner.nextInt();
		tempNum2=num3;
		do {
			tempNum1=tempNum1*10+(tempNum2%10);
			tempNum2=tempNum2/10;
		}while(tempNum2!=0);
		
		System.out.println("Reverse of "+num3+" is "+tempNum1);
		
		scanner.close();
		
	}
}
