package com.basicjava.thirteenthclass;

import java.util.Arrays;

public class PassByReferenceDemo {
	public void getData(String[] collegeNames) {
		collegeNames[0]="Texas College";
		collegeNames[1]="Times";
		
	}
	public static void main(String[] args) {
		String[] collegeNames = {"abc","XYZ","KU"};
		System.out.println("Before : "+Arrays.toString(collegeNames));
		
		PassByReferenceDemo obj = new PassByReferenceDemo();
		obj.getData(collegeNames);
		
		System.out.println("After : "+Arrays.toString(collegeNames));
	}
}
