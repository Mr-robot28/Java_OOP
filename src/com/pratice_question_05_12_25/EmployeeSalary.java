package com.pratice_question_05_12_25;

public class EmployeeSalary {
	private String name;
	private double salary;

	EmployeeSalary(String name, double salary) {
		this.name = name;
		this.salary = salary;
	}

	void increment() {
		salary = salary + (salary * 0.10); 
	}

	double getSalary() {
		return salary;
	}
}