package com.Introduction_25_11_2025;

public class Employee {

	int id;
	String name;
	double salary;
	int age;
	String department;
	String designation;
	String email;
	String phone;
	String address;
	String joiningDate;
	
	public static void main(String[] args) {
		 Employee e = new Employee();

	        e.id = 101;
	        e.name = "Sumedh";
	        e.salary = 85000;
	        e.age = 21;
	        e.department = "Software Development";
	        e.designation = "Java Developer";
	        e.email = "hajaresumedh90@gmail.com";
	        e.phone = "9130609707";
	        e.address = "Pune, Maharashtra";
	        e.joiningDate = "12-Jan-2026";

	        System.out.println("Employee ID        : " + e.id);
	        System.out.println("Employee Name      : " + e.name);
	        System.out.println("Employee Salary    : ₹" + e.salary);
	        System.out.println("Age                : " + e.age);
	        System.out.println("Department         : " + e.department);
	        System.out.println("Designation        : " + e.designation);
	        System.out.println("Email              : " + e.email);
	        System.out.println("Phone No.          : " + e.phone);
	        System.out.println("Address            : " + e.address);
	        System.out.println("Joining Date       : " + e.joiningDate);
	}

}
