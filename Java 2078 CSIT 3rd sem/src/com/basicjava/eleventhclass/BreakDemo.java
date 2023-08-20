package com.basicjava.eleventhclass;

public class BreakDemo {
	public static void main(String[] args) {
		
		//type 1
		System.out.println("\nFirst Type");
		for (int i=0;i<10;i++) {
			if (i==2) {
			System.out.println("value : "+i);
			break;
			}
		}
		
		System.out.println("\nNext Type");
		
		for (int i=0;i<10;i++) {
			for (int j=0;j<5;j++) {
				if (i==3 && j==3) {
					break;
				}
				System.out.println(i+" , "+j);
			}
		}
		
		

		
	}
}
