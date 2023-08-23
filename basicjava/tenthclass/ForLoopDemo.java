package com.basicjava.tenthclass;

public class ForLoopDemo {
	public static void main(String[] args) {
		System.out.println("The even numbers between 1 to 100 are:");
		for (int i=2;i<100;i+=2) {
			System.out.print(i+", ");
		}
		System.out.println("\nThe odd numbers between 1 to 100 are:");
		for (int i=3;i<100;i+=2) {
			System.out.print(i+", ");
		}
		
	}
}
