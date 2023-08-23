package com.basicjava.tenthclass;

public class AsterikPyramid {
	public static void main(String[] args) {
		int rowIndex=1, columnIndex, l=1;
		
		
		//Using while loop
		System.out.println("Using while loop:");
		while (rowIndex<5) {
			 columnIndex=1;
			while (columnIndex<=rowIndex) {
				System.out.print("*\t");
				columnIndex++;
			}
			
			System.out.print("\n");
			rowIndex++;
		}
		
		
		//USing do while loop
		rowIndex=1;
		System.out.println("Using do-while loop:");
		do {
			 columnIndex=1;
			 do{
				System.out.print("*\t");
				columnIndex++;
			}while (columnIndex<=rowIndex);
			System.out.println();
			rowIndex++;
		}while(rowIndex<5);
	}
}
