package com.basicjava.thirdclass;

public class ArithmeticOperators {
	public static int add(int num1, int num2) {
		int result1 = num1+num2;
		return result1;
	}
	public  int subtract(int num1, int num2) {
		int result2 = num1-num2;
		return result2;
	}
	public static double div(double num1, double num2) {
		double result3 = (float) num1/num2;
		return result3;
	}
	public static int mul(int num1, int num2) {
		int result4 = num1*num2;
		return result4;
	}
	public int mod(int num1,int num2) {
		int result5 = num1%num2;
		return result5;
	}
	
	//Addition assignment
	public int addAssign(int num1, int num2) {
		num1+=num2;
		return num1;
	}
	
	//Subtraction assignment
	public static int subAssign(int num1) {
		int num=50;
		num-=num1;
		return num;
	}
	
	//Decrement
	public  static int decrement(int num2) {
		return num2--;
	}
	 
	public static void main(String[] args) {
		ArithmeticOperators demo = new ArithmeticOperators();
		int num1=20;
		int num2=30;
		int addResult= add(num1, num2);
		System.out.println(addResult);
		
		int mulResult = mul(num1, num2);
		System.out.println(mulResult);
		
		double divResult = div(12.3, 6.1);
		System.out.println(divResult);
		
		int subResult = demo.subtract(num1,num2);
		System.out.println(subResult);
		
		System.out.println("Result of addition assignment : "+demo.addAssign(num1,num2));
		
		System.out.println("Result of subtraction assignment : "+ArithmeticOperators.subAssign(num1));
		
		int decrementResult=decrement(num2);
		System.out.println("Before : "+num2);
		System.out.println("After decrement : "+decrementResult);
		
	}
}
