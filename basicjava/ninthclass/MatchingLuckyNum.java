package com.basicjava.ninthclass;

import java.util.Scanner;

public class MatchingLuckyNum {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int luckyNum = 99, inputNum, count = 1;

		System.out.println("Enter a number between 1 and 100");
		do {
			inputNum = scanner.nextInt();
			if (inputNum == luckyNum) {
				System.out.println("Congrats! You won lottery.");
				return;
			}else {
				System.out.println("Try Again");
			}
			count++;
		} while (count <= 3);
		System.out.println("You lost lottery.");
		scanner.close();
	}

}
