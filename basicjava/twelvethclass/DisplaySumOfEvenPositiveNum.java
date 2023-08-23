package com.basicjava.twelvethclass;

import java.util.Scanner;

public class DisplaySumOfEvenPositiveNum {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int n, sum=0, userInput;
		System.out.print("Enter the number of inputs: ");
		n=scanner.nextInt();
		System.out.println("Enter the numbers one by one:");
		for (int i=0;i<n;i++) {
			userInput=scanner.nextInt();
			if (userInput<0) {
				continue;
			}
			if (userInput%2==0) {
				sum+=userInput;
			}
			
		}
		System.out.println("The sum of even positive numbers is "+sum+".");
		scanner.close();
	}
}
