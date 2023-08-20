package com.basicjava.fourthclass;

public class LogicalOperatorDemo {
	public static void main(String[] args) {
		int num1 = 10;
		int num2 = 20;
		
		//logical AND operator
		
		boolean result1 = num1>20 && num1>10; //10>20 && 10>10 //false && false
				
		boolean result2 = num1>20 && num2>10; //10>20 && 20>10 //false && true
		
		boolean result3 = num1<20 && num1<10; //10<20 && 10<10 //true && false
		
		boolean result4 = num2<20 && num2<10; //20<20 && 20<10 //false && false
		
		boolean result5 = num1>=10 && num2<=20; //10>=10 && 20<=20 //true && true 
	
		boolean result6 = num1==10 && num2==0; //10==10 && 20==0 //true && false
		
		boolean result7 = num1>100 && num2==20 && num1<num2; //10>100 && 20==20 && 10<20 //false && true && false
		
		System.out.println(result1);
		System.out.println(result2);
		System.out.println(result3);
		System.out.println(result4);
		System.out.println(result5);
		System.out.println(result6);
		System.out.println(result7);
		
		//logical OR operator
		boolean result8 = num1>20 || num1>10; //10>20 || 10>10 //false || false //false
		
		boolean result9 = num1>20 || num2>10; //10>20 || 20>10 //false || true //true
		
		boolean result10 = num1<20 || num1<10; //10<20 || 10<10 //true || false //true
		
		System.out.println(result8);
		System.out.println(result9);
		System.out.println(result10);
		
		
		//logical NOT operator
		int a=5;
		int b=6;
		
		System.out.println(!(a==b));
		System.out.println(a!=b);
		
		int n1=100;
		int n2=200;
		boolean result = (n1>=n2) || !(n1>n2) && (n2!=n1);
		System.out.println(result);
		
		
		
	}

}