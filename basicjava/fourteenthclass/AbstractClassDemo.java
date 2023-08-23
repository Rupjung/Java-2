package com.basicjava.fourteenthclass;

public abstract class AbstractClassDemo {
	
	String name;
	int id;
	
	public abstract void showData();					//method signature 
	public abstract String getData();					//method signature
	public abstract void setData(int id, String name); //method signature
	
	public AbstractClassDemo(String name, int id) {
		this.name=name;
		this.id=id;
	}
	//method body
	public void showInfo() {
		
	}
}
