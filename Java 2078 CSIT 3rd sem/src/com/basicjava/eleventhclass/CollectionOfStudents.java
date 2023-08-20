package com.basicjava.eleventhclass;

public class CollectionOfStudents {
	public static void main(String[] args) {
		
		Student[] students = new Student[2];
		
		Student student1 = new Student();
		student1.setName("Ram Pandey");
		student1.setAddress("Kathmandu");
		student1.setRollNo(1);
		students[0]=student1;
		
		Student student2 = new Student();
		student2.setName("Sita Pandey");
		student2.setAddress("Bhaktapur");
		student2.setRollNo(2);
		students[1]=student2;
		
		//for each
		for (Student student : students) {
			System.out.println("Name: "+student.getName());
			System.out.println("Address: "+student.getAddress());
			System.out.println("RollNo: "+student.getRollNo());
			System.out.println("\n");
		}
	}
}
