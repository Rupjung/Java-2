package com.basicjava.fourthclass;

public class AssignmentOperatorDemo {
	public static void main(String[] args) {
		
		//Simple assignment operator
		int num1=10;
		int num2=20;
		int result=num1+num2;
		System.out.println("Result : "+result);
		
		//+= (Add and assignment operator)
		num2+=num1; //num2=num2+num1
		
		System.out.println("Num2: "+num2);
		
		//-= (Subtract and assignment operator)
		num2-=num1; 	//num2=num2-num1
		System.out.println("Num2: "+num2);
		
		
		//*= (Multiply and assignment operator)
		num2*=num1;   //num2=num2*num1
		System.out.println("Num2: "+num2);
		
		// /= (Divide and assignment operator)
		num2/=num1;  //num2=num2/num1
		System.out.println("Num2: "+num2);
		
		// %= (Modulus and assignment operator)
		num2%=num1;  //num2=num2%num1
		System.out.println("Num2: "+num2);
		
		// <<= leftshift and assignment operator
		num2=10;
		num2<<=2; //num2=num2<<2
		System.out.println("Num2: "+num2);
		
		
		
	}
}
