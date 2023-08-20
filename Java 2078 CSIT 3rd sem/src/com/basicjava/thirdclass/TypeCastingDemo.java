package com.basicjava.thirdclass;

public class TypeCastingDemo {
	public static void main(String[] args) {
		//Widening type casting
		int num1=34;
		double intToDouble = num1;
		
		System.out.println("Original number : "+num1);
		System.out.println("After performing WTC : "+intToDouble);
		
		//Narrowing type casting
		double num2 = 500.7890;
		int doubleToInt = (int) num2;
		
		System.out.println("Original Data : "+num2);
		System.out.println("After performing WTC : "+doubleToInt);
		
		//String conversion
		String data = "100";
		int stringToInt = Integer.valueOf(data);
		
		System.out.println("Original Data : "+data);
		System.out.println("After Performing StringToInt : "+stringToInt);
	
		double salary=4567.5678;
		String doubleToString = String.valueOf(salary);
		System.out.println("Original Data : "+salary);
		System.out.println("After Perfoming doubleToString : "+ doubleToString);
		
		char gender='M';
		String charToString = String.valueOf(gender);
		System.out.println(charToString);
		
		Double income = 4567.567;
		double DoubleTodouble = income.doubleValue();
		
		String incomeData = "3485.111";
		double dataResult = Double.parseDouble(incomeData);
		
		int dataResultToInt = Integer.parseInt(incomeData);
	}
}
