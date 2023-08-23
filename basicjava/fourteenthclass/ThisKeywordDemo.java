package com.basicjava.fourteenthclass;

public class ThisKeywordDemo {
	private int id;
	private String name;
	private double income;
	
	public ThisKeywordDemo() {
		id=1;
		name="";
		income=0;
	}
	
	public ThisKeywordDemo(int id, String name, double income) {
		this();			//Calls default constructor //this() is always on first statement of constructor
		this.id=id;
		this.name=name;
		this.income=income;
		
		//this can be used to pass as an argument in the method call
		this.setInfo(this);
		
	}
	
	public void setInfo(ThisKeywordDemo obj) {
		obj.showInfo();
	}
	
	
	public void showInfo() {
		System.out.println("Id : "+id);
		System.out.println("Name : "+name);
		System.out.println("Income : "+income);
	}
	
	public static void main(String[] args) {
	    new ThisKeywordDemo(13, "Rup Jung Malla",350000.8);
	}
}
