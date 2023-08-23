package com.basicjava.twelvethclass;

import java.util.Scanner;


public class CollegeInfo {
		private String collegeName;
		private String collegeAdress;
		private String Email;

		public String displayCollegeDetails() {
			String result = "Name: " + collegeName + "Collegeaddress:" + collegeAdress + "Email:" + Email;
			return result;

		}

		public  void setCollegeDetails() {
			Scanner scanner = new Scanner(System.in);
			System.out.println("enter the college name:");
			collegeName = scanner.nextLine();
			System.out.println("Enter the address of the college:");
			collegeAdress = scanner.nextLine();
			System.out.println("Enter the Email of the college:");
			Email = scanner.nextLine();
			scanner.close();
		}

		public static void main(String[] args) {
			CollegeInfo collegeinfo = new CollegeInfo();
			collegeinfo.setCollegeDetails();
			String result = collegeinfo.displayCollegeDetails();
			System.out.println(result);

		}

	}
