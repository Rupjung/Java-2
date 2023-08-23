package com.basicjava.thirdclass;

public class StaticVariableDemo {
	private static String collegeName;
	private static int rollNo;
	private static double amount;
	private static boolean gender;
	public static String phoneNo;
	static int age;
		public static void showData() {
			System.out.println("College Name : "+collegeName);
			System.out.println("RollNo: "+rollNo);
		}
		
		public static void main(String[] args) {
			
			collegeName="Texas International COllege";
			rollNo=12;
			age=12;
			
			StaticVariableDemo.showData();
			/*System.out.println("Default value for string : "+collegeName);
			System.out.println("Default value for int : "+rollNo);
			System.out.println("Default value for double : "+amount);
			System.out.println("Default value for boolean : "+gender);*/
			
		}
	
}
