package com.basicjava.tenthclass;

import java.util.Scanner;

public class FactorTwoCount {
	public int count=0;
	public  int factorTwoCount(int arg) {
		while(arg%2==0) {
			arg=arg/2;
			count++;
		}
		return count;
	}
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		FactorTwoCount obj = new FactorTwoCount();
		System.out.println("Enter a number");
		int inputData=scanner.nextInt();
		obj.factorTwoCount(inputData);
		System.out.println(inputData+" can be divided "+obj.count+" times by 2.");
		scanner.close();
	}
}
