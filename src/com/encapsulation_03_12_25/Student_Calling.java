package com.encapsulation_03_12_25;

public class Student_Calling {

	
	public static void main(String[] args) {
		Student s = new Student();
		s.setRollNo(122);
		s.setName("sumedh");
		s.setAge(23);
		System.out.println("Roll NO " + s.getRollNo());
		System.out.println("Name  " + s.getName());
		System.out.println("Age  " + s.getAge());

	}

}
