package com.basicjava.thirteenthclass;

public class ThisDemo {
	private int data1;
	private float data2;
	
	public void setData(int data1, float data2) {
		//current class instance variable
		this.data1=data1;
		this.data2=data2;
	}
	
	public void displayData() {
		
		//This can be used to call the current class methods (method chaining)
		this.setData(12, 15.5f);
		System.out.println("Data1 = "+data1+"\nData2 = "+data2);
	}
	
	public static void main(String[] args) {
		ThisDemo obj = new ThisDemo();
		obj.setData(12, 15.5f);
		obj.displayData();
	}
}
