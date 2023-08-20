package com.basicjava.seventhclass;

import java.util.Scanner;

public class SimulateAtmMachine {
	
	static double balance=1000;

	public static void displayMenu(Scanner scanner) {
		System.out.println("1.Deposit");
		System.out.println("2.Withdraw");
		System.out.println("3.Check Balance");
		System.out.println("4.Exit");
		
		System.out.println("Enter your choice: ");
		int choice = scanner.nextInt();
		
		if (choice==1) {
			depositAmount(scanner);
		}
		else if (choice == 2) {
			withdraw(scanner);
		}
		else if (choice == 3) {
			checkBalance();
		}
		else if (choice == 4) {
			return;
		}
		else
		{
			System.out.println("Invalid operation!");
		}
	}	
	private static void checkBalance() {
		System.out.println("Total Balance is : "+balance);
		
	}
	private static void withdraw(Scanner scanner) {
		System.out.println("Enter the amount you want to withdraw:");
		double withdrawal= scanner.nextDouble();
		
		if (balance>500 && withdrawal>500) {
		
		balance-=withdrawal;
		
		System.out.println("Successfully Withdraw");
		System.out.println("Withdraw Amount : "+withdrawal);
		System.out.println("Remaining Balance : "+balance);
		}
		else {
			System.out.println("Not sufficient balance");
		}
		
		
	}
	private static void depositAmount(Scanner scanner) {
		System.out.println("Enter your amount:");
		double depositAmount = scanner.nextDouble();
		
		balance += depositAmount;
		
		checkBalance();
		
	}
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		displayMenu(scanner);
	}
}
