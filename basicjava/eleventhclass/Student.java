package com.basicjava.eleventhclass;

public class Student {
	
	//This class is model (i.e attributes, getter and setter)
	//not plane object java class includes default constructor and sterilizer
	
	private String name;
	private String address;
	private int rollNo;
	
	
	
	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;					//name=name is ambiguous
	}



	public String getAddress() {
		return address;
	}



	public void setAddress(String address) {
		this.address = address;
	}



	public int getRollNo() {
		return rollNo;
	}



	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}



	
}
