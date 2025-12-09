package com.pratice_question_05_12_25;

public class EmployeeSalary_Called {
	public static void main(String[] args) {
		EmployeeSalary e = new EmployeeSalary("Sumedh Hajare", 40000);

		e.increment();
		System.out.println("Final Salary: " + e.getSalary());
	}
}