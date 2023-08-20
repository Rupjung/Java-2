package com.basicjava.sixthclass;

public class FindResult {
	public static void main(String[] args) {
		float sub1=50f, sub2=60f, sub3=65f, sub4=78f, sub5=88f;
		float obtainedMarks= sub1+sub2+sub3+sub4+sub5;
		float totalMarks=500.0f;
		float percent = obtainedMarks/totalMarks*100;
		
		
		
		if (percent>=0 && percent<=100) {
			checker(percent);
		}
		else {
			System.out.println("Invalid marks.");
		}
	}
	public static void checker(float percent) {
		if (percent>=40 && percent<50) {
			System.out.println("Result: Third Division");
			return;
		}
		if (percent>=50 && percent<60) {
			System.out.println("Result: Second Division");
		}
		if (percent>=60 && percent<80) {
			System.out.println("Result: First Division");
		}
		if (percent>=80 && percent<=100) {
			System.out.println("Result: Distinction");
		}
		if (percent<40) {
			System.out.println("Result: Fail");
		}
	}
}
