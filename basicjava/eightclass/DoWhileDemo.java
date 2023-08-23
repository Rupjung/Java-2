package com.basicjava.eightclass;

import java.util.Scanner;

public class DoWhileDemo {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the number for which you want multiplication table:");
		int multiplicand= scanner.nextInt();
		
		int multiplier = 1;
		
		System.out.println("\nMultiplication table for "+multiplicand+" is:");
		do {
			System.out.println(multiplicand+" x "+multiplier+" = "+multiplicand*multiplier);
			multiplier+=1;
		}while(multiplier<=10);
		scanner.close();
	}
}
