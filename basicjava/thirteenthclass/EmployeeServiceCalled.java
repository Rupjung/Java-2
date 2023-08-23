package com.basicjava.thirteenthclass;

public class EmployeeServiceCalled {
	
	public static void main(String[] args) {
		Employee employee = new Employee();
		employee.setId(1);
		employee.setName("Rupjung");
		employee.setIncome(123456.77);
		employee.setTax(234.0);
		
		//Data binding
		EmployeeService employeeService = new EmployeeService(employee);
		employeeService.displayEmployee();
	}
}
