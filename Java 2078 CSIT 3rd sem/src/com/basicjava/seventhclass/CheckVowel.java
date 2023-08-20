package com.basicjava.seventhclass;

import java.util.Scanner;

public class CheckVowel {
	public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	
	System.out.println("Enter a character:");
	String sourceString = scanner.nextLine();
	char sourceChar = sourceString.charAt(0);
	char ch = sourceString.toLowerCase().charAt(0);
	
	//check vowel or consonant
	if (ch=='a'||ch=='e' || ch=='i' || ch=='o' || ch=='u') {
		System.out.println(sourceChar+" is vowel.");
	}
	else {
		System.out.println(sourceChar+" is consonant.");
	}
	
	
	//Check upper or lower
	if (sourceChar>='A' && sourceChar<='Z') {
		System.out.println(sourceChar+" is in upper case");
	}
	else {
		System.out.println(sourceChar+" is in lower case.");
	}
	
	
	scanner.close();
	
	}
}
 