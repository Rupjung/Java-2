package com.basicjava.twelvethclass;

import java.util.Scanner;

public class SumOfPositiveIntegers {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int userInput, sum=0, n;
		System.out.print("Enter the number of inputs: ");
		n=scanner.nextInt();
		System.out.println("Enter the numbers one by one: ");
		for(int i=1; i<=n; i++) {
		userInput = scanner.nextInt();
		if (userInput<0) {
			break;
		}
		sum=sum+userInput;
		}
		System.out.println("Sum of positive inputs is "+sum+".");
		scanner.close();
	}
}
