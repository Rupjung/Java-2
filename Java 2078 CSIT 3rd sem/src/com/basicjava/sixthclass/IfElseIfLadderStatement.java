package com.basicjava.sixthclass;

public class IfElseIfLadderStatement {
	public static void main(String[] args){
		int data=230;
		
		if (data>230) {
			System.out.println("Inside the if block...");
			System.out.println(data+" is greater");
		}
		
		else if (data>231) {
			System.out.println("Inside the first elseif block....");
			System.out.println(data+" is greater");
		}
		else if (data>229) {
			System.out.println("Inside the second elseif block...");
			System.out.println(data+" is greater than 229");
		}
		else {
			System.out.println("Inside the else block");
			System.out.println("All the above condition is failed.");
		}
	}
}
