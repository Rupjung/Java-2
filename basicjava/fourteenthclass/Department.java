package com.basicjava.fourteenthclass;

public class Department {
	private int id;
	private String name;
	private String address;
	private String email;
	private int phoneNumber;
	
	public Department(int id, String name, String address, String email, int phoneNumber) {
		setId(id);
		setName(name);
		setAddress(address);
		setEmail(email);
		setPhoneNumber(phoneNumber);
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(int phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public void showInfo() {
		System.out.println("ID : "+getId());
		System.out.println("Name : "+getName());
		System.out.println("Address : "+getAddress());
		System.out.println("Phone Number : "+getPhoneNumber());
		System.out.println("Email : "+getEmail());
	}
	
	public static void main(String[] args) {
		Department department = new Department(12, "IT Dept", "Mitrapark","itdep@12.com",129665);
		department.showInfo();
	}
	
	

}
