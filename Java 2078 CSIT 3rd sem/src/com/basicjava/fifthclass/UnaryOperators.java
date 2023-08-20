package com.basicjava.fifthclass;
import java.util.Scanner;

public class UnaryOperators {
	public static void main(String[] args) {
		int num;
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter a number: ");
		num=scanner.nextInt();
		
		System.out.println("Original Data : "+num);
		num=num++;
		System.out.println("After Postfix Increment : "+num);
		num=num--;
		System.out.println("After Postfix Decrement : "+num);
		
		System.out.println("Original Data : "+num);
		num=++num;
		System.out.println("After Prefix Increment : "+num);
		num=--num;
		System.out.println("After Prefix Decrement : "+num);
		
		num=+num;
		System.out.println("+"+num+" : "+num);
		
		num=-num;
		System.out.println("-"+num+" : "+num);
		
		
		
	}

}
