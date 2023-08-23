package com.basicjava.eightclass;

import java.util.Scanner;

public class ParkingSystem {
	private int carTotalCapacity=200, bikeTotalCapacity=1000;
	int SpaceOccupiedByCar=0, SpaceOccupiedByBike=0;
	public  void parkin(int parking) {
		if (parking==1) {
			bikeTotalCapacity-=parking;
			show();
		}
		else if (parking==2){
			carTotalCapacity-=parking;
			show();
		}
		else {
			System.out.println("Invalid Option");
		}
		
	}
	public void parkout(int withdrawing) {
		if (withdrawing==1) {
			bikeTotalCapacity+=withdrawing;
			show();
		}
		else if (withdrawing==2){
			carTotalCapacity+=withdrawing;
			show();
		}
		else {
			System.out.println("Invalid Option");
		}
		
	}
	public  void show() {
		System.out.println("Available Space:\nFor Bike: "+bikeTotalCapacity+"\nFor Car: "+carTotalCapacity);
	}
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		ParkingSystem obj = new ParkingSystem();
		
		System.out.println("Enter an option:");
		System.out.println("1.In Park");
		System.out.println("2.Out Park");
		System.out.println("3.Show available space");
		System.out.println("4.Exit");
		
		int choice = scanner.nextInt();
		switch(choice) {
		case 1:
			System.out.println("Do you want to park:\n1.Bike\n2.Car");
			int parking= scanner.nextInt();
			obj.parkin(parking);
			break;
		case 2:
			System.out.println("Do you want to take out:\n1.Bike\n2.Car");
			int parkingout = scanner.nextInt();
			obj.parkout(parkingout);
			break;
		case 3:
			obj.show();
			break;
		case 4:
			scanner.close();
			return;
		default:
			System.out.println("Invalid option");
		}
		scanner.close();
		
	}
}
