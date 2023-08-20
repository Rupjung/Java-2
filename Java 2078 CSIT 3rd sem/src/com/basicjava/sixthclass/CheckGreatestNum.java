package com.basicjava.sixthclass;

import java.util.Scanner;

public class CheckGreatestNum {
	public static void main(String[] args) {
		int num1,num2,num3;
		int result;
		
		System.out.println("Enter the three numbers: ");
		
		Scanner scanner = new Scanner(System.in);
		num1=scanner.nextInt();
		num2=scanner.nextInt();
		num3=scanner.nextInt();
		
		/*result = (num1>num2)? (num1>num3)? num1+" is greatest." : num3+ " is greatest." : (num2>num3)? num2+" is greatest.": num3+" is greatest.";
		System.out.println(result);*/
		
		checker(num1, num2, num3);
		checker(num2, num1, num3);
		checker(num3, num1, num2);
		//System.out.println(result+" is greatest.");
		scanner.close();
	}
	public static int checker(int num1, int num2, int num3) {
		if (num1>num2 && num1>num3) {
			System.out.println(num1+" is greatest.");
		}
		return 0;
	}
}
