package com.basicjava.ninthclass;

import java.util.Scanner;

public class ParkingSystemUsingWhile {
	int carNum, carTotalCapacity=100, bikeTotalCapacity=300, availableCarSpace, availableBikeSpace;
	long bikeTokenNo=000, carTokenNo=000;
	public void showMenu(Scanner scanner) {
		while(true) {
		System.out.println("Welcome to the parking system! Please enter an option:");
		System.out.println("1.Park-in");
		System.out.println("2.Park-out");
		System.out.println("3.Display parking slot");
		System.out.println("4.Exit");
		
		int choice;
		choice=scanner.nextInt();
		switch(choice) {
		case 1:
			Parkin(scanner);
			break;
		case 2:
			Parkout(scanner);
			break;
		case 3:
			Display();
			break;
		case 4:
			return;
		}
		
	}
		}
	
	private void Display() {
		System.out.println("Bike total capacity: "+bikeTotalCapacity);
		System.out.println("Car total capacity: "+carTotalCapacity);
		System.out.println("Bike available spacce: "+availableBikeSpace);
		System.out.println("Car total capacity: "+availableCarSpace);
		
	}

	private void Parkout(Scanner scanner) {
		int parkoutChoice;
		System.out.println("Do you want to park-out:\n1.Bike\n2.Car");
		parkoutChoice=scanner.nextInt();
		if (parkoutChoice==1) {
			
			System.out.println("Enter you token");
			Long inputToken=scanner.nextLong();
			
			if (inputToken==bikeTokenNo) {
				
			bikeTotalCapacity+=1;
			availableBikeSpace-=1;
			bikeTokenNo--;
			
			System.out.println("Bike parked-out successfully.");
			}
			else {
				System.out.println("Invalid token");
			}
			
		}
		else if (parkoutChoice==2) {
			System.out.println("Enter you token");
			Long inputToken=scanner.nextLong();
			
			if (inputToken==carTokenNo) {
			carTotalCapacity-=1;
			availableCarSpace+=1;
			carTokenNo--;
			
			System.out.println("Car parked-out successfully.");
		}
			else {
				System.out.println("Invalid token");
			}
		}
		else {
			System.out.println("Invalid option.");
		}
		
	}
		

	private void Parkin(Scanner scanner) {
		int parkingChoice;
		System.out.println("Do you want to park:\n1.Bike\n2.Car");
		parkingChoice=scanner.nextInt();
		if (parkingChoice==1) {
			bikeTotalCapacity-=1;
			availableBikeSpace+=1;
			bikeTokenNo++;
			
			System.out.println("Bike parked successfully.");
			System.out.println("Your token number is: "+bikeTokenNo);
			
		}
		else if (parkingChoice==2) {
			carTotalCapacity-=1;
			availableCarSpace+=1;
			carTokenNo++;
			System.out.println("Car parked successfully.");
			System.out.println("Your token number is: "+carTokenNo);
		}
		else {
			System.out.println("Invalid option.");
		}
		
	}

	public static void main(String[] args) {
		Scanner scanner= new Scanner(System.in);
		
		ParkingSystemUsingWhile parkobj = new ParkingSystemUsingWhile();
		
		parkobj.showMenu(scanner);
		scanner.close();
		
	}
}
