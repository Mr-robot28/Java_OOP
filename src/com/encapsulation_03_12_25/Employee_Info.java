package com.encapsulation_03_12_25;

public class Employee_Info {
	public static void main(String[] args) {

       
        Employee e = new Employee();

       
        e.setName("Sumedh Hajare");
        e.setEmployeeId(101);
        e.setSalary(500000);
        e.setDepartment("Software Development");

      
        System.out.println("Name        : " + e.getName());
        System.out.println("Employee ID : " + e.getEmployeeId());
        System.out.println("Salary      : " + e.getSalary());
        System.out.println("Department  : " + e.getDepartment());
    }
}
