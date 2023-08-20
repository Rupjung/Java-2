package com.basicjava.tenthclass;

public class MultiplicationTable {
	public static void main(String[] args) {
	for (int multiplicand=1;multiplicand<=10;multiplicand++) {
		System.out.println("Multiplication table for "+multiplicand);
		for (int multiplier=1; multiplier<=10; multiplier++) {
			System.out.println(multiplicand+" X "+multiplier+" = "+multiplier*multiplicand);
		}
		System.out.println();
	}
	}
}
