package com.basicjava.tenthclass;

import java.util.Scanner;

public class CheckPascal {
	public int isPascal(int pascal, int num) {
		int result=0;
		for (int i=1;i<=num; i++) {
			result=result+i;
		}
		if (result==pascal)
			return 1;
		return 0;
	}
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		CheckPascal checkObj = new CheckPascal();
		
		System.out.println("Enter a pascal number:");
		int pascalNum=scanner.nextInt();
		System.out.println("Enter j:");
		int j=scanner.nextInt();
		
		int result=checkObj.isPascal(pascalNum,j);
		
		if (result==1)
			System.out.println("Integer argument is pascal number");
		else
			System.out.println("Integer argument is not pascal number");
		
		scanner.close();
		
	}
}
