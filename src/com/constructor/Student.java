package com.constructor;

public class Student {
	
	String name;
	int age;
	long grNo;
	
	public Student(String name, int age,long grNo) {
		
		this.name = name;
		this.age = age;
		this.grNo = grNo;
		this.stud();
	
	}
	void stud() {
		
		System.out.println("Student Name = "+name);
		System.out.println("Student age =  " + age);
		System.out.println("Student GR.No = "+ grNo);
		
		
	}

}
