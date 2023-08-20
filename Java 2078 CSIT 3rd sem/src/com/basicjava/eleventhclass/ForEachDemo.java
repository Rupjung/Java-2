package com.basicjava.eleventhclass;

public class ForEachDemo {
	public static void main(String[] args) {
		
		String[] collegeNames = {"Texas","Abc", "Xyz"}; //Array declaration
		System.out.println("Name at index 0 :"+collegeNames[0]);
		
		/*String[] data = new String[10]; //Array Initialization
		data[0] = "Apple";*/
		
		System.out.println("Using for each loop");
		for (String data : collegeNames) {
			System.out.println(data);
		}
	}
}
